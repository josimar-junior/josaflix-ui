package com.pos.model;

public class Filme {

	private Long id;

	private String titulo;

	private String genero;

	private Integer ano;

	public Filme() {

	}

	public Filme(String titulo, String genero, Integer ano) {
		this(null, titulo, genero, ano);
	}

	public Filme(Long id, String titulo, String genero, Integer ano) {
		this.id = id;
		this.titulo = titulo;
		this.genero = genero;
		this.ano = ano;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public boolean isNovo() {
		return id == null || id == 0;
	}
	
}