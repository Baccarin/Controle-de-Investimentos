package com.baccarin.operacao;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.baccarin.enumeration.ClasseAtivo;

/**
*
* @author baccarin
*/

public class BusFundoInvestimento {

	// Text Fields
	public JTextField txtNome;
	public JTextField txtDataFundacao;
	
	// Labels
	public JLabel lbClasse;
	public JLabel lbNome;
	public JLabel lbDataFundacao;
	
	// Combos
	public JComboBox<ClasseAtivo> cmbClasseAtivo;

	public boolean validaFundoInvestimento() {
		String erro = null;
		if (txtNome.getText() == null || txtNome.getText().trim().equals("")) {
			erro = "Nome não pode estar vazio";
		} else if (cmbClasseAtivo.getSelectedItem() == null) {
			erro = "Classe do ativo deve ser selecionado";
		}
		if (erro != null) {
			System.out.println(erro);
			return false;
		} else {
			return true;
		}
	}

	
}
