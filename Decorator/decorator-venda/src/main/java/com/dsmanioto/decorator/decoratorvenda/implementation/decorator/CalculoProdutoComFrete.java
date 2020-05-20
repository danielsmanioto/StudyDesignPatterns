package com.dsmanioto.decorator.decoratorvenda.implementation.decorator;

import com.dsmanioto.decorator.decoratorvenda.implementation.model.Produto;

import java.math.BigDecimal;

public class CalculoProdutoComFrete implements  CalculoPreco {
	
	private CalculoPreco calculoPreco;
	
	public CalculoProdutoComFrete(CalculoPreco calculoPreco) {
		this.calculoPreco = calculoPreco;
	}
	
	@Override
	public BigDecimal valorFinal(Produto produto) {
		BigDecimal valorFinal = calculoPreco.valorFinal(produto);
		BigDecimal valorFrete = calculaFrete(produto);
		return valorFinal.add(valorFrete);
	}
	
	private BigDecimal calculaFrete(Produto produto) {
		if (produto.getQuantidade() > 10) {
			return new BigDecimal("0.00");
		}
		
		return new BigDecimal("1.00");
	}
	
}
