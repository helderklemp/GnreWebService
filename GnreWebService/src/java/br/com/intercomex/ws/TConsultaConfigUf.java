/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.intercomex.ws;

/**
 *
 * @author helderklemp
 */
public class TConsultaConfigUf {
    private String ambiente;
    private String uf;
    private String receita;

    
    
    @Override
    public String toString() {
        return "<TConsultaConfigUf xmlns=\"http://www.gnre.pe.gov.br\"><ambiente>"+ambiente+"</ambiente><uf>"+uf+"</uf><receita>"+receita+"</receita></TConsultaConfigUf>";
    }
    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }
    
}
