package br.com.rodrigo.model;

import java.io.Serializable;

import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class ComunicacaoTeste3Bean implements Serializable{
	
	private String buttonName="Nome do botao do bean";
	private String inputUsuario;
	
	//ActionEvent pega o valor que esta no <f:attribute> e tornando possivel manipular atraves pegando a partir do name
	public void execute(ActionEvent event) {
		String nome = (String) event.getComponent().getAttributes().get("nome");
		String adjetivo = (String) event.getComponent().getAttributes().get("adjetivo");
		String input = (String) event.getComponent().getAttributes().get("inputUsuario");
		
		System.out.println(nome);
		System.out.println(adjetivo);
		System.out.println(input);
		
	}

	public String getButtonName() {
		return buttonName;
	}

	public void setButtonName(String buttonName) {
		this.buttonName = buttonName;
	}

	public String getInputUsuario() {
		return inputUsuario;
	}

	public void setInputUsuario(String inputUsuario) {
		this.inputUsuario = inputUsuario;
	}
	

}
