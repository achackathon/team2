package com.hackathon.uzbico.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.data.repository.CrudRepository;

import com.hackathon.uzbico.entities.Usuario;

public class UsuarioRepository implements CrudRepository<Usuario, String>{
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

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(String arg0) {
		// TODO Auto-generated method stub

	}

	public void delete(Usuario arg0) {
		// TODO Auto-generated method stub

	}

	public void delete(Iterable<? extends Usuario> arg0) {
		// TODO Auto-generated method stub

	}

	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	public boolean exists(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterable<Usuario> findAll(Iterable<String> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Usuario findOne(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Usuario> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Usuario> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
