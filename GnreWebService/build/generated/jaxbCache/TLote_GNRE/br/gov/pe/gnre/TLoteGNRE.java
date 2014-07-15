//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.5-2 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: PM.11.26 às 02:56:29 PM BRST 
//


package br.gov.pe.gnre;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guias">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TDadosGNRE" maxOccurs="3000">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="c01_UfFavorecida" type="{http://www.gnre.pe.gov.br}TUf"/>
 *                             &lt;element name="c02_receita" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="[0-9]{6}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="c25_detalhamentoReceita" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="[0-9]{6}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="c26_produto" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="[1-9]{1}[0-9]{0,3}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="c27_tipoIdentificacaoEmitente" type="{http://www.gnre.pe.gov.br}TIdentificacao" minOccurs="0"/>
 *                             &lt;element name="c03_idContribuinteEmitente" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;element name="CNPJ" type="{http://www.gnre.pe.gov.br}TCnpj"/>
 *                                       &lt;element name="CPF" type="{http://www.gnre.pe.gov.br}TCpf"/>
 *                                     &lt;/choice>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="c28_tipoDocOrigem" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="[0-9]{2}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="c04_docOrigem" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="[0-9]{1,18}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="c06_valorPrincipal" type="{http://www.gnre.pe.gov.br}TDec_1502" minOccurs="0"/>
 *                             &lt;element name="c10_valorTotal" type="{http://www.gnre.pe.gov.br}TDec_1502" minOccurs="0"/>
 *                             &lt;element name="c14_dataVencimento" type="{http://www.gnre.pe.gov.br}TData" minOccurs="0"/>
 *                             &lt;element name="c15_convenio" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
 *                                   &lt;maxLength value="30"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="c16_razaoSocialEmitente" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
 *                                   &lt;maxLength value="60"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="c17_inscricaoEstadualEmitente" type="{http://www.gnre.pe.gov.br}TIe" minOccurs="0"/>
 *                             &lt;element name="c18_enderecoEmitente" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
 *                                   &lt;maxLength value="60"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="c19_municipioEmitente" type="{http://www.gnre.pe.gov.br}TCodMunIBGE" minOccurs="0"/>
 *                             &lt;element name="c20_ufEnderecoEmitente" type="{http://www.gnre.pe.gov.br}TUf" minOccurs="0"/>
 *                             &lt;element name="c21_cepEmitente" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="[0-9]{8}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="c22_telefoneEmitente" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="[0-9]{6,11}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="c34_tipoIdentificacaoDestinatario" type="{http://www.gnre.pe.gov.br}TIdentificacao" minOccurs="0"/>
 *                             &lt;element name="c35_idContribuinteDestinatario" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;element name="CNPJ" type="{http://www.gnre.pe.gov.br}TCnpj"/>
 *                                       &lt;element name="CPF" type="{http://www.gnre.pe.gov.br}TCpf"/>
 *                                     &lt;/choice>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="c36_inscricaoEstadualDestinatario" type="{http://www.gnre.pe.gov.br}TIe" minOccurs="0"/>
 *                             &lt;element name="c37_razaoSocialDestinatario" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
 *                                   &lt;maxLength value="60"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="c38_municipioDestinatario" type="{http://www.gnre.pe.gov.br}TCodMunIBGE" minOccurs="0"/>
 *                             &lt;element name="c33_dataPagamento" type="{http://www.gnre.pe.gov.br}TData" minOccurs="0"/>
 *                             &lt;element name="c05_referencia" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="periodo" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;whiteSpace value="preserve"/>
 *                                             &lt;enumeration value="0"/>
 *                                             &lt;enumeration value="1"/>
 *                                             &lt;enumeration value="2"/>
 *                                             &lt;enumeration value="3"/>
 *                                             &lt;enumeration value="4"/>
 *                                             &lt;enumeration value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="mes" type="{http://www.gnre.pe.gov.br}TMes" minOccurs="0"/>
 *                                       &lt;element name="ano" type="{http://www.gnre.pe.gov.br}TAno" minOccurs="0"/>
 *                                       &lt;element name="parcela" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;whiteSpace value="preserve"/>
 *                                             &lt;pattern value="[1-9]{1}[0-9]{0,2}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="c39_camposExtras" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="campoExtra" maxOccurs="3">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="tipo" type="{http://www.gnre.pe.gov.br}TTipoCampoExtra"/>
 *                                                 &lt;element name="valor">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="100"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="c42_identificadorGuia" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
 *                                   &lt;maxLength value="10"/>
 *                                   &lt;pattern value="[0-9]{1,10}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "guias"
})
@XmlRootElement(name = "TLote_GNRE")
public class TLoteGNRE {

