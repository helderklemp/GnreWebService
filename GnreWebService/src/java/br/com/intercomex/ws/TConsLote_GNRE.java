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
public class TConsLote_GNRE {

    @Override
    public String toString() {
        return "<TConsLote_GNRE xmlns=\"http://www.gnre.pe.gov.br\"><ambiente>"+ambiente+"</ambiente><numeroRecibo>"+numeroRecibo+"</numeroRecibo></TConsLote_GNRE>";
    }
    private String ambiente;
    private String numeroRecibo;

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getNumeroRecibo() {
        return numeroRecibo;
    }

    public void setNumeroRecibo(String numeroRecibo) {
        this.numeroRecibo = numeroRecibo;
    }
    
}
