package com.baccarin.enumeration;

/**
 *
 * @author baccarin
 */
public enum ClasseAtivo {
    ACOES, MULTIMERCADO, RENDA_FIXA, INTERNACIONAL, CRIPTO, ETF, FUNDO_IMOBILIARIO;

    public String getDescricao() {
        String descricao = "";
        switch (this) {
            case ACOES:
                descricao = "Fundo de ações";
                break;
            case MULTIMERCADO:
                descricao = "Fundo de Multimercado";
                break;
            case RENDA_FIXA:
                descricao = "Fundo de Renda Fixa";
                break;
            case INTERNACIONAL:
                descricao = "Fundo de Internacional";
                break;
            case CRIPTO:
                descricao = "Fundo de Criptomoedas";    
                break;
            case ETF:
                descricao = "ETF";
                break;
            case FUNDO_IMOBILIARIO:
                descricao = "Fundo Imobiliário";
                break;
        }
        return descricao;
    }

}
