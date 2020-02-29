package br.com.rodrigo.model;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class ComunicacaoTeste2Bean implements Serializable{
	
	private String nome;
	private String sobrenome;
	
	
	public void init() {
		System.out.println("Criou comunicacao 2");
		System.out.println(nome);
		System.out.println(sobrenome);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	

}
