package com.dsmanioto.abstractfactory.abstractfactory.implementation.nfe;

import com.dsmanioto.abstractfactory.abstractfactory.implementation.produto.Produto;

import java.math.BigDecimal;

public class SaoPauloNFE implements NFE {
	
	@Override
	public double calcularImposto(Produto produto) {
		BigDecimal imposto = new BigDecimal("0.18");
		imposto.multiply(produto.getValorUnitario());
		return imposto.doubleValue();
	}
	
}
