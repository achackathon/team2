package com.hackathon.uzbico.repository;

import java.util.List;

import com.hackathon.uzbico.entities.Usuario;

public interface UsuarioRepository {

	List<Usuario> findAll();

	Usuario findByName(String name);

	Usuario save(Usuario usuario);

	void deleteByCPF(String cpf);

}
