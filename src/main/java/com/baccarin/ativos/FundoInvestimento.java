package com.baccarin.ativos;

import com.baccarin.enumeration.ClasseAtivo;
import java.util.Date;

/**
 *
 * @author baccarin
 */
public class FundoInvestimento {

    private ClasseAtivo classe;
    private String nome;
    private Date dataFundacao;

    public FundoInvestimento(ClasseAtivo classe, String nome) {
        this.classe = classe;
        this.nome = nome;
    }
    
    public FundoInvestimento(ClasseAtivo classe, String nome, Date dataFundacao) {
        this(classe, nome);
        this.dataFundacao = dataFundacao;
    }
    
    public ClasseAtivo getClasse() {
        return classe;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataFundacao() {
        return dataFundacao;
    }
    
    
}
