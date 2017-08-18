package com.pos.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.pos.dao.Dao;
import com.pos.dao.FilmeDao;
import com.pos.model.Filme;

public class ListarTag extends SimpleTagSupport {

	private Dao<Filme> filmeDao;
	
	public ListarTag() {
		this.filmeDao = new FilmeDao();
	}
	
	@Override
	public void doTag() throws JspException, IOException {
		getJspContext().setAttribute("filmes", filmeDao.findAll());
	}
	
}