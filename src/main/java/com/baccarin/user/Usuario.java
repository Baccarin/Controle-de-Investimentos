package com.baccarin.user;

/**
*
* @author baccarin
*/

public class Usuario {

	private Pessoa pessoa;
	private String password;
	private String login;

	
	public Usuario(Pessoa pessoa, String password, String login) {
		this.pessoa = pessoa;
		this.password = password;
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return "Usuario [pessoa=" + pessoa + ", password=" + password + ", login=" + login + "]";
	}
	
	
}
