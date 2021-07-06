package com.baccarin.user;

import com.baccarin.enumeration.TipoCadastroNacional;

/**
 *
 * @author baccarin
 */
public class CadastroNacional {

    private TipoCadastroNacional tipo;
    private String cadNacional;

    public CadastroNacional(TipoCadastroNacional tipo, String cadNacional) {
        this.tipo = tipo;
        this.cadNacional = cadNacional;
    }
    
    public TipoCadastroNacional getTipo() {
        return tipo;
    }

    public void setTipo(TipoCadastroNacional tipo) {
        this.tipo = tipo;
    }

    public String getCadNacional() {
        return cadNacional;
    }

    public void setCadNacional(String cadNacional) {
        this.cadNacional = cadNacional;
    }
    
    
}
