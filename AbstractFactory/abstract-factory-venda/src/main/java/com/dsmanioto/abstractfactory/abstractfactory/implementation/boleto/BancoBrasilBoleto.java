package com.dsmanioto.abstractfactory.abstractfactory.implementation.boleto;

import com.dsmanioto.abstractfactory.abstractfactory.implementation.produto.Produto;

public class BancoBrasilBoleto implements Boleto {
	
	@Override
	public void emitir(Produto produto, double imposto) {
		System.out.println("BOLETO DO BANCO DO BRASIL");
		System.out.println("==================================");
		System.out.println("Produto: " + produto.getDescricao());
		System.out.println("Valor Unitário: " + produto.getValorUnitario());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println("Valor Total Produtos: " + produto.getValorTotal());
		System.out.println("==================================");
		System.out.println("Impost: " + imposto);
	}
	
}
