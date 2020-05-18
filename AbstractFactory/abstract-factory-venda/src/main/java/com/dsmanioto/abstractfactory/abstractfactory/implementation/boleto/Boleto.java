package com.dsmanioto.abstractfactory.abstractfactory.implementation.boleto;

import com.dsmanioto.abstractfactory.abstractfactory.implementation.produto.Produto;

public interface Boleto {
	
	void emitir(Produto produto, double imposto);
	
}
