package com.dsmanioto.decorator.decoratorvenda.implementation.decorator;

import com.dsmanioto.decorator.decoratorvenda.implementation.model.Produto;

import java.math.BigDecimal;

public class CalculoPrecoComum implements CalculoPreco {

	@Override
	public BigDecimal valorFinal(Produto produto) {
		return produto.getValorUnitario().multiply(BigDecimal.valueOf(produto.getQuantidade()));
	}
	
}
