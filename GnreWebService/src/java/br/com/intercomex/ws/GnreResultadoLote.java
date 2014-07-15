/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.intercomex.ws;

import br.gov.pe.gnre.TResultLoteGNRE;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.net.ssl.SSLContext;
import javax.xml.bind.annotation.XmlElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author helderklemp
 */
//@WebService(serviceName = "GnreResultadoLote",targetNamespace = "http://www.gnre.pe.gov.br")
@WebService(serviceName = "GnreResultadoLote")
public class GnreResultadoLote {

    DefaultHttpClient httpclient = new DefaultHttpClient();

    public static void main (String [] args)
    {
        
            XmlUtil util=new XmlUtil();
            
            //System.out.println("TO XML 2==="+util.convertToXml(lote, TLoteGNRE.class));
            
            TConsLote_GNRE lote=new TConsLote_GNRE();
            lote.setAmbiente("2");
            lote.setNumeroRecibo("1300049615");
            GnreResultadoLote ws=new GnreResultadoLote();
            //String retorno=ws.processar(lote);
            //String retorno="<soapenv:Envelope xmlns:soapenv=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><soapenv:Body><processarResponse xmlns=\"http://www.gnre.pe.gov.br/webservice/GnreLoteRecepcao\"><ns1:TRetLote_GNRE xmlns=\"http://www.gnre.pe.gov.br\" xmlns:ns1=\"http://www.gnre.pe.gov.br\"><ns1:ambiente>1</ns1:ambiente><ns1:situacaoRecepcao><ns1:codigo>100</ns1:codigo><ns1:descricao>Lote recebido com Sucesso</ns1:descricao><ns1:guiaErro>0</ns1:guiaErro></ns1:situacaoRecepcao><ns1:recibo><ns1:numero>1308012869</ns1:numero><ns1:dataHoraRecibo>2013-11-12 16:49:53</ns1:dataHoraRecibo><ns1:tempoEstimadoProc>2000</ns1:tempoEstimadoProc></ns1:recibo></ns1:TRetLote_GNRE></processarResponse></soapenv:Body></soapenv:Envelope>";
            //String retorno="<?xml version=\"1.0\" encoding=\"UTF-8\"?><soapenv:Envelope xmlns:soapenv=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><soapenv:Body><soapenv:Fault><soapenv:Code><soapenv:Value>soapenv:Server.userException</soapenv:Value></soapenv:Code><soapenv:Reason><soapenv:Text xml:lang=\"en\">java.rmi.RemoteException: Erro ao gerar XML de resposta</soapenv:Text></soapenv:Reason><soapenv:Detail><ns1:hostname xmlns:ns1=\"http://xml.apache.org/axis/\">sf025870.sefaz.pe.gov.br</ns1:hostname></soapenv:Detail></soapenv:Fault></soapenv:Body></soapenv:Envelope>";
            
            //TResultLoteGNRE result=ws.consultarSimplesHomoloacao("1300049615");
            //if(result!=null)
            //{
                System.out.println("OK ==="+ws.consultarSimples("1308310762"));
            //}else{
             //   System.out.println("ERRO ===");
            //}
            
            
    }

    
    String url = null;
    
