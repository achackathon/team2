package com.hackathon.uzbico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.uzbico.entities.Usuario;
import com.hackathon.uzbico.repository.UsuarioRepository;

@RestController
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	@RequestMapping("/listaTodos")
	public List<Usuario> findAll() {
		return repository.findAll();
	}

	@RequestMapping("/add")
	public Usuario insert(Usuario usuario) {
		return repository.save(usuario);
	}

	@RequestMapping("/delete")
	public void deleteByCPF(String cpf) {
		repository.deleteByCPF(cpf);
	}
}
