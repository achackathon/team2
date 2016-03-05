package com.hackathon.uzbico.resource;

import com.hackathon.uzbico.repository.impl.UsuarioRepositoryImpl;

//@Path("/usuario")
public class UsuarioResource {

	static UsuarioRepositoryImpl repository = new UsuarioRepositoryImpl();

	// @GET
	// @Path("/listAll")
	// @Produces("application/json")
	// public List<Usuario> findAll() {
	// return repository.findAll();
	// }
	//
	// @PUT
	// @Path("/insert")
	// @Produces("application/json")
	// public void insert(Usuario usuario) {
	//
	// }

}