    String action = null;
    String caminhoDoCertificadoDoCliente = null;
    String senhaDoCertificadoDoCliente = null;
    String arquivoCacertsGeradoParaCadaEstado = null;
    private void loadConfig()
    {
        try {
            Properties properties = new Properties();
            properties.load(GnreLoteRecepcao.class.getResourceAsStream("/config.properties"));
            caminhoDoCertificadoDoCliente = properties.getProperty("caminhoDoCertificadoDoCliente");
            senhaDoCertificadoDoCliente = properties.getProperty("senhaDoCertificadoDoCliente");
            arquivoCacertsGeradoParaCadaEstado = properties.getProperty("arquivoCacertsGeradoParaCadaEstado");
            url = properties.getProperty("url");
            url = url+"/gnreWS/services/GnreResultadoLote";
            action = url+"/consultar";
            //String url = "https://www.gnre.pe.gov.br/gnreWS/services/GnreResultadoLote?wsdl";
            //String action = "http://www.gnre.pe.gov.br/gnreWS/services/GnreResultadoLote/consultar";
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GnreLoteRecepcao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GnreLoteRecepcao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    /**
     * This is a sample web service operation
     */
    //@WebMethod(operationName = "consultarLote")
    private TResultLoteGNRE consultarLote(@WebParam(name = "gnreDadosMsgLote") TConsLote_GNRE gnreDadosMsg) {
        TResultLoteGNRE retorno=null;
        loadConfig();
        try {
            //<TConsLote_GNRE xmlns="http://www.gnre.pe.gov.br"><ambiente>1</ambiente><numeroRecibo>2012314940</numeroRecibo></TConsLote_GNRE>
            String XML_DATA
                    = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:gnr=\"http://www.gnre.pe.gov.br/webservice/GnreResultadoLote\">"
                    + "<soap:Header><gnr:gnreCabecMsg><gnr:versaoDados>1.00</gnr:versaoDados></gnr:gnreCabecMsg></soap:Header>"
                   + " <soap:Body><gnr:gnreDadosMsg>"+gnreDadosMsg+"</gnr:gnreDadosMsg></soap:Body></soap:Envelope>";
            
            System.out.println("PARAMETRO envio ==== "+gnreDadosMsg);
            HttpPost httpPost = new HttpPost(url);
            httpPost.setHeader (new BasicHeader("Content-Type", "application/soap+xml;charset=UTF-8"));
            httpPost.setHeader (new BasicHeader("SOAPAction", action));
            StringEntity s = new StringEntity(XML_DATA, "UTF-8");
            httpPost.setEntity (s);
            FileInputStream instream = null;
            FileInputStream instreamTrust = null;
            KeyStore keyStore = KeyStore.getInstance("PKCS12");
            instream = new FileInputStream(new File(caminhoDoCertificadoDoCliente));
            keyStore.load(instream, senhaDoCertificadoDoCliente.toCharArray());
            
            
            KeyStore trustStore = KeyStore.getInstance("JKS");
            instreamTrust = new FileInputStream(new File(arquivoCacertsGeradoParaCadaEstado));
            trustStore.load(instreamTrust, senhaDoCertificadoDoCliente.toCharArray());
            
            SSLContextBuilder builder = SSLContexts.custom().loadTrustMaterial(trustStore);
            builder.loadKeyMaterial(keyStore, senhaDoCertificadoDoCliente.toCharArray());
            SSLContext sslcontext = builder.build();
            

            SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext,SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
            CloseableHttpClient httpclientSLL = HttpClients.custom().setSSLSocketFactory(sslsf).build();

            System.out.println("executing request" + httpPost.getRequestLine());
            System.out.println("Conteudo envio ==== "+XML_DATA);
            HttpResponse response = httpclientSLL.execute(httpPost);
            HttpEntity entity = response.getEntity();
            
            System.out.println("----------------------------------------");
            System.out.println(response.getStatusLine());
            if (entity != null) {
                System.out.println("Response content length: " + entity.getContentLength());
                String str=EntityUtils.toString(entity);
                System.out.println(str);
                XmlUtil util=new XmlUtil();
                retorno = util.getTResultLoteGNRE(str);
                
                
            }
            if (entity != null) {
                entity.consumeContent();
            }
            httpclient.getConnectionManager().shutdown();
            
            
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(GnreConfigUF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (KeyStoreException ex) {
            Logger.getLogger(GnreConfigUF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GnreConfigUF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GnreConfigUF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(GnreConfigUF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CertificateException ex) {
            Logger.getLogger(GnreConfigUF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnrecoverableKeyException ex) {
            Logger.getLogger(GnreConfigUF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (KeyManagementException ex) {
            Logger.getLogger(GnreConfigUF.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return retorno;
    }
    @WebMethod(operationName = "consultarSimples")
    public String consultarSimples(@WebParam(name = "nrRecibo")String nrRecibo)
    {
        String resultado=null;
        TResultLoteGNRE retorno=null;
        loadConfig();
        try {
            //<TConsLote_GNRE xmlns="http://www.gnre.pe.gov.br"><ambiente>1</ambiente><numeroRecibo>2012314940</numeroRecibo></TConsLote_GNRE>
            String XML_DATA
                    = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:gnr=\"http://www.gnre.pe.gov.br/webservice/GnreResultadoLote\">"
                    + "<soap:Header><gnr:gnreCabecMsg><gnr:versaoDados>1.00</gnr:versaoDados></gnr:gnreCabecMsg></soap:Header>"
                   + " <soap:Body><gnr:gnreDadosMsg><TConsLote_GNRE xmlns=\"http://www.gnre.pe.gov.br\"><ambiente>1</ambiente><numeroRecibo>"+nrRecibo+"</numeroRecibo></TConsLote_GNRE></gnr:gnreDadosMsg></soap:Body></soap:Envelope>";
            
            System.out.println("PARAMETRO envio ==== "+XML_DATA);
            HttpPost httpPost = new HttpPost(url);
            httpPost.setHeader (new BasicHeader("Content-Type", "application/soap+xml;charset=UTF-8"));
            httpPost.setHeader (new BasicHeader("SOAPAction", action));
            StringEntity s = new StringEntity(XML_DATA, "UTF-8");
            httpPost.setEntity (s);
            FileInputStream instream = null;
            FileInputStream instreamTrust = null;
            KeyStore keyStore = KeyStore.getInstance("PKCS12");
            instream = new FileInputStream(new File(caminhoDoCertificadoDoCliente));
            keyStore.load(instream, senhaDoCertificadoDoCliente.toCharArray());
            
            
            KeyStore trustStore = KeyStore.getInstance("JKS");
            instreamTrust = new FileInputStream(new File(arquivoCacertsGeradoParaCadaEstado));
            trustStore.load(instreamTrust, senhaDoCertificadoDoCliente.toCharArray());
            
            SSLContextBuilder builder = SSLContexts.custom().loadTrustMaterial(trustStore);
            builder.loadKeyMaterial(keyStore, senhaDoCertificadoDoCliente.toCharArray());
            SSLContext sslcontext = builder.build();
            

            SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext,SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
            CloseableHttpClient httpclientSLL = HttpClients.custom().setSSLSocketFactory(sslsf).build();

            System.out.println("executing request" + httpPost.getRequestLine());
            System.out.println("Conteudo envio ==== "+XML_DATA);
            HttpResponse response = httpclientSLL.execute(httpPost);
            HttpEntity entity = response.getEntity();
            
            System.out.println("----------------------------------------");
            System.out.println(response.getStatusLine());
            if (entity != null) {
                System.out.println("Response content length: " + entity.getContentLength());
                String str=EntityUtils.toString(entity);
                System.out.println(str);
                XmlUtil util=new XmlUtil();
                retorno = util.getTResultLoteGNRE(str);
                resultado=retorno.getResultado();
                
            }
            if (entity != null) {
                entity.consumeContent();
            }
            httpclient.getConnectionManager().shutdown();
            
            
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(GnreConfigUF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (KeyStoreException ex) {
            Logger.getLogger(GnreConfigUF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GnreConfigUF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GnreConfigUF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(GnreConfigUF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CertificateException ex) {
            Logger.getLogger(GnreConfigUF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnrecoverableKeyException ex) {
            Logger.getLogger(GnreConfigUF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (KeyManagementException ex) {
            Logger.getLogger(GnreConfigUF.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return resultado;
    }
    
    @WebMethod(operationName = "consultarSimplesHomoloacao")
    public String consultarSimplesHomoloacao(@WebParam(name = "nrRecibo")String nrRecibo)
    {
        String url_HML = "https://www.gnre-h.pe.gov.br/gnreWS/services/GnreResultadoLote?wsdl";
        String action_HML = "http://www.gnre-h.pe.gov.br/gnreWS/services/GnreResultadoLote/consultar";
        String resultado=null;
        TResultLoteGNRE retorno=null;
        loadConfig();
        try {
            //<TConsLote_GNRE xmlns="http://www.gnre.pe.gov.br"><ambiente>1</ambiente><numeroRecibo>2012314940</numeroRecibo></TConsLote_GNRE>
            String XML_DATA
                    = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:gnr=\"http://www.gnre.pe.gov.br/webservice/GnreResultadoLote\">"
                    + "<soap:Header><gnr:gnreCabecMsg><gnr:versaoDados>1.00</gnr:versaoDados></gnr:gnreCabecMsg></soap:Header>"
                   + " <soap:Body><gnr:gnreDadosMsg><TConsLote_GNRE xmlns=\"http://www.gnre.pe.gov.br\"><ambiente>2</ambiente><numeroRecibo>"+nrRecibo+"</numeroRecibo></TConsLote_GNRE></gnr:gnreDadosMsg></soap:Body></soap:Envelope>";
            
            System.out.println("PARAMETRO envio ==== "+XML_DATA);
            HttpPost httpPost = new HttpPost(url_HML);
            httpPost.setHeader (new BasicHeader("Content-Type", "application/soap+xml;charset=UTF-8"));
            httpPost.setHeader (new BasicHeader("SOAPAction", action_HML));
            StringEntity s = new StringEntity(XML_DATA, "UTF-8");
            httpPost.setEntity (s);
            FileInputStream instream = null;
            FileInputStream instreamTrust = null;
            KeyStore keyStore = KeyStore.getInstance("PKCS12");
            instream = new FileInputStream(new File(caminhoDoCertificadoDoCliente));
            keyStore.load(instream, senhaDoCertificadoDoCliente.toCharArray());
            
            
            KeyStore trustStore = KeyStore.getInstance("JKS");
            instreamTrust = new FileInputStream(new File(arquivoCacertsGeradoParaCadaEstado));
            trustStore.load(instreamTrust, senhaDoCertificadoDoCliente.toCharArray());
            
            SSLContextBuilder builder = SSLContexts.custom().loadTrustMaterial(trustStore);
            builder.loadKeyMaterial(keyStore, senhaDoCertificadoDoCliente.toCharArray());
            SSLContext sslcontext = builder.build();
            

            SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext,SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
            CloseableHttpClient httpclientSLL = HttpClients.custom().setSSLSocketFactory(sslsf).build();

            System.out.println("executing request" + httpPost.getRequestLine());
            System.out.println("Conteudo envio ==== "+XML_DATA);
            HttpResponse response = httpclientSLL.execute(httpPost);
            HttpEntity entity = response.getEntity();
            
            System.out.println("----------------------------------------");
            System.out.println(response.getStatusLine());
            if (entity != null) {
                System.out.println("Response content length: " + entity.getContentLength());
                String str=EntityUtils.toString(entity);
                System.out.println(str);
                XmlUtil util=new XmlUtil();
                retorno = util.getTResultLoteGNRE(str);
                resultado=retorno.getResultado();
                
            }
            if (entity != null) {
                entity.consumeContent();
            }
            httpclient.getConnectionManager().shutdown();
            
            
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(GnreConfigUF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (KeyStoreException ex) {
            Logger.getLogger(GnreConfigUF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GnreConfigUF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GnreConfigUF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(GnreConfigUF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CertificateException ex) {
            Logger.getLogger(GnreConfigUF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnrecoverableKeyException ex) {
            Logger.getLogger(GnreConfigUF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (KeyManagementException ex) {
            Logger.getLogger(GnreConfigUF.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return resultado;
    }
}
