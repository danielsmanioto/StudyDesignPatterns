package com.dsmanioto.builder.builder.domain;

import java.math.BigDecimal;

public class Produto {
	
	private String descricao;
	private BigDecimal valorUnitario;
	private int quantidade;
	
	public Produto(String descricao, BigDecimal valorUnitario, int quantidade) {
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
		this.quantidade = quantidade;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
}
