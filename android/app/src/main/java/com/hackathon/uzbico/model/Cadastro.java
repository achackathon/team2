package com.hackathon.uzbico.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Cadastro implements Serializable {

    @SerializedName("_id")
    private String id;
    private String cpf;
    private String nome;
    private String senha;
    private String email;
    private String fone;
    private int avaliacao;

    public Cadastro() {
    }

    public Cadastro(String cpf, String nome, String senha, String email, String fone, int avaliacao) {
        this.cpf = cpf;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.fone = fone;
        this.avaliacao = avaliacao;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
