package com.danielsmanioto.venda;

/**
 * Representa um cliente
 * 
 * @author daniel
 *
 */
public class Cliente {

	private int id;
	private String nome;
	
	/**
	 * Construtor com todos os campos necessários
	 * @param id
	 * @param nome
	 */
	public Cliente(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

}
