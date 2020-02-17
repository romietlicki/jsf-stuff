package br.com.rodrigo.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.com.rodrigo.model.enums.Turno;
/**
 * @author Rodrigo
 *
 */
public class Estudante implements Serializable{

	private String nome = "Rodrigo";
	private String sobrenome = "Mietlicki";
	private double nota1 = 5.0;
	private double nota2 = 7.5;
	private double nota3 = 6.0;
	private Turno turno = Turno.MATUTINO;
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
	
	public String exibirNotas() {
		this.mostrarNotas = true;
		return "index";
	}
	
	public String esconderNotas() {
		this.mostrarNotas = false;
		return "index";
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

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
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
