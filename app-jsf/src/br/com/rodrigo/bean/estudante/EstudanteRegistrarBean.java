package br.com.rodrigo.bean.estudante;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import br.com.rodrigo.model.Estudante;


/**
 * @author Rodrigo
 *
 */
@ManagedBean
@ViewScoped
public class EstudanteRegistrarBean implements Serializable{
	
	private Estudante estudante = new Estudante();
	
	private String[] nomesArray = { "Rodrigo", "Eh", "JSF", "Developer" };
	private List<String> nomesList = Arrays.asList("Teste", "lista", "jsf");
	private Set<String> nomeSet = new HashSet<>(Arrays.asList("Goku", "Kuririn", "Picollo", "Freeza"));
	private Map<String, String> nomeMap = new HashMap<>();
	private boolean mostrarNotas;
	
	{
		nomeMap.put("Goku", "O mais forte");
		nomeMap.put("Vedita", "O Mais orgulhoso");
		nomeMap.put("Gohan", "Filho do Goku");
		nomeMap.put("Raditz", "O Irmao de Goku");
		
		//foreach hashmap
		for(Map.Entry<String, String> entry : nomeMap.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
	}
	
	public void exibirNotas() {
		this.mostrarNotas = true;
	}
	
	public void esconderNotas() {
		this.mostrarNotas = false;
	}
	

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}
	
	public String[] getNomesArray() {
		return nomesArray;
	}

	public void setNomesArray(String[] nomesArray) {
		this.nomesArray = nomesArray;
	}

	public List<String> getNomesList() {
		return nomesList;
	}

	public void setNomesList(List<String> nomesList) {
		this.nomesList = nomesList;
	}

	public Set<String> getNomeSet() {
		return nomeSet;
	}

	public void setNomeSet(Set<String> nomeSet) {
		this.nomeSet = nomeSet;
	}

	public Map<String, String> getNomeMap() {
		return nomeMap;
	}

	public void setNomeMap(Map<String, String> nomeMap) {
		this.nomeMap = nomeMap;
	}

	public boolean isMostrarNotas() {
		return mostrarNotas;
	}

	public void setMostrarNotas(boolean mostrarNotas) {
		this.mostrarNotas = mostrarNotas;
	}
	
	

}
