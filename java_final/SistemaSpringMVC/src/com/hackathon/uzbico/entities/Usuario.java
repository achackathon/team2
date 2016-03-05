package com.hackathon.uzbico.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Table(name = "usuario")
@Entity
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7316572034795519469L;

	@Id
	@NotNull
	@Column(name = "cpf")
	private String cpf;

	@NotNull
	@Column(name = "nome")
	private String nome;

	@NotNull
	@Column(name = "senha")
	private String senha;

	@Column(name = "telefone")
	private String telefone;

	@JoinTable(name = "habilidadeUsuario", joinColumns = { @JoinColumn(name = "cpf") }, inverseJoinColumns = { @JoinColumn(name = "id") })
	private List<Habilidade> habilidades;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Habilidade> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<Habilidade> habilidades) {
		this.habilidades = habilidades;
	}

}
