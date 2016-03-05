package com.hackathon.uzbico.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.hackathon.uzbico.entities.Usuario;
import com.hackathon.uzbico.repository.UsuarioRepository;

@Path("/usuario")
public class UsuarioResource {

	static UsuarioRepository repository = new UsuarioRepository();

	@GET
	@Path("/listAll")
	@Produces("application/json")
	public List<Usuario> findAll() {
		return repository.findAll();
	}

	@PUT
	@Path("/insert")
	@Produces("application/json")
	public void insert(Usuario usuario) {

	}

}
