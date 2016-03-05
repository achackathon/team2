package com.hackathon.uzbico.repository.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.hackathon.uzbico.entities.Usuario;
import com.hackathon.uzbico.repository.UsuarioRepository;

public class UsuarioRepositoryImpl implements UsuarioRepository {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Usuario> findAll() {
		return this.sessionFactory.getCurrentSession()
				.createQuery("from Usuario usuario").list();
	}

	public Usuario findByName(String name) {
		return (Usuario) this.sessionFactory.getCurrentSession().createQuery(
				"from Usuario usuario where usuario.nome =");
	}

	public Usuario save(Usuario usuario) {
		return (Usuario) this.sessionFactory.getCurrentSession().save(usuario);
	}

}
