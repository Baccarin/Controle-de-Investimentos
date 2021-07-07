package com.baccarin.enumeration;

/**
 *
 * @author baccarin
 */
public enum TipoCadastroNacional {
	CNPJ, CPF;

	public String getDescricao() {
		String descricao = "";
		switch (this) {
		case CNPJ:
			descricao = "CNPJ";
			break;
		case CPF:
			descricao = "CPF";
			break;
		default:
			descricao = "Nao definido";
		}
		return descricao;
	}
}
