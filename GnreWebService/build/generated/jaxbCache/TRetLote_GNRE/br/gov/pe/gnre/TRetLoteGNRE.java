//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.5-2 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: PM.11.26 às 02:56:32 PM BRST 
//


package br.gov.pe.gnre;

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
 *         &lt;element name="ambiente">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="situacaoRecepcao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codigo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="[1-9][0-9]{2}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="descricao">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="recibo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="numero">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="[0-9]{10}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dataHoraRecibo" type="{http://www.gnre.pe.gov.br}TDataHora"/>
 *                   &lt;element name="tempoEstimadoProc" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "ambiente",
    "situacaoRecepcao",
    "recibo"
})
@XmlRootElement(name = "TRetLote_GNRE")
public class TRetLoteGNRE {

    @XmlElement(required = true)
    protected String ambiente;
    @XmlElement(required = true)
    protected TRetLoteGNRE.SituacaoRecepcao situacaoRecepcao;
    protected TRetLoteGNRE.Recibo recibo;

    /**
     * Obtém o valor da propriedade ambiente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmbiente() {
        return ambiente;
    }

    /**
     * Define o valor da propriedade ambiente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmbiente(String value) {
        this.ambiente = value;
    }

    /**
     * Obtém o valor da propriedade situacaoRecepcao.
     * 
     * @return
     *     possible object is
     *     {@link TRetLoteGNRE.SituacaoRecepcao }
     *     
     */
    public TRetLoteGNRE.SituacaoRecepcao getSituacaoRecepcao() {
        return situacaoRecepcao;
    }

    /**
     * Define o valor da propriedade situacaoRecepcao.
     * 
     * @param value
     *     allowed object is
     *     {@link TRetLoteGNRE.SituacaoRecepcao }
     *     
     */
    public void setSituacaoRecepcao(TRetLoteGNRE.SituacaoRecepcao value) {
        this.situacaoRecepcao = value;
    }

    /**
     * Obtém o valor da propriedade recibo.
     * 
     * @return
     *     possible object is
     *     {@link TRetLoteGNRE.Recibo }
     *     
     */
    public TRetLoteGNRE.Recibo getRecibo() {
        return recibo;
    }

    /**
     * Define o valor da propriedade recibo.
     * 
     * @param value
     *     allowed object is
     *     {@link TRetLoteGNRE.Recibo }
     *     
     */
    public void setRecibo(TRetLoteGNRE.Recibo value) {
        this.recibo = value;
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
     *         &lt;element name="numero">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="[0-9]{10}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dataHoraRecibo" type="{http://www.gnre.pe.gov.br}TDataHora"/>
     *         &lt;element name="tempoEstimadoProc" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "numero",
        "dataHoraRecibo",
        "tempoEstimadoProc"
    })
    public static class Recibo {

        @XmlElement(required = true)
        protected String numero;
        @XmlElement(required = true)
        protected String dataHoraRecibo;
        protected int tempoEstimadoProc;

        /**
         * Obtém o valor da propriedade numero.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumero() {
            return numero;
        }

        /**
         * Define o valor da propriedade numero.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumero(String value) {
            this.numero = value;
        }

        /**
         * Obtém o valor da propriedade dataHoraRecibo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataHoraRecibo() {
            return dataHoraRecibo;
        }

        /**
         * Define o valor da propriedade dataHoraRecibo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataHoraRecibo(String value) {
            this.dataHoraRecibo = value;
        }

        /**
         * Obtém o valor da propriedade tempoEstimadoProc.
         * 
         */
        public int getTempoEstimadoProc() {
            return tempoEstimadoProc;
        }

        /**
         * Define o valor da propriedade tempoEstimadoProc.
         * 
         */
        public void setTempoEstimadoProc(int value) {
            this.tempoEstimadoProc = value;
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
     *         &lt;element name="codigo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="[1-9][0-9]{2}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="descricao">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
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
        "descricao"
    })
    public static class SituacaoRecepcao {

        @XmlElement(required = true)
        protected String codigo;
        @XmlElement(required = true)
        protected String descricao;

        /**
         * Obtém o valor da propriedade codigo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigo() {
            return codigo;
        }

        /**
         * Define o valor da propriedade codigo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigo(String value) {
            this.codigo = value;
        }

        /**
         * Obtém o valor da propriedade descricao.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescricao() {
            return descricao;
        }

        /**
         * Define o valor da propriedade descricao.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescricao(String value) {
            this.descricao = value;
        }

    }

}
