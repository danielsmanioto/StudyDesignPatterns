package com.dsmanioto.decorator.decoratorvenda.implementation.model;

import java.math.BigDecimal;

public class Produto {
	
	private String nome;
	private int quantidade;
	private BigDecimal valorUnitario;
	
	public Produto(String nome, int quantidade, BigDecimal valorUnitario) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}
	
}
