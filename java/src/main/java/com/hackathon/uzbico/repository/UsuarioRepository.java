package com.hackathon.uzbico.repository;

import java.util.List;

import com.hackathon.uzbico.entities.Usuario;

public interface UsuarioRepository {

	public List<Usuario> findAll();

	public Usuario findByName(String name);

	public Usuario save(Usuario usuario);
}
