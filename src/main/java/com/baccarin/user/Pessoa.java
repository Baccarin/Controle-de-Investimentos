package com.baccarin.user;

import com.baccarin.reg.Carteira;
import java.util.ArrayList;

/**
 *
 * @author baccarin
 */
public class Pessoa {

    private String nome;
    private CadastroNacional cadNacional;
    private ArrayList<Carteira> carteiras = new ArrayList<Carteira>();
	
    
    public Pessoa(String nome, CadastroNacional cadNacional) {
		this.nome = nome;
		this.cadNacional = cadNacional;
	}
    
	public Pessoa(String nome, CadastroNacional cadNacional, ArrayList<Carteira> carteiras) {
		this(nome, cadNacional);
		this.carteiras = carteiras;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public CadastroNacional getCadNacional() {
		return cadNacional;
	}

	public ArrayList<Carteira> getCarteiras() {
		return carteiras;
	}
	
	public void setCarteiras(ArrayList<Carteira> carteiras) {
		this.carteiras = carteiras;
	}
    
    
    
}