    @XmlElement(required = true)
    protected TLoteGNRE.Guias guias;

    /**
     * Obtém o valor da propriedade guias.
     * 
     * @return
     *     possible object is
     *     {@link TLoteGNRE.Guias }
     *     
     */
    public TLoteGNRE.Guias getGuias() {
        return guias;
    }

    /**
     * Define o valor da propriedade guias.
     * 
     * @param value
     *     allowed object is
     *     {@link TLoteGNRE.Guias }
     *     
     */
    public void setGuias(TLoteGNRE.Guias value) {
        this.guias = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="TDadosGNRE" maxOccurs="3000">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="c01_UfFavorecida" type="{http://www.gnre.pe.gov.br}TUf"/>
     *                   &lt;element name="c02_receita" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;pattern value="[0-9]{6}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="c25_detalhamentoReceita" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;pattern value="[0-9]{6}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="c26_produto" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;pattern value="[1-9]{1}[0-9]{0,3}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="c27_tipoIdentificacaoEmitente" type="{http://www.gnre.pe.gov.br}TIdentificacao" minOccurs="0"/>
     *                   &lt;element name="c03_idContribuinteEmitente" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice>
     *                             &lt;element name="CNPJ" type="{http://www.gnre.pe.gov.br}TCnpj"/>
     *                             &lt;element name="CPF" type="{http://www.gnre.pe.gov.br}TCpf"/>
     *                           &lt;/choice>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="c28_tipoDocOrigem" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;pattern value="[0-9]{2}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="c04_docOrigem" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;pattern value="[0-9]{1,18}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="c06_valorPrincipal" type="{http://www.gnre.pe.gov.br}TDec_1502" minOccurs="0"/>
     *                   &lt;element name="c10_valorTotal" type="{http://www.gnre.pe.gov.br}TDec_1502" minOccurs="0"/>
     *                   &lt;element name="c14_dataVencimento" type="{http://www.gnre.pe.gov.br}TData" minOccurs="0"/>
     *                   &lt;element name="c15_convenio" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
     *                         &lt;maxLength value="30"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="c16_razaoSocialEmitente" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
     *                         &lt;maxLength value="60"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="c17_inscricaoEstadualEmitente" type="{http://www.gnre.pe.gov.br}TIe" minOccurs="0"/>
     *                   &lt;element name="c18_enderecoEmitente" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
     *                         &lt;maxLength value="60"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="c19_municipioEmitente" type="{http://www.gnre.pe.gov.br}TCodMunIBGE" minOccurs="0"/>
     *                   &lt;element name="c20_ufEnderecoEmitente" type="{http://www.gnre.pe.gov.br}TUf" minOccurs="0"/>
     *                   &lt;element name="c21_cepEmitente" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;pattern value="[0-9]{8}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="c22_telefoneEmitente" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;pattern value="[0-9]{6,11}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="c34_tipoIdentificacaoDestinatario" type="{http://www.gnre.pe.gov.br}TIdentificacao" minOccurs="0"/>
     *                   &lt;element name="c35_idContribuinteDestinatario" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice>
     *                             &lt;element name="CNPJ" type="{http://www.gnre.pe.gov.br}TCnpj"/>
     *                             &lt;element name="CPF" type="{http://www.gnre.pe.gov.br}TCpf"/>
     *                           &lt;/choice>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="c36_inscricaoEstadualDestinatario" type="{http://www.gnre.pe.gov.br}TIe" minOccurs="0"/>
     *                   &lt;element name="c37_razaoSocialDestinatario" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
     *                         &lt;maxLength value="60"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="c38_municipioDestinatario" type="{http://www.gnre.pe.gov.br}TCodMunIBGE" minOccurs="0"/>
     *                   &lt;element name="c33_dataPagamento" type="{http://www.gnre.pe.gov.br}TData" minOccurs="0"/>
     *                   &lt;element name="c05_referencia" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="periodo" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;whiteSpace value="preserve"/>
     *                                   &lt;enumeration value="0"/>
     *                                   &lt;enumeration value="1"/>
     *                                   &lt;enumeration value="2"/>
     *                                   &lt;enumeration value="3"/>
     *                                   &lt;enumeration value="4"/>
     *                                   &lt;enumeration value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="mes" type="{http://www.gnre.pe.gov.br}TMes" minOccurs="0"/>
     *                             &lt;element name="ano" type="{http://www.gnre.pe.gov.br}TAno" minOccurs="0"/>
     *                             &lt;element name="parcela" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;whiteSpace value="preserve"/>
     *                                   &lt;pattern value="[1-9]{1}[0-9]{0,2}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="c39_camposExtras" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="campoExtra" maxOccurs="3">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="tipo" type="{http://www.gnre.pe.gov.br}TTipoCampoExtra"/>
     *                                       &lt;element name="valor">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="100"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="c42_identificadorGuia" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
     *                         &lt;maxLength value="10"/>
     *                         &lt;pattern value="[0-9]{1,10}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tDadosGNRE"
    })
    public static class Guias {

        @XmlElement(name = "TDadosGNRE", required = true)
        protected List<TLoteGNRE.Guias.TDadosGNRE> tDadosGNRE;

        /**
         * Gets the value of the tDadosGNRE property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tDadosGNRE property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTDadosGNRE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TLoteGNRE.Guias.TDadosGNRE }
         * 
         * 
         */
        public List<TLoteGNRE.Guias.TDadosGNRE> getTDadosGNRE() {
            if (tDadosGNRE == null) {
                tDadosGNRE = new ArrayList<TLoteGNRE.Guias.TDadosGNRE>();
            }
            return this.tDadosGNRE;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="c01_UfFavorecida" type="{http://www.gnre.pe.gov.br}TUf"/>
         *         &lt;element name="c02_receita" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[0-9]{6}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="c25_detalhamentoReceita" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[0-9]{6}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="c26_produto" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[1-9]{1}[0-9]{0,3}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="c27_tipoIdentificacaoEmitente" type="{http://www.gnre.pe.gov.br}TIdentificacao" minOccurs="0"/>
         *         &lt;element name="c03_idContribuinteEmitente" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice>
         *                   &lt;element name="CNPJ" type="{http://www.gnre.pe.gov.br}TCnpj"/>
         *                   &lt;element name="CPF" type="{http://www.gnre.pe.gov.br}TCpf"/>
         *                 &lt;/choice>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="c28_tipoDocOrigem" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[0-9]{2}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="c04_docOrigem" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[0-9]{1,18}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="c06_valorPrincipal" type="{http://www.gnre.pe.gov.br}TDec_1502" minOccurs="0"/>
         *         &lt;element name="c10_valorTotal" type="{http://www.gnre.pe.gov.br}TDec_1502" minOccurs="0"/>
         *         &lt;element name="c14_dataVencimento" type="{http://www.gnre.pe.gov.br}TData" minOccurs="0"/>
         *         &lt;element name="c15_convenio" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
         *               &lt;maxLength value="30"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="c16_razaoSocialEmitente" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
         *               &lt;maxLength value="60"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="c17_inscricaoEstadualEmitente" type="{http://www.gnre.pe.gov.br}TIe" minOccurs="0"/>
         *         &lt;element name="c18_enderecoEmitente" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
         *               &lt;maxLength value="60"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="c19_municipioEmitente" type="{http://www.gnre.pe.gov.br}TCodMunIBGE" minOccurs="0"/>
         *         &lt;element name="c20_ufEnderecoEmitente" type="{http://www.gnre.pe.gov.br}TUf" minOccurs="0"/>
         *         &lt;element name="c21_cepEmitente" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[0-9]{8}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="c22_telefoneEmitente" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[0-9]{6,11}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="c34_tipoIdentificacaoDestinatario" type="{http://www.gnre.pe.gov.br}TIdentificacao" minOccurs="0"/>
         *         &lt;element name="c35_idContribuinteDestinatario" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice>
         *                   &lt;element name="CNPJ" type="{http://www.gnre.pe.gov.br}TCnpj"/>
         *                   &lt;element name="CPF" type="{http://www.gnre.pe.gov.br}TCpf"/>
         *                 &lt;/choice>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="c36_inscricaoEstadualDestinatario" type="{http://www.gnre.pe.gov.br}TIe" minOccurs="0"/>
         *         &lt;element name="c37_razaoSocialDestinatario" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
         *               &lt;maxLength value="60"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="c38_municipioDestinatario" type="{http://www.gnre.pe.gov.br}TCodMunIBGE" minOccurs="0"/>
         *         &lt;element name="c33_dataPagamento" type="{http://www.gnre.pe.gov.br}TData" minOccurs="0"/>
         *         &lt;element name="c05_referencia" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="periodo" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;whiteSpace value="preserve"/>
         *                         &lt;enumeration value="0"/>
         *                         &lt;enumeration value="1"/>
         *                         &lt;enumeration value="2"/>
         *                         &lt;enumeration value="3"/>
         *                         &lt;enumeration value="4"/>
         *                         &lt;enumeration value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="mes" type="{http://www.gnre.pe.gov.br}TMes" minOccurs="0"/>
         *                   &lt;element name="ano" type="{http://www.gnre.pe.gov.br}TAno" minOccurs="0"/>
         *                   &lt;element name="parcela" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;whiteSpace value="preserve"/>
         *                         &lt;pattern value="[1-9]{1}[0-9]{0,2}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="c39_camposExtras" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="campoExtra" maxOccurs="3">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="tipo" type="{http://www.gnre.pe.gov.br}TTipoCampoExtra"/>
         *                             &lt;element name="valor">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="100"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="c42_identificadorGuia" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.gnre.pe.gov.br}TString">
         *               &lt;maxLength value="10"/>
         *               &lt;pattern value="[0-9]{1,10}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "c01UfFavorecida",
            "c02Receita",
            "c25DetalhamentoReceita",
            "c26Produto",
            "c27TipoIdentificacaoEmitente",
            "c03IdContribuinteEmitente",
            "c28TipoDocOrigem",
            "c04DocOrigem",
            "c06ValorPrincipal",
            "c10ValorTotal",
            "c14DataVencimento",
            "c15Convenio",
            "c16RazaoSocialEmitente",
            "c17InscricaoEstadualEmitente",
            "c18EnderecoEmitente",
            "c19MunicipioEmitente",
            "c20UfEnderecoEmitente",
            "c21CepEmitente",
            "c22TelefoneEmitente",
            "c34TipoIdentificacaoDestinatario",
            "c35IdContribuinteDestinatario",
            "c36InscricaoEstadualDestinatario",
            "c37RazaoSocialDestinatario",
            "c38MunicipioDestinatario",
            "c33DataPagamento",
            "c05Referencia",
            "c39CamposExtras",
            "c42IdentificadorGuia"
        })
        public static class TDadosGNRE {

            @XmlElement(name = "c01_UfFavorecida", required = true)
            protected TUf c01UfFavorecida;
            @XmlElement(name = "c02_receita")
            protected String c02Receita;
            @XmlElement(name = "c25_detalhamentoReceita")
            protected String c25DetalhamentoReceita;
            @XmlElement(name = "c26_produto")
            protected String c26Produto;
            @XmlElement(name = "c27_tipoIdentificacaoEmitente")
            protected String c27TipoIdentificacaoEmitente;
            @XmlElement(name = "c03_idContribuinteEmitente")
            protected TLoteGNRE.Guias.TDadosGNRE.C03IdContribuinteEmitente c03IdContribuinteEmitente;
            @XmlElement(name = "c28_tipoDocOrigem")
            protected String c28TipoDocOrigem;
            @XmlElement(name = "c04_docOrigem")
            protected String c04DocOrigem;
            @XmlElement(name = "c06_valorPrincipal")
            protected String c06ValorPrincipal;
            @XmlElement(name = "c10_valorTotal")
            protected String c10ValorTotal;
            @XmlElement(name = "c14_dataVencimento")
            protected String c14DataVencimento;
            @XmlElement(name = "c15_convenio")
            protected String c15Convenio;
            @XmlElement(name = "c16_razaoSocialEmitente")
            protected String c16RazaoSocialEmitente;
            @XmlElement(name = "c17_inscricaoEstadualEmitente")
            protected String c17InscricaoEstadualEmitente;
            @XmlElement(name = "c18_enderecoEmitente")
            protected String c18EnderecoEmitente;
            @XmlElement(name = "c19_municipioEmitente")
            protected String c19MunicipioEmitente;
            @XmlElement(name = "c20_ufEnderecoEmitente")
            protected TUf c20UfEnderecoEmitente;
            @XmlElement(name = "c21_cepEmitente")
            protected String c21CepEmitente;
            @XmlElement(name = "c22_telefoneEmitente")
            protected String c22TelefoneEmitente;
            @XmlElement(name = "c34_tipoIdentificacaoDestinatario")
            protected String c34TipoIdentificacaoDestinatario;
            @XmlElement(name = "c35_idContribuinteDestinatario")
            protected TLoteGNRE.Guias.TDadosGNRE.C35IdContribuinteDestinatario c35IdContribuinteDestinatario;
            @XmlElement(name = "c36_inscricaoEstadualDestinatario")
            protected String c36InscricaoEstadualDestinatario;
            @XmlElement(name = "c37_razaoSocialDestinatario")
            protected String c37RazaoSocialDestinatario;
            @XmlElement(name = "c38_municipioDestinatario")
            protected String c38MunicipioDestinatario;
            @XmlElement(name = "c33_dataPagamento")
            protected String c33DataPagamento;
            @XmlElement(name = "c05_referencia")
            protected TLoteGNRE.Guias.TDadosGNRE.C05Referencia c05Referencia;
            @XmlElement(name = "c39_camposExtras")
            protected TLoteGNRE.Guias.TDadosGNRE.C39CamposExtras c39CamposExtras;
            @XmlElement(name = "c42_identificadorGuia")
            protected String c42IdentificadorGuia;

            /**
             * Obtém o valor da propriedade c01UfFavorecida.
             * 
             * @return
             *     possible object is
             *     {@link TUf }
             *     
             */
            public TUf getC01UfFavorecida() {
                return c01UfFavorecida;
            }

            /**
             * Define o valor da propriedade c01UfFavorecida.
             * 
             * @param value
             *     allowed object is
             *     {@link TUf }
             *     
             */
            public void setC01UfFavorecida(TUf value) {
                this.c01UfFavorecida = value;
            }

            /**
             * Obtém o valor da propriedade c02Receita.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC02Receita() {
                return c02Receita;
            }

            /**
             * Define o valor da propriedade c02Receita.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC02Receita(String value) {
                this.c02Receita = value;
            }

            /**
             * Obtém o valor da propriedade c25DetalhamentoReceita.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC25DetalhamentoReceita() {
                return c25DetalhamentoReceita;
            }

            /**
             * Define o valor da propriedade c25DetalhamentoReceita.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC25DetalhamentoReceita(String value) {
                this.c25DetalhamentoReceita = value;
            }

            /**
             * Obtém o valor da propriedade c26Produto.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC26Produto() {
                return c26Produto;
            }

            /**
             * Define o valor da propriedade c26Produto.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC26Produto(String value) {
                this.c26Produto = value;
            }

            /**
             * Obtém o valor da propriedade c27TipoIdentificacaoEmitente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC27TipoIdentificacaoEmitente() {
                return c27TipoIdentificacaoEmitente;
            }

            /**
             * Define o valor da propriedade c27TipoIdentificacaoEmitente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC27TipoIdentificacaoEmitente(String value) {
                this.c27TipoIdentificacaoEmitente = value;
            }

            /**
             * Obtém o valor da propriedade c03IdContribuinteEmitente.
             * 
             * @return
             *     possible object is
             *     {@link TLoteGNRE.Guias.TDadosGNRE.C03IdContribuinteEmitente }
             *     
             */
            public TLoteGNRE.Guias.TDadosGNRE.C03IdContribuinteEmitente getC03IdContribuinteEmitente() {
                return c03IdContribuinteEmitente;
            }

            /**
             * Define o valor da propriedade c03IdContribuinteEmitente.
             * 
             * @param value
             *     allowed object is
             *     {@link TLoteGNRE.Guias.TDadosGNRE.C03IdContribuinteEmitente }
             *     
             */
            public void setC03IdContribuinteEmitente(TLoteGNRE.Guias.TDadosGNRE.C03IdContribuinteEmitente value) {
                this.c03IdContribuinteEmitente = value;
            }

            /**
             * Obtém o valor da propriedade c28TipoDocOrigem.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC28TipoDocOrigem() {
                return c28TipoDocOrigem;
            }

            /**
             * Define o valor da propriedade c28TipoDocOrigem.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC28TipoDocOrigem(String value) {
                this.c28TipoDocOrigem = value;
            }

            /**
             * Obtém o valor da propriedade c04DocOrigem.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC04DocOrigem() {
                return c04DocOrigem;
            }

            /**
             * Define o valor da propriedade c04DocOrigem.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC04DocOrigem(String value) {
                this.c04DocOrigem = value;
            }

            /**
             * Obtém o valor da propriedade c06ValorPrincipal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC06ValorPrincipal() {
                return c06ValorPrincipal;
            }

            /**
             * Define o valor da propriedade c06ValorPrincipal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC06ValorPrincipal(String value) {
                this.c06ValorPrincipal = value;
            }

            /**
             * Obtém o valor da propriedade c10ValorTotal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC10ValorTotal() {
                return c10ValorTotal;
            }

            /**
             * Define o valor da propriedade c10ValorTotal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC10ValorTotal(String value) {
                this.c10ValorTotal = value;
            }

            /**
             * Obtém o valor da propriedade c14DataVencimento.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC14DataVencimento() {
                return c14DataVencimento;
            }

            /**
             * Define o valor da propriedade c14DataVencimento.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC14DataVencimento(String value) {
                this.c14DataVencimento = value;
            }

            /**
             * Obtém o valor da propriedade c15Convenio.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC15Convenio() {
                return c15Convenio;
            }

            /**
             * Define o valor da propriedade c15Convenio.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC15Convenio(String value) {
                this.c15Convenio = value;
            }

            /**
             * Obtém o valor da propriedade c16RazaoSocialEmitente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC16RazaoSocialEmitente() {
                return c16RazaoSocialEmitente;
            }

            /**
             * Define o valor da propriedade c16RazaoSocialEmitente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC16RazaoSocialEmitente(String value) {
                this.c16RazaoSocialEmitente = value;
            }

            /**
             * Obtém o valor da propriedade c17InscricaoEstadualEmitente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC17InscricaoEstadualEmitente() {
                return c17InscricaoEstadualEmitente;
            }

            /**
             * Define o valor da propriedade c17InscricaoEstadualEmitente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC17InscricaoEstadualEmitente(String value) {
                this.c17InscricaoEstadualEmitente = value;
            }

            /**
             * Obtém o valor da propriedade c18EnderecoEmitente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC18EnderecoEmitente() {
                return c18EnderecoEmitente;
            }

            /**
             * Define o valor da propriedade c18EnderecoEmitente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC18EnderecoEmitente(String value) {
                this.c18EnderecoEmitente = value;
            }

            /**
             * Obtém o valor da propriedade c19MunicipioEmitente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC19MunicipioEmitente() {
                return c19MunicipioEmitente;
            }

            /**
             * Define o valor da propriedade c19MunicipioEmitente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC19MunicipioEmitente(String value) {
                this.c19MunicipioEmitente = value;
            }

            /**
             * Obtém o valor da propriedade c20UfEnderecoEmitente.
             * 
             * @return
             *     possible object is
             *     {@link TUf }
             *     
             */
            public TUf getC20UfEnderecoEmitente() {
                return c20UfEnderecoEmitente;
            }

            /**
             * Define o valor da propriedade c20UfEnderecoEmitente.
             * 
             * @param value
             *     allowed object is
             *     {@link TUf }
             *     
             */
            public void setC20UfEnderecoEmitente(TUf value) {
                this.c20UfEnderecoEmitente = value;
            }

            /**
             * Obtém o valor da propriedade c21CepEmitente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC21CepEmitente() {
                return c21CepEmitente;
            }

            /**
             * Define o valor da propriedade c21CepEmitente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC21CepEmitente(String value) {
                this.c21CepEmitente = value;
            }

            /**
             * Obtém o valor da propriedade c22TelefoneEmitente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC22TelefoneEmitente() {
                return c22TelefoneEmitente;
            }

            /**
             * Define o valor da propriedade c22TelefoneEmitente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC22TelefoneEmitente(String value) {
                this.c22TelefoneEmitente = value;
            }

            /**
             * Obtém o valor da propriedade c34TipoIdentificacaoDestinatario.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC34TipoIdentificacaoDestinatario() {
                return c34TipoIdentificacaoDestinatario;
            }

            /**
             * Define o valor da propriedade c34TipoIdentificacaoDestinatario.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC34TipoIdentificacaoDestinatario(String value) {
                this.c34TipoIdentificacaoDestinatario = value;
            }

            /**
             * Obtém o valor da propriedade c35IdContribuinteDestinatario.
             * 
             * @return
             *     possible object is
             *     {@link TLoteGNRE.Guias.TDadosGNRE.C35IdContribuinteDestinatario }
             *     
             */
            public TLoteGNRE.Guias.TDadosGNRE.C35IdContribuinteDestinatario getC35IdContribuinteDestinatario() {
                return c35IdContribuinteDestinatario;
            }

            /**
             * Define o valor da propriedade c35IdContribuinteDestinatario.
             * 
             * @param value
             *     allowed object is
             *     {@link TLoteGNRE.Guias.TDadosGNRE.C35IdContribuinteDestinatario }
             *     
             */
            public void setC35IdContribuinteDestinatario(TLoteGNRE.Guias.TDadosGNRE.C35IdContribuinteDestinatario value) {
                this.c35IdContribuinteDestinatario = value;
            }

            /**
             * Obtém o valor da propriedade c36InscricaoEstadualDestinatario.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC36InscricaoEstadualDestinatario() {
                return c36InscricaoEstadualDestinatario;
            }

            /**
             * Define o valor da propriedade c36InscricaoEstadualDestinatario.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC36InscricaoEstadualDestinatario(String value) {
                this.c36InscricaoEstadualDestinatario = value;
            }

            /**
             * Obtém o valor da propriedade c37RazaoSocialDestinatario.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC37RazaoSocialDestinatario() {
                return c37RazaoSocialDestinatario;
            }

            /**
             * Define o valor da propriedade c37RazaoSocialDestinatario.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC37RazaoSocialDestinatario(String value) {
                this.c37RazaoSocialDestinatario = value;
            }

            /**
             * Obtém o valor da propriedade c38MunicipioDestinatario.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC38MunicipioDestinatario() {
                return c38MunicipioDestinatario;
            }

            /**
             * Define o valor da propriedade c38MunicipioDestinatario.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC38MunicipioDestinatario(String value) {
                this.c38MunicipioDestinatario = value;
            }

            /**
             * Obtém o valor da propriedade c33DataPagamento.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC33DataPagamento() {
                return c33DataPagamento;
            }

            /**
             * Define o valor da propriedade c33DataPagamento.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC33DataPagamento(String value) {
                this.c33DataPagamento = value;
            }

            /**
             * Obtém o valor da propriedade c05Referencia.
             * 
             * @return
             *     possible object is
             *     {@link TLoteGNRE.Guias.TDadosGNRE.C05Referencia }
             *     
             */
            public TLoteGNRE.Guias.TDadosGNRE.C05Referencia getC05Referencia() {
                return c05Referencia;
            }

            /**
             * Define o valor da propriedade c05Referencia.
             * 
             * @param value
             *     allowed object is
             *     {@link TLoteGNRE.Guias.TDadosGNRE.C05Referencia }
             *     
             */
            public void setC05Referencia(TLoteGNRE.Guias.TDadosGNRE.C05Referencia value) {
                this.c05Referencia = value;
            }

            /**
             * Obtém o valor da propriedade c39CamposExtras.
             * 
             * @return
             *     possible object is
             *     {@link TLoteGNRE.Guias.TDadosGNRE.C39CamposExtras }
             *     
             */
            public TLoteGNRE.Guias.TDadosGNRE.C39CamposExtras getC39CamposExtras() {
                return c39CamposExtras;
            }

            /**
             * Define o valor da propriedade c39CamposExtras.
             * 
             * @param value
             *     allowed object is
             *     {@link TLoteGNRE.Guias.TDadosGNRE.C39CamposExtras }
             *     
             */
            public void setC39CamposExtras(TLoteGNRE.Guias.TDadosGNRE.C39CamposExtras value) {
                this.c39CamposExtras = value;
            }

            /**
             * Obtém o valor da propriedade c42IdentificadorGuia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC42IdentificadorGuia() {
                return c42IdentificadorGuia;
            }

            /**
             * Define o valor da propriedade c42IdentificadorGuia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC42IdentificadorGuia(String value) {
                this.c42IdentificadorGuia = value;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;choice>
             *         &lt;element name="CNPJ" type="{http://www.gnre.pe.gov.br}TCnpj"/>
             *         &lt;element name="CPF" type="{http://www.gnre.pe.gov.br}TCpf"/>
             *       &lt;/choice>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "cnpj",
                "cpf"
            })
            public static class C03IdContribuinteEmitente {

                @XmlElement(name = "CNPJ")
                protected String cnpj;
                @XmlElement(name = "CPF")
                protected String cpf;

                /**
                 * Obtém o valor da propriedade cnpj.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCNPJ() {
                    return cnpj;
                }

                /**
                 * Define o valor da propriedade cnpj.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCNPJ(String value) {
                    this.cnpj = value;
                }

                /**
                 * Obtém o valor da propriedade cpf.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCPF() {
                    return cpf;
                }

                /**
                 * Define o valor da propriedade cpf.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCPF(String value) {
                    this.cpf = value;
                }

            }


            /**
             * 
             * 														Informações de
             * 														período de
             * 														apuração
             * 													
             * 
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="periodo" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;enumeration value="0"/>
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="2"/>
             *               &lt;enumeration value="3"/>
             *               &lt;enumeration value="4"/>
             *               &lt;enumeration value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="mes" type="{http://www.gnre.pe.gov.br}TMes" minOccurs="0"/>
             *         &lt;element name="ano" type="{http://www.gnre.pe.gov.br}TAno" minOccurs="0"/>
             *         &lt;element name="parcela" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;pattern value="[1-9]{1}[0-9]{0,2}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "periodo",
                "mes",
                "ano",
                "parcela"
            })
            public static class C05Referencia {

                protected String periodo;
                protected String mes;
                protected String ano;
                protected String parcela;

                /**
                 * Obtém o valor da propriedade periodo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPeriodo() {
                    return periodo;
                }

                /**
                 * Define o valor da propriedade periodo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPeriodo(String value) {
                    this.periodo = value;
                }

                /**
                 * Obtém o valor da propriedade mes.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMes() {
                    return mes;
                }

                /**
                 * Define o valor da propriedade mes.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMes(String value) {
                    this.mes = value;
                }

                /**
                 * Obtém o valor da propriedade ano.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAno() {
                    return ano;
                }

                /**
                 * Define o valor da propriedade ano.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAno(String value) {
                    this.ano = value;
                }

                /**
                 * Obtém o valor da propriedade parcela.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getParcela() {
                    return parcela;
                }

                /**
                 * Define o valor da propriedade parcela.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setParcela(String value) {
                    this.parcela = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;choice>
             *         &lt;element name="CNPJ" type="{http://www.gnre.pe.gov.br}TCnpj"/>
             *         &lt;element name="CPF" type="{http://www.gnre.pe.gov.br}TCpf"/>
             *       &lt;/choice>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "cnpj",
                "cpf"
            })
            public static class C35IdContribuinteDestinatario {

                @XmlElement(name = "CNPJ")
                protected String cnpj;
                @XmlElement(name = "CPF")
                protected String cpf;

                /**
                 * Obtém o valor da propriedade cnpj.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCNPJ() {
                    return cnpj;
                }

                /**
                 * Define o valor da propriedade cnpj.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCNPJ(String value) {
                    this.cnpj = value;
                }

                /**
                 * Obtém o valor da propriedade cpf.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCPF() {
                    return cpf;
                }

                /**
                 * Define o valor da propriedade cpf.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCPF(String value) {
                    this.cpf = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="campoExtra" maxOccurs="3">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="tipo" type="{http://www.gnre.pe.gov.br}TTipoCampoExtra"/>
             *                   &lt;element name="valor">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="100"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "campoExtra"
            })
            public static class C39CamposExtras {

                @XmlElement(required = true)
                protected List<TLoteGNRE.Guias.TDadosGNRE.C39CamposExtras.CampoExtra> campoExtra;

                /**
                 * Gets the value of the campoExtra property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the campoExtra property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCampoExtra().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TLoteGNRE.Guias.TDadosGNRE.C39CamposExtras.CampoExtra }
                 * 
                 * 
                 */
                public List<TLoteGNRE.Guias.TDadosGNRE.C39CamposExtras.CampoExtra> getCampoExtra() {
                    if (campoExtra == null) {
                        campoExtra = new ArrayList<TLoteGNRE.Guias.TDadosGNRE.C39CamposExtras.CampoExtra>();
                    }
                    return this.campoExtra;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="tipo" type="{http://www.gnre.pe.gov.br}TTipoCampoExtra"/>
                 *         &lt;element name="valor">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="100"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "codigo",
                    "tipo",
                    "valor"
                })
                public static class CampoExtra {

                    protected int codigo;
                    @XmlElement(required = true)
                    protected TTipoCampoExtra tipo;
                    @XmlElement(required = true)
                    protected String valor;

                    /**
                     * Obtém o valor da propriedade codigo.
                     * 
                     */
                    public int getCodigo() {
                        return codigo;
                    }

                    /**
                     * Define o valor da propriedade codigo.
                     * 
                     */
                    public void setCodigo(int value) {
                        this.codigo = value;
                    }

                    /**
                     * Obtém o valor da propriedade tipo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TTipoCampoExtra }
                     *     
                     */
                    public TTipoCampoExtra getTipo() {
                        return tipo;
                    }

                    /**
                     * Define o valor da propriedade tipo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TTipoCampoExtra }
                     *     
                     */
                    public void setTipo(TTipoCampoExtra value) {
                        this.tipo = value;
                    }

                    /**
                     * Obtém o valor da propriedade valor.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValor() {
                        return valor;
                    }

                    /**
                     * Define o valor da propriedade valor.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValor(String value) {
                        this.valor = value;
                    }

                }

            }

        }

    }

}
