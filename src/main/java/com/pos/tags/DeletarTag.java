package com.pos.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.pos.dao.Dao;
import com.pos.dao.FilmeDao;
import com.pos.model.Filme;

public class DeletarTag extends SimpleTagSupport {

	private String id;
	private Dao<Filme> dao = new FilmeDao();

	@Override
	public void doTag() throws JspException, IOException {
		dao.delete(Long.parseLong(id));
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
