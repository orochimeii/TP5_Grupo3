package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class Beca {
	private int codigo;
	private Curso curso;
	private LocalDate inicio;
	private LocalDate fin;
	private String estado;


	public Beca () {
		
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public Curso getCurso() {
		return curso;
	}


	public void setCurso(Curso curso) {
		this.curso = curso;
	}


	public LocalDate getInicio() {
		return inicio;
	}


	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}


	public LocalDate getFin() {
		return fin;
	}


	public void setFin(LocalDate fin) {
		this.fin = fin;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Beca(int codigo, Curso curso, LocalDate inicio, LocalDate fin, String estado) {
		super();
		this.codigo = codigo;
		this.curso = curso;
		this.inicio = inicio;
		this.fin = fin;
		this.estado = estado;
	}
}
