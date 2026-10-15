package com.joaomar.br.entities;

public class Usuario {
	//atributos
	private String username;
	private String password;
	
	//metodos
	//construtores
	//sem parametros 
	public Usuario() {};
	//com parametro
    public Usuario(String username, String password) {
	this.username = username;
	this.password = password;
}
    //get e setts
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    

}
