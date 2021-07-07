package com.baccarin.screen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.baccarin.user.Pessoa;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScreenCadPessoa extends JFrame {

	// JLabel
	private JLabel lbTitleCadPessoa = new JLabel("Tela de cadastro de pessoa");
	private JLabel lbResposta = new JLabel("");
	private JLabel lbNome = new JLabel("Nome");
	private JLabel lblCadNacional = new JLabel("Cadastro Nacional");

	// JText
	private JTextField txtNome = new JTextField();
	private JTextField txtCadNacional = new JTextField();

	// JButton
	private JButton btSalvar = new JButton("Salvar");
	private JButton btPrint = new JButton("Print");

	// JPanel
	private JPanel contentPane = new JPanel();;

	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScreenCadPessoa frame = new ScreenCadPessoa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ScreenCadPessoa() {
		this.initConfig();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btSalvar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (txtNome.getText() != null && !txtNome.getText().equals("")) {
					Pessoa p = new Pessoa (txtNome.getText());
					pessoas.add(p);
					txtNome.setText("");
				}
			}
		});

		btPrint.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for (Pessoa p : pessoas) {
					System.out.println(p.getNome());
				}
			}
		});


	}
	
	public void configLabels() {
		lbTitleCadPessoa.setBounds(141, 54, 208, 26);
		contentPane.add(lbTitleCadPessoa);
		
		lbNome.setBounds(10, 94, 110, 26);
		contentPane.add(lbNome);

		lblCadNacional.setBounds(10, 131, 110, 26);
		contentPane.add(lblCadNacional);
		
		lbResposta.setBounds(121, 205, 208, 26);
		contentPane.add(lbResposta);
	}
	
	public void configText() {
		txtNome.setBounds(158, 94, 228, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtCadNacional.setColumns(10);
		txtCadNacional.setBounds(158, 128, 228, 20);
		contentPane.add(txtCadNacional);
	}

	public void configButton() {
		btPrint.setBounds(10, 11, 89, 23);
		contentPane.add(btPrint);
		
		btSalvar.setBounds(200, 171, 89, 23);
		contentPane.add(btSalvar);
		
	}
	
	public void initConfig() {
		this.configButton();
		this.configLabels();
		this.configText();
	}
	
}
