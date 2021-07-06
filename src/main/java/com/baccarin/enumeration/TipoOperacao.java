package com.baccarin.enumeration;

/**
 *
 * @author baccarin
 */
public enum TipoOperacao {
    
    COMPRA, VENDA, SUBSCRICAO;
    
    public String getDescricao(){
        String descricao = "";
        switch (this){
            case COMPRA:
                descricao = "Compra";
                break;
            case VENDA:
                descricao = "Venda";
                break;
            case SUBSCRICAO:
                descricao = "Subscrição";
                break;
            default:
                descricao = "Operação desconhecida";
        }
        return descricao;
    }
}
