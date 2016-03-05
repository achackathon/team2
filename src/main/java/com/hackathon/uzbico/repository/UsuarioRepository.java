package com.hackathon.uzbico.repository;

import java.util.List;

import org.hibernate.SessionFactory;

import com.hackathon.uzbico.entities.Usuario;

public class UsuarioRepository {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Usuario> findAll() {
		return this.sessionFactory.getCurrentSession()
				.createQuery("from Usuario usuario").list();
	}
}
