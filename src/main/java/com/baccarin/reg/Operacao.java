package com.baccarin.reg;

import com.baccarin.ativos.FundoImobiliario;
import com.baccarin.enumeration.TipoOperacao;
import java.util.Date;

/**
 *
 * @author baccarin
 */
public class Operacao {

    private Integer quantidadeCotas;
    private TipoOperacao tipo;
    private Double valorCota;
    private Date dataOperacao = new Date();
    private FundoImobiliario fundo;

    public Operacao(Integer quantidadeCotas, TipoOperacao tipo, Double valorCota, FundoImobiliario fundo) {
        this.quantidadeCotas = quantidadeCotas;
        this.tipo = tipo;
        this.valorCota = valorCota;
        this.fundo = fundo;
    }

    public Operacao(Integer quantidadeCotas, TipoOperacao tipo, Double valorCota, FundoImobiliario fundo, Date data) {
        this(quantidadeCotas, tipo, valorCota, fundo);
        this.dataOperacao = data;
    }

    public Integer getQuantidadeCotas() {
        return quantidadeCotas;
    }

    public void setQuantidadeCotas(Integer quantidadeCotas) {
        this.quantidadeCotas = quantidadeCotas;
    }

    public TipoOperacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoOperacao tipo) {
        this.tipo = tipo;
    }

    public Double getValorCota() {
        return valorCota;
    }

    public void setValorCota(Double valorCota) {
        this.valorCota = valorCota;
    }

    public Date getDataOperacao() {
        return dataOperacao;
    }

    public void setDataOperacao(Date dataOperacao) {
        this.dataOperacao = dataOperacao;
    }

    public FundoImobiliario getFundo() {
        return fundo;
    }

    public void setFundo(FundoImobiliario fundo) {
        this.fundo = fundo;
    }

}
