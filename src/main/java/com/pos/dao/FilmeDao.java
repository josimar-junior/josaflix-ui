package com.pos.dao;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import com.pos.model.Filme;

public class FilmeDao implements Dao<Filme> {

	private static final String URL = "http://10.50.16.214:8080/filmes";

	private Client client;

	public FilmeDao() {
		client = ClientBuilder.newClient();
	}

	public List<Filme> findAll() {
		return client.target(URL).request(MediaType.APPLICATION_JSON)
								 .get(new GenericType<List<Filme>>() {});
	}

	@Override
	public void save(Filme filme) {
		if (filme.isNovo()) {
			client.target(URL).request(MediaType.APPLICATION_JSON)
					.post(Entity.entity(filme, MediaType.APPLICATION_JSON));
		} else {
			client.target(URL + "/" + filme.getId()).request(MediaType.APPLICATION_JSON)
					.put(Entity.entity(filme, MediaType.APPLICATION_JSON));
		}
	}

	@Override
	public Filme findByID(Long id) {
		return client.target(URL + "/" + id).request(MediaType.APPLICATION_JSON)
											.get(Filme.class);
	}

	@Override
	public void delete(Long id) {
		client.target(URL + "/" + id).request(MediaType.APPLICATION_JSON).delete();
	}

}