package com.hackathon.uzbico.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.uzbico.entities.Usuario;
import com.hackathon.uzbico.repository.UsuarioRepository;

@RestController
public class UsuarioService {

	static UsuarioRepository repository = new UsuarioRepository();

	@RequestMapping("/listaTodos")
	public List<Usuario> findAll() {
		return repository.findAll();
	}

	@RequestMapping("/insert")
	public void insert(Usuario usuario) {

	}
}
