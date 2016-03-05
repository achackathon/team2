package com.hackathon.uzbico.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;

@Table(name="habilidade")
@Entity
public class Habilidade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 946395795383789312L;
	
	@Id
	@Column(name="id")
	@NotNull
	private Long id;
	
	@NotNull
	@Column(name="titulo")
	private String titulo;
	
	@ManyToMany(mappedBy="habilidades")
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
