package com.baccarin.enumeration;

/**
 *
 * @author baccarin
 */
public enum Segmento {

    LOGISTICA, PAPEL, FOF, DESENVOLVIMENTO, SHOPPING, HOSPITAL, HIBRIDO, HOTEL;

    public String getDescricao() {
        String descricao = "";
        switch (this) {
            case LOGISTICA:
                descricao = "Logística";
                break;
            case PAPEL:
                descricao = "Papel";
                break;
            case FOF:
                descricao = "Fundo de Fundos";
                break;
            case DESENVOLVIMENTO:
                descricao = "Desenvolvimento";
                break;
            case SHOPPING:
                descricao = "Shopping";
                break;
            case HOSPITAL:
                descricao = "Hospital";
                break;
            case HIBRIDO:
                descricao = "Híbrido";
                break;
            case HOTEL:
                descricao = "Hotel";
                break;
        }
        return descricao;
    }
}
