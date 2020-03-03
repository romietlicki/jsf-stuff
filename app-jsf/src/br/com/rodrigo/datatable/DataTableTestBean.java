package br.com.rodrigo.datatable;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.rodrigo.model.Estudante;
import br.com.rodrigo.model.enums.Turno;

@Named
@ViewScoped
public class DataTableTestBean implements Serializable {
	
	List<Estudante> estudanteList = Arrays.asList(new Estudante("Rodrigo", "Mietlicki", 7.6, 5.0, 4.5, Turno.NOTURNO),
			new Estudante("Gustavo", "Mietlicki", 8.6, 4.0, 6.0, Turno.VESPERTINO),
			new Estudante("Guilherme", "Mietlicki", 7.5, 3.0, 8.5, Turno.MATUTINO),
			new Estudante("Jair", "Bolsonaro", 7.0, 5.5, 7.5, Turno.NOTURNO));

	
	public void orderByNome(String ordem) {
		if(ordem.equals("asc")) {
			System.out.println("dentro do if orderby nome");
			estudanteList.sort(Comparator.comparing(Estudante::getNome));
		} else {
			estudanteList.sort(Comparator.comparing(Estudante::getNome).reversed());
		}
	}
	
	
	public void orderBySobreNome(String ordem) {
		if(ordem.equals("asc")) {
			System.out.println("dentro do if orderby sobrenome");
			estudanteList.sort(Comparator.comparing(Estudante::getNome));
		} else {
			estudanteList.sort(Comparator.comparing(Estudante::getNome).reversed());
		}
		
	}
	
	public List<Estudante> getEstudanteList() {
		return estudanteList;
	}

	public void setEstudanteList(List<Estudante> estudanteList) {
		this.estudanteList = estudanteList;
	}
	
	
	

}
