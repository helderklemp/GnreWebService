/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.intercomex.ws;

import br.gov.pe.gnre.TResultLoteGNRE;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlUtil {

    public String convertToXml(Object source, Class... type) {
        String result;
        StringWriter sw = new StringWriter();
        try {
            JAXBContext carContext = JAXBContext.newInstance(type);
            Marshaller carMarshaller = carContext.createMarshaller();
            carMarshaller.setProperty("com.sun.xml.bind.xmlDeclaration", Boolean.FALSE);
            carMarshaller.marshal(source, sw);
            result = sw.toString();
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }

        return result;
    }

    public String nodeToString(Node node) {
        StringWriter sw = new StringWriter();
        System.out.println("no de entrada "+node.getFirstChild());
        //Node filho = node.getFirstChild();
        try {
            Transformer t = TransformerFactory.newInstance().newTransformer();
            t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            t.setOutputProperty(OutputKeys.INDENT, "yes");
            t.transform(new DOMSource(node.getFirstChild()), new StreamResult(sw));
        } catch (TransformerException te) {
            System.out.println("nodeToString Transformer Exception");
        }
        return sw.toString();
    }

    public Object convertToClass(Node source, Class type) {
        Object result;
        StringWriter sw = new StringWriter();
        try {
            JAXBContext carContext = JAXBContext.newInstance(type);
            Unmarshaller unmarshaller = carContext.createUnmarshaller();
            //carMarshaller.setProperty("com.sun.xml.bind.xmlDeclaration", Boolean.FALSE);
            result = unmarshaller.unmarshal(source, type);

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }

        return result;
    }

    public String extractValue(String xml, String xpathExpression) {
        String actual;
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            documentBuilderFactory.setNamespaceAware(true);
            documentBuilderFactory.setIgnoringElementContentWhitespace(true);
            DocumentBuilder docBuilder = documentBuilderFactory.newDocumentBuilder();

            byte[] bytes = xml.getBytes("UTF-8");
            InputStream inputStream = new ByteArrayInputStream(bytes);
            Document doc = docBuilder.parse(inputStream);

            XPathFactory xPathFactory = XPathFactory.newInstance();
            XPath xpath = xPathFactory.newXPath();

            actual = xpath.evaluate(xpathExpression, doc, XPathConstants.STRING).toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return actual;
    }

    public br.gov.pe.gnre.TRetLoteGNRE getTRetLoteGNRE(String xml) {
        br.gov.pe.gnre.TRetLoteGNRE result = null;
        try {

            byte[] bytes = xml.getBytes("UTF-8");
            InputStream inputStream = new ByteArrayInputStream(bytes);
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            documentBuilderFactory.setNamespaceAware(true);
            documentBuilderFactory.setIgnoringElementContentWhitespace(true);
            DocumentBuilder docBuilder = documentBuilderFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(inputStream);
            NodeList response = doc.getElementsByTagName("ns1:TRetLote_GNRE");
            if (response != null && response.getLength() > 0) {
                JAXBElement<br.gov.pe.gnre.TRetLoteGNRE> ret = (JAXBElement<br.gov.pe.gnre.TRetLoteGNRE>) convertToClass(response.item(0), br.gov.pe.gnre.TRetLoteGNRE.class);
                br.gov.pe.gnre.TRetLoteGNRE resultado = ret.getValue();
                result = resultado;

            }

        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(XmlUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XmlUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(XmlUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(XmlUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    
    public String getRecibo(String xml) {
        String result = null;
        try {

            byte[] bytes = xml.getBytes("UTF-8");
            InputStream inputStream = new ByteArrayInputStream(bytes);
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            documentBuilderFactory.setNamespaceAware(true);
            documentBuilderFactory.setIgnoringElementContentWhitespace(true);
            DocumentBuilder docBuilder = documentBuilderFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(inputStream);
            //Deve-se validar o codigo do retorno se for 100 ok, deve-se retornoar o numero do recibo
            NodeList numeroRetorno = doc.getElementsByTagName("ns1:codigo");
            if(numeroRetorno!=null)
            {
                JAXBElement<String> numero = (JAXBElement<String>) convertToClass(numeroRetorno.item(0), String.class);
                if("100".equals(numero.getValue())){
                    System.out.println("COD 100 ok");
                    NodeList response = doc.getElementsByTagName("ns1:numero");
                    if (response != null && response.getLength() > 0) {
                        JAXBElement<String> ret = (JAXBElement<String>) convertToClass(response.item(0), String.class);
                        result = ret.getValue();
                    }
                }else
                {
                    String detalheErro="Erro no processamento: COD "+numero.getValue();                    
                    NodeList response = doc.getElementsByTagName("ns1:descricao");
                    if (response != null && response.getLength() > 0) {
                        JAXBElement<String> ret = (JAXBElement<String>) convertToClass(response.item(0), String.class);
                        detalheErro=detalheErro.concat(" , DETALHE : "+ret.getValue());
                        result = detalheErro;
                    }
                }
            }
            

        }catch (UnsupportedEncodingException ex) {
            Logger.getLogger(XmlUtil.class.getName()).log(Level.SEVERE, null, ex);
            result="Erro Interno no servidor GNRE:java.rmi.RemoteException: Erro ao gerar XML de resposta";
        } 
        catch (java.lang.IllegalArgumentException ex) {
            Logger.getLogger(XmlUtil.class.getName()).log(Level.SEVERE, null, ex);
            result="Erro Interno no servidor GNRE:java.rmi.RemoteException: Erro ao gerar XML de resposta";
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XmlUtil.class.getName()).log(Level.SEVERE, null, ex);
            result="Erro Interno no servidor GNRE:java.rmi.RemoteException: Erro ao gerar XML de resposta";
        } catch (SAXException ex) {
            Logger.getLogger(XmlUtil.class.getName()).log(Level.SEVERE, null, ex);
            result="Erro Interno no servidor GNRE:java.rmi.RemoteException: Erro ao gerar XML de resposta";
        } catch (IOException ex) {
            Logger.getLogger(XmlUtil.class.getName()).log(Level.SEVERE, null, ex);
            result="Erro Interno no servidor GNRE:java.rmi.RemoteException: Erro ao gerar XML de resposta";
        }
        return result;
    }
    
    

    public TResultLoteGNRE getTResultLoteGNRE(String xml) {
        TResultLoteGNRE result = null;
        try {

            byte[] bytes = xml.getBytes("UTF-8");
            InputStream inputStream = new ByteArrayInputStream(bytes);
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            documentBuilderFactory.setNamespaceAware(true);
            documentBuilderFactory.setIgnoringElementContentWhitespace(true);
            DocumentBuilder docBuilder = documentBuilderFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(inputStream);
            NodeList response = doc.getElementsByTagName("ns1:TResultLote_GNRE");
            if (response != null && response.getLength() > 0) {
                JAXBElement<TResultLoteGNRE> ret = (JAXBElement<TResultLoteGNRE>) convertToClass(response.item(0), TResultLoteGNRE.class);
                result = ret.getValue();
            }

        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(XmlUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XmlUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(XmlUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(XmlUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    public static void main (String [] args)
    {
        String xml="<ns2:consultarLoteResponse xmlns:ns2=\"http://www.gnre.pe.gov.br\">\n" +
"         <return>\n" +
"            <ns2:ambiente>1</ns2:ambiente>\n" +
"            <ns2:numeroRecibo>1308310762</ns2:numeroRecibo>\n" +
"            <ns2:situacaoProcess>\n" +
"               <ns2:codigo>403</ns2:codigo>\n" +
"               <ns2:descricao>Lote Processado com pendencias</ns2:descricao>\n" +
"            </ns2:situacaoProcess>\n" +
"            <ns2:resultado>020202610100016713083107620\n" +
"100013MG10005620010286734000132EMC EMPREENDIMENTOS IMOBILIARIOS LTDA                       AVENIDA BIAS FORTES 932 - CONJ 201 - LOURDES                BELO HORIZONTE                                    MG301700110000000000000000000000000000                                                                                                                                                                                                                                                                                                                 000000001314834209                                                                                                                                                                                                                                                                                                                                          1111201300000000       000000000000000600000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000002000000000000000000000000000                                                                                                                              \n" +
"20001                              703Falha na validacao do retorno da UF: XML de retorno da UF vazio                                                                                                                                                                                                                                                                                                    \n" +
"9130831076200017e9346da06c3aba0c8b965f07613eb5d36de78a0bd76b00bf8d7553a15c4f136</ns2:resultado>\n" +
"         </return>\n" +
"      </ns2:consultarLoteResponse>";
        XmlUtil util=new XmlUtil();
        System.out.println("Result "+util.extractValue(xml,"/*/resultado"));
        //System.out.println("Result "+util.extractValue(xml,"*/numeroRecibo"));
        
        
        
        
    }
}
