package com.pos.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.pos.dao.Dao;
import com.pos.dao.FilmeDao;
import com.pos.model.Filme;

public class SalvarTag extends SimpleTagSupport {

	private Long id;

	private String titulo;

	private String genero;

	private Integer ano;

	private Dao<Filme> filmeDao;

	public SalvarTag() {
		this.filmeDao = new FilmeDao();
	}

	@Override
	public void doTag() throws JspException, IOException {
		Filme filme = new Filme(id, titulo, genero, ano);
		filmeDao.save(filme);
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public void setId(Long id) {
		this.id = id;
	}

}