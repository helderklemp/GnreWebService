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

/**
 *
 * @author helderklemp
 */
@WebService(serviceName = "GnreConfigUF")
public class GnreConfigUF {

    DefaultHttpClient httpclient = new DefaultHttpClient();
     public static void main (String [] args)
    {
        
            GnreConfigUF consulta=new GnreConfigUF();
            TConsultaConfigUf param=new TConsultaConfigUf();
            param.setAmbiente("1");
            param.setReceita("100048");
            param.setUf("MG");
            consulta.consultar(param);
            
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
            url = url+"/gnreWS/services/GnreConfigUF";
            action = url+"/consultar";
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GnreLoteRecepcao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GnreLoteRecepcao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "consultar")
    public String consultar(@WebParam(name = "gnreDadosMsg") TConsultaConfigUf gnreDadosMsg) {
        String retorno=null;
        loadConfig();
        try {
            //<TConsultaConfigUf xmlns=\"http://www.gnre.pe.gov.br\"><ambiente>1</ambiente><uf>MG</uf><receita>100048</receita></TConsultaConfigUf>
             String XML_DATA
                    = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:gnr=\"http://www.gnre.pe.gov.br/webservice/GnreConfigUF\">"
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
            HttpResponse response = httpclientSLL.execute(httpPost);
            HttpEntity entity = response.getEntity();
            
            System.out.println("----------------------------------------");
            System.out.println(response.getStatusLine());
            if (entity != null) {
                System.out.println("Response content length: " + entity.getContentLength());
                retorno = EntityUtils.toString(response.getEntity());
                System.out.println(retorno);
                
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
}
