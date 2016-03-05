package com.hackathon.uzbico.entities;

import java.io.Serializable;
import java.util.List;

public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7316572034795519469L;

	private String cpf;
	private String nome;
	private String senha;
	private String telefone;
	private List<Habilidades> competencias;

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

	public List<Habilidades> getCompetencias() {
		return competencias;
	}

	public void setCompetencias(List<Habilidades> competencias) {
		this.competencias = competencias;
	}

}
