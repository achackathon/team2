package com.hackathon.uzbico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.uzbico.entities.Habilidade;
import com.hackathon.uzbico.repository.HabilidadeRepository;

@RestController
public class HabilidadeService {

	@Autowired
	private HabilidadeRepository repository;

	@RequestMapping(value = "/habilidade/add", method = RequestMethod.POST)
	public Habilidade save(Habilidade habilidade) {
		return repository.save(habilidade);
	}

	@RequestMapping(value = "/habilidade/listaTodos", method = RequestMethod.GET)
	public List<Habilidade> findAll() {
		return repository.findAll();
	}

	@RequestMapping(value = "/habilidade/atualiza")
	public void updade(Habilidade habilidade) {
		repository.update(habilidade);
	}

	@RequestMapping(value = "/habilidade/delete/{id}")
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
