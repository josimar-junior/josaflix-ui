package com.pos.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pos.model.Filme;

public class FilmeDaoMock implements Dao<Filme> {

	private static Map<Long, Filme> filmes = new HashMap<>();
	
	static {
		filmes.put(1L, new Filme(1L, "Homem Aranha", "Ação", 2017));
		filmes.put(2L, new Filme(2L, "Logan", "Ação", 2016));
		filmes.put(3L, new Filme(3L, "Homem de Ferro 3", "Ação", 2015));
	}
	

	@Override
	public List<Filme> findAll() {
		return new ArrayList<>(filmes.values());
	}
	
	@Override
	public Filme findByID(Long id) {
		return filmes.get(id);
	}

	@Override
	public void save(Filme filme) {
		Long id = null;
		if(filme.getId() == null) {
			id = proximoID();
			filme.setId(id);
		} else {
			id = filme.getId();
		}
		filmes.put(id, filme);
	}
	
	@Override
	public void delete(Long id) {
		filmes.remove(id);
	}
	
	private Long proximoID() {
		return filmes.size() + 1L;
	}
	
}