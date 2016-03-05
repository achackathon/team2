package com.hackathon.uzbico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.uzbico.entities.Habilidade;
import com.hackathon.uzbico.repository.HabilidadeRepository;

@RestController
@RequestMapping("/habilidade")
public class HabilidadeService {

	@Autowired
	private HabilidadeRepository repository;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<?> save(Habilidade habilidade) {
		return ResponseEntity.ok(repository.save(habilidade));
	}

	@RequestMapping(value = "/listaTodos", method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	@RequestMapping(value = "/atualiza", method = RequestMethod.POST)
	public void updade(Habilidade habilidade) {
		repository.update(habilidade);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
