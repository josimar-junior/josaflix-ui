package com.pos.dao;

import java.util.List;

public interface Dao<T> {

	List<T> findAll();
	
	T findByID(Long id);
	
	void save(T t);
	
	void delete(Long id);
	
}