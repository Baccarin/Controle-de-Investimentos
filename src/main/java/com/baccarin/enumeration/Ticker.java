package com.baccarin.enumeration;

/**
 *
 * @author baccarin
 */
public enum Ticker {
    MXRF11, TGAR11, HGLG11, GGRC11, VGHF11, RBRF11, TORD11, VINO11, OUJP11;

    public String getDescricao() {
        String descricao = "";
        switch (this) {
            case MXRF11:
                descricao = "MXRF11";
                break;
            case TGAR11:
                descricao = "TGAR11";
                break;
            case HGLG11:
                descricao = "HGLG11";
                break;
            case GGRC11:
                descricao = "GGRC11";
                break;
            case VGHF11:
                descricao = "VGHF11";
                break;
            case RBRF11:
                descricao = "RBRF11";
                break;
            case TORD11:
                descricao = "TORD11";
                break;
            case VINO11:
                descricao = "VINO11";
                break;
            case OUJP11:
                descricao = "OUJP11";
                break;
        }
        return descricao;
    }
}
