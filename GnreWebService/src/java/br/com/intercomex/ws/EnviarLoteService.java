/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.intercomex.ws;

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
import org.w3c.dom.Node;

/**
 *
 * @author helderklemp
 */
@WebService(serviceName = "EnviarLoteService")
public class EnviarLoteService {

    DefaultHttpClient httpclient = new DefaultHttpClient();
    
    
    public static void main (String [] args)
    {
        
            XmlUtil util=new XmlUtil();
            br.gov.pe.gnre.TLoteGNRE lote=new br.gov.pe.gnre.TLoteGNRE();
            br.gov.pe.gnre.TLoteGNRE.Guias guia=new br.gov.pe.gnre.TLoteGNRE.Guias();
            br.gov.pe.gnre.TLoteGNRE.Guias.TDadosGNRE dados=new br.gov.pe.gnre.TLoteGNRE.Guias.TDadosGNRE();
            dados.setC01UfFavorecida(br.gov.pe.gnre.TUf.MG);
            dados.setC02Receita("100056");
            dados.setC27TipoIdentificacaoEmitente("1");
            br.gov.pe.gnre.TLoteGNRE.Guias.TDadosGNRE.C03IdContribuinteEmitente id=new br.gov.pe.gnre.TLoteGNRE.Guias.TDadosGNRE.C03IdContribuinteEmitente();
            id.setCNPJ("10286734000132");
            dados.setC03IdContribuinteEmitente(id);
            dados.setC28TipoDocOrigem("04");
            dados.setC04DocOrigem("1314834209");
            dados.setC06ValorPrincipal("6.00");
            dados.setC14DataVencimento("2013-11-11");
            dados.setC16RazaoSocialEmitente("EMC EMPREENDIMENTOS IMOBILIARIOS LTDA");
            dados.setC18EnderecoEmitente("AVENIDA BIAS FORTES 932 - CONJ 201 - LOURDES");
            dados.setC19MunicipioEmitente("06200");
            dados.setC20UfEnderecoEmitente(br.gov.pe.gnre.TUf.MG);
            dados.setC21CepEmitente("30170011");
            dados.setC33DataPagamento("2013-11-11");
            //dados.setC42IdentificadorGuia("0506 / 2013");
            guia.getTDadosGNRE().add(dados);
            lote.setGuias(guia);
            
            
            
            //System.out.println("TO XML 2==="+util.convertToXml(lote, TLoteGNRE.class));
            
            
            GnreLoteRecepcao ws=new GnreLoteRecepcao();
            //String retorno=ws.processar(lote);
            //String retorno="<soapenv:Envelope xmlns:soapenv=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><soapenv:Body><processarResponse xmlns=\"http://www.gnre.pe.gov.br/webservice/GnreLoteRecepcao\"><ns1:TRetLote_GNRE xmlns=\"http://www.gnre.pe.gov.br\" xmlns:ns1=\"http://www.gnre.pe.gov.br\"><ns1:ambiente>1</ns1:ambiente><ns1:situacaoRecepcao><ns1:codigo>100</ns1:codigo><ns1:descricao>Lote recebido com Sucesso</ns1:descricao><ns1:guiaErro>0</ns1:guiaErro></ns1:situacaoRecepcao><ns1:recibo><ns1:numero>1308012869</ns1:numero><ns1:dataHoraRecibo>2013-11-12 16:49:53</ns1:dataHoraRecibo><ns1:tempoEstimadoProc>2000</ns1:tempoEstimadoProc></ns1:recibo></ns1:TRetLote_GNRE></processarResponse></soapenv:Body></soapenv:Envelope>";
            //String retorno="<?xml version=\"1.0\" encoding=\"UTF-8\"?><soapenv:Envelope xmlns:soapenv=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><soapenv:Body><soapenv:Fault><soapenv:Code><soapenv:Value>soapenv:Server.userException</soapenv:Value></soapenv:Code><soapenv:Reason><soapenv:Text xml:lang=\"en\">java.rmi.RemoteException: Erro ao gerar XML de resposta</soapenv:Text></soapenv:Reason><soapenv:Detail><ns1:hostname xmlns:ns1=\"http://xml.apache.org/axis/\">sf025870.sefaz.pe.gov.br</ns1:hostname></soapenv:Detail></soapenv:Fault></soapenv:Body></soapenv:Envelope>";
            
            br.gov.pe.gnre.TRetLoteGNRE result=ws.processar(lote);
            if(result!=null)
            {
                System.out.println("OK ==="+result.getRecibo().getNumero());
            }else{
                System.out.println("ERRO ===");
            }
            
            
    }
    
