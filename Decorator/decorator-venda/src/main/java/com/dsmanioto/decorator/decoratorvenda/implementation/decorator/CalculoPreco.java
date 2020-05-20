package com.dsmanioto.decorator.decoratorvenda.implementation.decorator;

import com.dsmanioto.decorator.decoratorvenda.implementation.model.Produto;

import java.math.BigDecimal;

public interface CalculoPreco {
	
	BigDecimal valorFinal(Produto produto);
	
}
