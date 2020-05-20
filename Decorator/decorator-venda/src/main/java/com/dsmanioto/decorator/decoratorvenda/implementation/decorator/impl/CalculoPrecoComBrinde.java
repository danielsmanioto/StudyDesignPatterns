package com.dsmanioto.decorator.decoratorvenda.implementation.decorator.impl;

import com.dsmanioto.decorator.decoratorvenda.implementation.decorator.CalculoPreco;
import com.dsmanioto.decorator.decoratorvenda.implementation.model.Produto;

import java.math.BigDecimal;

public class CalculoPrecoComBrinde implements CalculoPreco {
	
	private CalculoPreco calculoPreco;
	
	public CalculoPrecoComBrinde(CalculoPreco calculoPreco) {
		this.calculoPreco = calculoPreco;
	}
	
	@Override
	public BigDecimal valorFinal(Produto produto) {
		BigDecimal valorFinal = calculoPreco.valorFinal(produto);
		BigDecimal valorBrinde = new BigDecimal("2.00");;
		return valorFinal.add(valorBrinde);
	}
	
}