    String url = null;
    String action = null;
    //String caminhoDoCertificadoDoCliente = "/Users/helderklemp/Downloads/certificados/Certificados/INTERCOMEXLTDAEPP.pfx";
    //String senhaDoCertificadoDoCliente = "12345678";
    //String arquivoCacertsGeradoParaCadaEstado = "/Users/helderklemp/Downloads/certificados/myTrustStore";
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
            arquivoCacertsGeradoParaCadaEstado = properties.getProperty("arquivoCacertsGeradoParaCadaEstado");;
            url = properties.getProperty("url");
            url = url+"/gnreWS/services/GnreLoteRecepcao";
            action = url+"/processar";
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GnreLoteRecepcao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GnreLoteRecepcao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    
    
    @WebMethod(operationName = "processarLote")
    public String processarLote(@WebParam(name = "envioLote")Object TLoteGNRE) {
        return processarServico(TLoteGNRE,url,action);
    }
    
    @WebMethod(operationName = "processarLoteHomologacao")
    public String processarLoteHomologacao(@WebParam(name = "envioLote")Object TLoteGNRE) {
        String url_HML = "https://www.gnre-h.pe.gov.br/gnreWS/services/GnreLoteRecepcao";
        String action_HML = "http://www.gnre-h.pe.gov.br/gnreWS/services/GnreLoteRecepcao/processar";
        return processarServico(TLoteGNRE,url_HML,action_HML);
    }
    
    
    private String processarServico(Object TLoteGNRE,String urlParam,String actionParam)
    {
        
        br.gov.pe.gnre.TRetLoteGNRE retorno=null;
        String recibo =null;
        try {
            loadConfig();
            XmlUtil util=new XmlUtil();
            //<TConsultaConfigUf xmlns=\"http://www.gnre.pe.gov.br\"><ambiente>1</ambiente><uf>MG</uf><receita>100048</receita></TConsultaConfigUf>
           System.out.println("PARAMETRO envio ==== "+TLoteGNRE);
            //String gnreDadosMsgSTR= util.convertToXml(TLoteGNRE, br.gov.pe.gnre.TLoteGNRE.class);
            //String gnreDadosMsgSTR= TLoteGNRE;
           String gnreDadosMsgSTR= util.nodeToString((Node)TLoteGNRE);
            
            
             String XML_DATA
                    = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:gnr=\"http://www.gnre.pe.gov.br/webservice/GnreLoteRecepcao\">"
                    + "<soap:Header><gnr:gnreCabecMsg><gnr:versaoDados>1.00</gnr:versaoDados></gnr:gnreCabecMsg></soap:Header>"
                    + "<soap:Body><gnr:gnreDadosMsg>"+gnreDadosMsgSTR+"</gnr:gnreDadosMsg></soap:Body></soap:Envelope>";
            System.out.println("PARAMETRO envio ==== "+XML_DATA);
            
            HttpPost httpPost = new HttpPost(urlParam);
            httpPost.setHeader (new BasicHeader("Content-Type", "application/soap+xml;charset=UTF-8"));
            httpPost.setHeader (new BasicHeader("SOAPAction", actionParam));
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
            HttpResponse response = httpclientSLL.execute(httpPost);
            HttpEntity entity = response.getEntity();
            
            System.out.println("----------------------------------------");
            System.out.println(response.getStatusLine());
            if (entity != null) {
                System.out.println("Response content length: " + entity.getContentLength());
                String retornoStr = EntityUtils.toString(entity);
                System.out.println("Response  " + retornoStr);
                retorno = util.getTRetLoteGNRE(retornoStr);
                
                recibo=util.getRecibo(retornoStr);
                System.out.println("ResponseOBJ  " + recibo);
                
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
        
        
        
        return recibo;
    }
    
}
