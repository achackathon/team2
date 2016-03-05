package com.hackathon.uzbico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.uzbico.entities.Usuario;
import com.hackathon.uzbico.repository.UsuarioRepository;
import com.hackathon.uzbico.repository.impl.UsuarioRepositoryImpl;

@RestController
@RequestMapping("/usuarios")
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Usuario>> findAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Usuario> insert(@RequestBody Usuario usuario) {
		return ResponseEntity.ok(repository.save(usuario));
	}

	@RequestMapping(value = "/delete")
	public void deleteByCPF(String cpf) {
		repository.deleteByCPF(cpf);
	}
}
