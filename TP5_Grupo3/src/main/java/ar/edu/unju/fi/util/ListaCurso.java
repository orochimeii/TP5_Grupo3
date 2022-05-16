package ar.edu.unju.fi.util;

import java.time.LocalDate;
import java.util.ArrayList;

import ar.edu.unju.fi.model.Docente;
import ar.edu.unju.fi.model.Curso;

public class ListaCurso {
	
	private ArrayList<Curso> cursos;
	
	Docente docente1 = new Docente("100","María","Diaz","mdiaz@mail.com.ar","388999999");
	Docente docente2 = new Docente("101","Pedro","Ramirez","pramirez@mail.com.ar","388888888");
	Docente docente3 = new Docente("102","Andrea","Luna","aluna@mail.com.ar","388777777");
	
	public ListaCurso() {
		cursos = new ArrayList<Curso>();
		cursos.add(new Curso("123","Inglés Inicial", "idioma", LocalDate.of(2022, 05, 15),LocalDate.of(2022, 8,15),100,"Virtual",docente1));
		cursos.add(new Curso("456","Php", "desarrollo", LocalDate.of(2022, 06, 20),LocalDate.of(2022, 10,15),150,"Virtual",docente2));
		cursos.add(new Curso("789","Inglés Inicial", "desarrollo", LocalDate.of(2022, 05, 20),LocalDate.of(2022, 12,20),200,"Virtual",docente3));
	}
	public ArrayList<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}
}
