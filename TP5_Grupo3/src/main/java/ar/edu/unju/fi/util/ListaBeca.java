package ar.edu.unju.fi.util;

import java.time.LocalDate;
import java.util.ArrayList;

import ar.edu.unju.fi.model.Beca;
import ar.edu.unju.fi.model.Curso;
import ar.edu.unju.fi.model.Docente;

public class ListaBeca {
	
	private ArrayList<Beca> becas;
	
	
	public ListaBeca() {
		becas = new ArrayList<Beca>();
		
		Docente docente1 = new Docente("100","María","Diaz","mdiaz@mail.com.ar","388999999");
		Docente docente2 = new Docente("101","Pedro","Ramirez","pramirez@mail.com.ar","388888888");
		Docente docente3 = new Docente("102","Andrea","Luna","aluna@mail.com.ar","388777777");
		
		Curso curso1 = new Curso("123","Inglés Inicial", "idioma", LocalDate.of(2022, 05, 15),LocalDate.of(2022, 8,15),100,"Virtual",docente1);
		Curso curso2= new Curso("456","Php", "desarrollo", LocalDate.of(2022, 06, 20),LocalDate.of(2022, 10,15),150,"Virtual",docente2);
		Curso curso3= new Curso("789","Inglés Inicial", "desarrollo", LocalDate.of(2022, 05, 20),LocalDate.of(2022, 12,20),200,"Virtual",docente3);
				
		becas.add(new Beca(1, curso1,LocalDate.of(2022, 5, 4),LocalDate.of(2022, 5, 9), "pendiente"));
		becas.add(new Beca(2, curso2,LocalDate.of(2022, 6, 1),LocalDate.of(2022, 6, 10), "pendiente"));
		becas.add(new Beca(3, curso3,LocalDate.of(2022, 5, 3),LocalDate.of(2022, 5, 10), "pendiente"));
	}

	public ArrayList<Beca> getBecas() {
		return becas;
	}


	public void setBecas(ArrayList<Beca> becas) {
		this.becas = becas;
	}
	
	

}
