package br.com.rodrigo.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@SessionScoped
public class Usuario implements Serializable{
	
	private String userName;
	private String password;
	private Estudante estudante;
	private List<Locale> listLocale = Arrays.asList(Locale.ENGLISH, new Locale("pt"), Locale.FRENCH);
	private String language;
	
	public String validaLogin(){
		String user = this.getUserName();
		String password = this.getPassword();
		
		if(user.equals("rodrigo.mietlicki") && password.equals("rodrigo123")) {
			estudante = new Estudante();
			return "restricted/inicio?faces-redirect=true";
		} else {
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario e/ou senha invalidos", ""));
			return null;
		}
	}
	
	public String logout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		estudante = null;
		return "/login?faces-redirect=true";
	}
		

	public Usuario() {
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

	public List<Locale> getListLocale() {
		return listLocale;
	}

	public void setListLocale(List<Locale> listLocale) {
		this.listLocale = listLocale;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	

}
