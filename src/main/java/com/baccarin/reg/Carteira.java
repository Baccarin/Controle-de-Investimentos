package com.baccarin.reg;

import com.baccarin.ativos.FundoImobiliario;
import com.baccarin.ativos.FundoInvestimento;
import java.util.ArrayList;

/**
 *
 * @author baccarin
 */
public class Carteira {

    private ArrayList<FundoImobiliario> fundosImobiliarios = new ArrayList<FundoImobiliario>();
    private ArrayList<FundoInvestimento> fundosInvestimentos = new ArrayList<FundoInvestimento>();
    private Corretora corretora;
    
	public Carteira(Corretora corretora) {
		this.corretora = corretora;
	}

	public Carteira(ArrayList<FundoImobiliario> fundosImobiliarios, ArrayList<FundoInvestimento> fundosInvestimentos,
			Corretora corretora) {
		this(corretora);
		this.fundosImobiliarios = fundosImobiliarios;
		this.fundosInvestimentos = fundosInvestimentos;
	}
	
	public ArrayList<FundoImobiliario> getFundosImobiliarios() {
		return fundosImobiliarios;
	}
	public void setFundosImobiliarios(ArrayList<FundoImobiliario> fundosImobiliarios) {
		this.fundosImobiliarios = fundosImobiliarios;
	}
	public ArrayList<FundoInvestimento> getFundosInvestimentos() {
		return fundosInvestimentos;
	}
	public void setFundosInvestimentos(ArrayList<FundoInvestimento> fundosInvestimentos) {
		this.fundosInvestimentos = fundosInvestimentos;
	}
	public Corretora getCorretora() {
		return corretora;
	}
	public void setCorretora(Corretora corretora) {
		this.corretora = corretora;
	}
    
    
}
