package com.baccarin.screen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToggleButton;

import com.baccarin.enumeration.ClasseAtivo;
import com.baccarin.enumeration.Segmento;
import com.baccarin.enumeration.Ticker;
import com.baccarin.user.Pessoa;

import java.awt.BorderLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.util.Date;
import java.awt.event.ItemEvent;

public class ScreenCadFundo {

	//JFrame
	private JFrame frame;
	
	//JField
	private JTextField txtPatrimonioTotal = new JTextField();
	private JTextField txtQuantidadeCotas =  new JTextField();
	private JTextField txtValorPatrimonial =  new JTextField();
	
	//JLabel
	private JLabel lbPatrimonioTotal = new JLabel("Patrimonio Total");
	private JLabel lbSegmento = new JLabel("Segmento");
	private JLabel lbTicker = new JLabel("Ticker");
	private JLabel lbValorPatrimonial = new JLabel("Valor Patrimonial");
	private JLabel lbQuantidadeCotas = new JLabel("Qtd Cotas");
	private JLabel lbClasseAtivo = new JLabel("Classe Ativo");
	
	//JComboBox
	private JComboBox cmbTicker = new JComboBox();
	private JComboBox cmbSegmento = new JComboBox();
	private JComboBox cmbClasseAtivo = new JComboBox();
	//JCheckBox
	private JCheckBox ckFundoImobiliario = new JCheckBox("Fundo Imobiliario");
	private JCheckBox ckFundoInvestimento = new JCheckBox("Fundo de Investimento");
	
	//JButton
	private JButton btSalvarFII = new JButton("Salvar FII");
	private final JLabel lblNome = new JLabel("Nome");
	private final JTextField txtNome = new JTextField();
	private final JTextField txtDataFundacao = new JTextField();
	private final JLabel lbDataFundacao = new JLabel("Data Fundacao");
	private final JButton btSalvarFundInvest = new JButton("Salvar Fund Invest");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScreenCadFundo window = new ScreenCadFundo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScreenCadFundo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.initConfigs();
		
	}
	
	public void teste() {

	}
	
	public void initConfigs() {
		this.initConfigButton();
		this.initConfigCheckBox();
		this.initConfigCombo();
		this.initConfigLabel();
		this.initConfigTxt();
	}
	
	private void initConfigLabel() {
		
		lbSegmento.setBounds(10, 172, 99, 14);
		lbTicker.setBounds(10, 139, 99, 14);
		lbValorPatrimonial.setBounds(6, 52, 99, 14);
		lbQuantidadeCotas.setBounds(6, 111, 99, 14);
		lbClasseAtivo.setBounds(10, 205, 99, 14);
		lbPatrimonioTotal.setBounds(6, 83, 99, 14);
		lblNome.setBounds(333, 52, 33, 14);
		lbDataFundacao.setBounds(320, 114, 99, 14);


		frame.getContentPane().add(lbSegmento);
		frame.getContentPane().add(lbTicker);
		frame.getContentPane().add(lbValorPatrimonial);
		frame.getContentPane().add(lbQuantidadeCotas);
		frame.getContentPane().add(lbClasseAtivo);
		frame.getContentPane().add(lbPatrimonioTotal);
		frame.getContentPane().add(lblNome);
		frame.getContentPane().add(lbDataFundacao);

	}
	
	private void initConfigTxt() {
		
		txtValorPatrimonial.setBounds(108, 49, 147, 20);	
		frame.getContentPane().add(txtValorPatrimonial);	
		txtValorPatrimonial.setColumns(10);
		

		txtPatrimonioTotal.setBounds(108, 80, 147, 20);		
		txtPatrimonioTotal.setColumns(10);
		frame.getContentPane().add(txtPatrimonioTotal);
		
		txtQuantidadeCotas.setBounds(108, 108, 147, 20);		
		txtQuantidadeCotas.setColumns(10);
		frame.getContentPane().add(txtQuantidadeCotas);
		
		txtNome.setColumns(10);
		txtNome.setBounds(272, 80, 147, 20);	
		frame.getContentPane().add(txtNome);
		
		txtDataFundacao.setColumns(10);
		txtDataFundacao.setBounds(281, 140, 147, 20);	
		frame.getContentPane().add(txtDataFundacao);

		
	}
	
	public void btSaveFII() {
		btSalvarFII.setBounds(6, 227, 89, 23);
		btSalvarFII.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("soi vai");
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btSalvarFII);
	}

	public void btSaveFundInvest() {
		btSalvarFundInvest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ckFundoInvestimento.isSelected()) {
					if (txtNome.getText() == null || txtNome.getText().equals("") || cmbClasseAtivo.getSelectedItem() == ClasseAtivo.FUNDO_IMOBILIARIO) {
						System.out.println("Não foi possível salvar o Fundo de Investimentos");
					}else {
						System.out.println("------");
					}
					/*
					 *     private ClasseAtivo classe;
    private String nome;
    private Date dataFundacao;
					 * */
				}
			}
		});
		
		btSalvarFundInvest.setBounds(281, 172, 147, 23);
		frame.getContentPane().add(btSalvarFundInvest);
	}
	
	private void initConfigButton() {
		this.btSaveFII();
		this.btSaveFundInvest();
	}
	
	private void initConfigCombo() {
		cmbTicker.setBounds(108, 139, 147, 22);
		frame.getContentPane().add(cmbTicker);
		for (Ticker t : Ticker.values()) {
			cmbTicker.addItem(t.getDescricao());
		}
		cmbSegmento.setBounds(108, 172, 147, 22);
		frame.getContentPane().add(cmbSegmento);
		for (Segmento s : Segmento.values()) {
			cmbSegmento.addItem(s.getDescricao());
		}
		cmbClasseAtivo.setBounds(108, 205, 147, 22);
		frame.getContentPane().add(cmbClasseAtivo);
		for (ClasseAtivo ca : ClasseAtivo.values()) {
			cmbClasseAtivo.addItem(ca.getDescricao());
		}
	}
	
	private void initConfigCheckBox() {
		
		//FII
		ckFundoImobiliario.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (ckFundoImobiliario.isSelected()) {
					// validar o pq nao esta indo pro item certo
					//cmbClasseAtivo.setSelectedItem();
					ckFundoInvestimento.setSelected(false);
					cmbClasseAtivo.setEnabled(false);
				}else {
					cmbClasseAtivo.setEnabled(true);
				}
			}
		});
		
		ckFundoImobiliario.setBounds(6, 7, 156, 23);
		frame.getContentPane().add(ckFundoImobiliario);
		
		//FundoInvest
		ckFundoInvestimento.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (ckFundoInvestimento.isSelected()) {
					// validar o pq nao esta indo pro item certo
					//cmbClasseAtivo.setSelectedItem();
					ckFundoImobiliario.setSelected(false);
					cmbTicker.setEnabled(false);
					cmbSegmento.setEnabled(false);
				}else {
					cmbTicker.setEnabled(true);
					cmbSegmento.setEnabled(true);
				}
			}
		});
		ckFundoInvestimento.setBounds(272, 7, 156, 23);
		frame.getContentPane().add(ckFundoInvestimento);
	}
}
