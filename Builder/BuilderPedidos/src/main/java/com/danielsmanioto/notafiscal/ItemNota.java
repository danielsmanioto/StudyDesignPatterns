package com.danielsmanioto.notafiscal;

/**
 * Representa um item na nota fiscal
 * @author daniel
 *
 */
public class ItemNota {
	
	private String nome;
	private double valor;
	
	/**
	 * Construtor com todos os campos necessários
	 * @param nome
	 * @param valor
	 */
	public ItemNota(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
