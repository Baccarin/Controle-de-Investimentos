package com.baccarin.operacao;

import com.baccarin.enumeration.Segmento;
import com.baccarin.enumeration.Ticker;
import com.baccarin.enumeration.TipoOperacao;
import com.baccarin.ativos.FundoImobiliario;
import java.time.Clock;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author baccarin
 */
public class BusFundoImobiliario {

    // Text Fields
    public JTextField txtTicker;
    public JTextField txtValorPatrimonial;
    public JTextField txtPatrimonioTotal;

    // Labels
    public JLabel lbTicker;
    public JLabel lbSegmento;
    public JLabel lbValorPatrimonial;
    public JLabel lbPatrimonioTotal;
    public JLabel lbPVP;

    // Botões
    public JButton btSalvar;
    public JButton btExcluir;
    public JButton btPVP;

    // Combos
    public JComboBox<Segmento> cmbSegmento;
    public JComboBox<Ticker> cmbTicker;
    public JComboBox<TipoOperacao> cmbTipoOperacao;

    public boolean validaFundoImobiliario() {
        String erro = null;
        // ajustar para buscar equal("") , ficou faltando o pipe 
        if (txtTicker.getText() == null) {
            erro = "Ticker não pode estar vazio";
        } else if (cmbSegmento.getSelectedItem() == null) {
            erro = "Segmento deve ser selecionado";
        }
        if (erro != null) {
            System.out.println(erro);
            return false;
        } else {
            return true;
        }
    }

    public void saveFundoImobiliario() {
        if (this.validaFundoImobiliario()) {
            // Validar se o ticker deve ser um ENUM ou nãos
            FundoImobiliario fundo = new FundoImobiliario((Ticker) cmbTicker.getSelectedItem(),
                    (Segmento) cmbSegmento.getSelectedItem());
            if (txtPatrimonioTotal.getText().trim() != null){
                fundo.setPatrimonioTotal(Double.parseDouble(txtPatrimonioTotal.getText().trim()));
            }
            if (txtValorPatrimonial.getText().trim() != null){
                fundo.setValorPatrimonial(Double.parseDouble(txtValorPatrimonial.getText().trim()));
            }
        }
    }

    public void btSalvar() {
        this.saveFundoImobiliario();
    }

    public void btExcluir() {

    }

    public Double btPVP(FundoImobiliario fundo) {
        lbPVP.setText(String.valueOf(fundo.getPVP()));
        return fundo.getPVP();
    }

    public void initCmbSegmento() {
        for (Segmento seg : Segmento.values()) {
            cmbSegmento.addItem(seg);
        }
    }

    public void initCmbTicker() {
        for (Ticker t : Ticker.values()) {
            cmbTicker.addItem(t);
        }
    }
    
    public void initCmbTipoOperacao(){
        for (TipoOperacao tp : TipoOperacao.values()){
            cmbTipoOperacao.addItem(tp);
        }
    }

}
