package com.dsmanioto.builder.builder.domain;

public class Vendedor {
	
	private Long id;
	private String nome;
	
	public Vendedor(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
}
