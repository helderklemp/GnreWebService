//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.5-2 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: PM.11.26 às 02:56:32 PM BRST 
//


package br.gov.pe.gnre;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TCamposGNRE.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TCamposGNRE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="preserve"/>
 *     &lt;enumeration value="c01_UfFavorecida"/>
 *     &lt;enumeration value="c02_receita"/>
 *     &lt;enumeration value="c25_detalhamentoReceita"/>
 *     &lt;enumeration value="c26_produto"/>
 *     &lt;enumeration value="c27_tipoIdentificacaoEmitente"/>
 *     &lt;enumeration value="c03_idContribuinteEmitente"/>
 *     &lt;enumeration value="c28_tipoDocOrigem"/>
 *     &lt;enumeration value="c04_docOrigem"/>
 *     &lt;enumeration value="c06_valorPrincipal"/>
 *     &lt;enumeration value="c07_atualizacaoMonetaria"/>
 *     &lt;enumeration value="c08_juros"/>
 *     &lt;enumeration value="c09_multa"/>
 *     &lt;enumeration value="c10_valorTotal"/>
 *     &lt;enumeration value="c14_dataVencimento"/>
 *     &lt;enumeration value="c33_dataPagamento"/>
 *     &lt;enumeration value="c29_dataLimitePagamento"/>
 *     &lt;enumeration value="c15_convenio"/>
 *     &lt;enumeration value="c16_razaoSocialEmitente"/>
 *     &lt;enumeration value="c17_inscricaoEstadualEmitente"/>
 *     &lt;enumeration value="c18_enderecoEmitente"/>
 *     &lt;enumeration value="c19_municipioEmitente"/>
 *     &lt;enumeration value="c20_ufEnderecoEmitente"/>
 *     &lt;enumeration value="c21_cepEmitente"/>
 *     &lt;enumeration value="c22_telefoneEmitente"/>
 *     &lt;enumeration value="c34_tipoIdentificacaoDestinatario"/>
 *     &lt;enumeration value="c35_idContribuinteDestinatario"/>
 *     &lt;enumeration value="c36_inscricaoEstadualDestinatario"/>
 *     &lt;enumeration value="c37_razaoSocialDestinatario"/>
 *     &lt;enumeration value="c38_municipioDestinatario"/>
 *     &lt;enumeration value="c30_nossoNumero"/>
 *     &lt;enumeration value="c05_referencia"/>
 *     &lt;enumeration value="periodo"/>
 *     &lt;enumeration value="mes"/>
 *     &lt;enumeration value="ano"/>
 *     &lt;enumeration value="parcela"/>
 *     &lt;enumeration value="c39_camposExtras"/>
 *     &lt;enumeration value="campoExtra"/>
 *     &lt;enumeration value="codigo"/>
 *     &lt;enumeration value="tipo"/>
 *     &lt;enumeration value="valor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TCamposGNRE")
@XmlEnum
public enum TCamposGNRE {

