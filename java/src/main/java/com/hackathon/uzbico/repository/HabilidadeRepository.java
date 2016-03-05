package com.hackathon.uzbico.repository;

import java.util.List;

import com.hackathon.uzbico.entities.Habilidade;

public interface HabilidadeRepository {

	Habilidade save(Habilidade habilidade);

	List<Habilidade> findAll();

	void deleteById(Long id);

	Habilidade findByName(String name);

}
