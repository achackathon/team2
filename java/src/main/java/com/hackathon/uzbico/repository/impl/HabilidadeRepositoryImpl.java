package com.hackathon.uzbico.repository.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.hackathon.uzbico.entities.Habilidade;
import com.hackathon.uzbico.repository.HabilidadeRepository;

public class HabilidadeRepositoryImpl implements HabilidadeRepository {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Habilidade save(Habilidade habilidade) {
		return (Habilidade) this.sessionFactory.getCurrentSession().save(
				habilidade);
	}

	public List<Habilidade> findAll() {
		return (List<Habilidade>) this.sessionFactory.getCurrentSession()
				.createQuery("from Habilidade");
	}

	public void deleteById(Long id) {
		this.sessionFactory.getCurrentSession().createQuery(
				"delete from Habilidade where id = " + id);

	}

	public Habilidade findByName(String name) {

		return (Habilidade) this.sessionFactory
				.getCurrentSession()
				.createQuery("from Habilidade where tilulo like %" + name + "%");
	}

}
