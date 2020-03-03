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
	
	public Estudante() {
		
	}

	public Estudante(String nome, String sobrenome, double nota1, double nota2, double nota3, Turno turno) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.turno = turno;
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


}
