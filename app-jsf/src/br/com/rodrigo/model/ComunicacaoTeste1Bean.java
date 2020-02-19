package br.com.rodrigo.model;

import java.io.Serializable;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class ComunicacaoTeste1Bean implements Serializable {
	
	private String nome = "Jair";
	private String sobrenome = "Bolsonaro";
	private boolean showParam;
	private String paramName = FacesContext.getCurrentInstance()
			.getExternalContext()
			.getInitParameter("images.location");
	
/*	public String imprimirAtributos() {
		String initParameter = FacesContext.getCurrentInstance()
				.getExternalContext()
				.getInitParameter("images.location");
		showParam = true;
		
		System.out.println(initParameter);
		return initParameter;
	}
	*/
	
	public void showParameters(){
		this.showParam = true;
		System.out.println("dentro do metodo showParam() : "+this.showParam );
	}
	
	public void hideParameters() {
		this.showParam = false;
		System.out.println("dentro do metodo hideParam() : "+this.showParam );
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

	public boolean isShowParam() {
		return showParam;
	}

	public void setShowParam(boolean showParam) {
		this.showParam = showParam;
	}


	public String getParamName() {
		return paramName;
	}


	public void setParamName(String paramName) {
		this.paramName = paramName;
	}
	
	
	

}
