package ar.edu.unju.fi.util;

import java.util.ArrayList;

import ar.edu.unju.fi.model.Alumno;

public class ListaAlumno {
	private ArrayList<Alumno> alumnos;
	
	public ListaAlumno() {
		// crear el arrayList
		alumnos = new ArrayList<Alumno>();
		//precargar el arraylist de alumnos
		alumnos.add(new Alumno(40758412,"María Eugenia","Montiel","memontiel@mail.com","3884789526"));
		alumnos.add(new Alumno(30788416,"Juan Manuel","Rosas","jrosas@mail.com","3884200145"));
		alumnos.add(new Alumno(26453120,"Claudia Analia","Gutierrez","cgutierrez@mail.com","3884001458"));
	}
	
	
	/*métodos accesores*/
	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	

}