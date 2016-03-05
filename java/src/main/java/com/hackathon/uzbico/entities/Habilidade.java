package com.hackathon.uzbico.entities;

import java.io.Serializable;
import java.util.List;

public class Habilidade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 946395795383789312L;
	private Long id;
	private String titulo;
	private List<Usuario> usuarios;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}