    @XmlEnumValue("c01_UfFavorecida")
    C_01_UF_FAVORECIDA("c01_UfFavorecida"),
    @XmlEnumValue("c02_receita")
    C_02_RECEITA("c02_receita"),
    @XmlEnumValue("c25_detalhamentoReceita")
    C_25_DETALHAMENTO_RECEITA("c25_detalhamentoReceita"),
    @XmlEnumValue("c26_produto")
    C_26_PRODUTO("c26_produto"),
    @XmlEnumValue("c27_tipoIdentificacaoEmitente")
    C_27_TIPO_IDENTIFICACAO_EMITENTE("c27_tipoIdentificacaoEmitente"),
    @XmlEnumValue("c03_idContribuinteEmitente")
    C_03_ID_CONTRIBUINTE_EMITENTE("c03_idContribuinteEmitente"),
    @XmlEnumValue("c28_tipoDocOrigem")
    C_28_TIPO_DOC_ORIGEM("c28_tipoDocOrigem"),
    @XmlEnumValue("c04_docOrigem")
    C_04_DOC_ORIGEM("c04_docOrigem"),
    @XmlEnumValue("c06_valorPrincipal")
    C_06_VALOR_PRINCIPAL("c06_valorPrincipal"),
    @XmlEnumValue("c07_atualizacaoMonetaria")
    C_07_ATUALIZACAO_MONETARIA("c07_atualizacaoMonetaria"),
    @XmlEnumValue("c08_juros")
    C_08_JUROS("c08_juros"),
    @XmlEnumValue("c09_multa")
    C_09_MULTA("c09_multa"),
    @XmlEnumValue("c10_valorTotal")
    C_10_VALOR_TOTAL("c10_valorTotal"),
    @XmlEnumValue("c14_dataVencimento")
    C_14_DATA_VENCIMENTO("c14_dataVencimento"),
    @XmlEnumValue("c33_dataPagamento")
    C_33_DATA_PAGAMENTO("c33_dataPagamento"),
    @XmlEnumValue("c29_dataLimitePagamento")
    C_29_DATA_LIMITE_PAGAMENTO("c29_dataLimitePagamento"),
    @XmlEnumValue("c15_convenio")
    C_15_CONVENIO("c15_convenio"),
    @XmlEnumValue("c16_razaoSocialEmitente")
    C_16_RAZAO_SOCIAL_EMITENTE("c16_razaoSocialEmitente"),
    @XmlEnumValue("c17_inscricaoEstadualEmitente")
    C_17_INSCRICAO_ESTADUAL_EMITENTE("c17_inscricaoEstadualEmitente"),
    @XmlEnumValue("c18_enderecoEmitente")
    C_18_ENDERECO_EMITENTE("c18_enderecoEmitente"),
    @XmlEnumValue("c19_municipioEmitente")
    C_19_MUNICIPIO_EMITENTE("c19_municipioEmitente"),
    @XmlEnumValue("c20_ufEnderecoEmitente")
    C_20_UF_ENDERECO_EMITENTE("c20_ufEnderecoEmitente"),
    @XmlEnumValue("c21_cepEmitente")
    C_21_CEP_EMITENTE("c21_cepEmitente"),
    @XmlEnumValue("c22_telefoneEmitente")
    C_22_TELEFONE_EMITENTE("c22_telefoneEmitente"),
    @XmlEnumValue("c34_tipoIdentificacaoDestinatario")
    C_34_TIPO_IDENTIFICACAO_DESTINATARIO("c34_tipoIdentificacaoDestinatario"),
    @XmlEnumValue("c35_idContribuinteDestinatario")
    C_35_ID_CONTRIBUINTE_DESTINATARIO("c35_idContribuinteDestinatario"),
    @XmlEnumValue("c36_inscricaoEstadualDestinatario")
    C_36_INSCRICAO_ESTADUAL_DESTINATARIO("c36_inscricaoEstadualDestinatario"),
    @XmlEnumValue("c37_razaoSocialDestinatario")
    C_37_RAZAO_SOCIAL_DESTINATARIO("c37_razaoSocialDestinatario"),
    @XmlEnumValue("c38_municipioDestinatario")
    C_38_MUNICIPIO_DESTINATARIO("c38_municipioDestinatario"),
    @XmlEnumValue("c30_nossoNumero")
    C_30_NOSSO_NUMERO("c30_nossoNumero"),
    @XmlEnumValue("c05_referencia")
    C_05_REFERENCIA("c05_referencia"),
    @XmlEnumValue("periodo")
    PERIODO("periodo"),
    @XmlEnumValue("mes")
    MES("mes"),
    @XmlEnumValue("ano")
    ANO("ano"),
    @XmlEnumValue("parcela")
    PARCELA("parcela"),
    @XmlEnumValue("c39_camposExtras")
    C_39_CAMPOS_EXTRAS("c39_camposExtras"),
    @XmlEnumValue("campoExtra")
    CAMPO_EXTRA("campoExtra"),
    @XmlEnumValue("codigo")
    CODIGO("codigo"),
    @XmlEnumValue("tipo")
    TIPO("tipo"),
    @XmlEnumValue("valor")
    VALOR("valor");
    private final String value;

    TCamposGNRE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TCamposGNRE fromValue(String v) {
        for (TCamposGNRE c: TCamposGNRE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
