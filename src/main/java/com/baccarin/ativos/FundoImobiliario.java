package com.baccarin.ativos;

import java.util.ArrayList;

import com.baccarin.enumeration.ClasseAtivo;
import com.baccarin.enumeration.Segmento;
import com.baccarin.enumeration.Ticker;

/**
 *
 * @author baccarin
 */

public class FundoImobiliario {

	private Double valorPatrimonial;
	public final Ticker ticker;
	public final Segmento segmento;
	private Double patrimonioTotal;
	private Integer quantidadeCotas;
	private ClasseAtivo classe = ClasseAtivo.FUNDO_IMOBILIARIO;

	public FundoImobiliario(Ticker ticker, Segmento segmento) {
		this.ticker = ticker;
		this.segmento = segmento;	
	}

	public FundoImobiliario(Double valorPatrimonial, Ticker ticker, Segmento segmento) {
		this(ticker, segmento);
		this.valorPatrimonial = valorPatrimonial;
	}

	public FundoImobiliario(Double valorPatrimonial, Ticker ticker, Segmento segmento, Double patrimonioTotal) {
		this(valorPatrimonial, ticker, segmento);
		this.patrimonioTotal = patrimonioTotal;
	}

	public FundoImobiliario(Double valorPatrimonial, Ticker ticker, Segmento segmento, Double patrimonioTotal,
			Integer quantidade) {
		this(valorPatrimonial, ticker, segmento, patrimonioTotal);
		this.quantidadeCotas = quantidade;
	}

	public Double getValorPatrimonial() {
		return this.valorPatrimonial;
	}

	public void setValorPatrimonial(Double valorPatrimonial) {
		this.valorPatrimonial = valorPatrimonial;
	}

	public Double getPatrimonioTotal() {
		return this.patrimonioTotal;
	}

	public void setPatrimonioTotal(Double patrimonioTotal) {
		this.patrimonioTotal = patrimonioTotal;
	}

	public Ticker getTicker() {
		return this.ticker;
	}

	public Segmento getSegmento() {
		return this.segmento;
	}

	public Integer getQuantidadeCotas() {
		return this.quantidadeCotas;
	}

	public void setQuantidadeCotas(Integer quantidadeCotas) {
		this.quantidadeCotas = quantidadeCotas;
	}

	public Double getPVP() {
		return this.patrimonioTotal / this.quantidadeCotas;
	}

	public ClasseAtivo getClasse() {
		return this.classe;
	}

}
