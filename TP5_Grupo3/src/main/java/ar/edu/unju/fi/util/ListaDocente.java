package ar.edu.unju.fi.util;

import java.util.ArrayList;
import java.util.Optional;

import ar.edu.unju.fi.model.Docente;

public class ListaDocente {
	
	private ArrayList<Docente> docentes;
	
	public ListaDocente() {
		// crear e inicializar arrayList de docentes
		docentes = new ArrayList<Docente>();
		docentes.add(new Docente("100","Alejandro","Sanchez","asanchez@mail.com","3884789562"));
		docentes.add(new Docente("101","María","Lamas","mlamas@mail.com","3884895210"));
		docentes.add(new Docente("102","Martina Adriana","Perez","mperez@mail.com","3884120130"));
		docentes.add(new Docente("103","Pedro Antonio","Miranda","pmiranda@mail.com","3884111999"));
	}

	public ArrayList<Docente> getDocentes() {
		return docentes;
	}

	public void setDocentes(ArrayList<Docente> docentes) {
		this.docentes = docentes;
	}
	
	public Docente buscarDocente(int legajo) {
		Optional<Docente> docente = getDocentes().stream().filter(d -> d.getLegajo().equals(legajo)).findFirst();
		return docente.get();
	}
	
	
}
