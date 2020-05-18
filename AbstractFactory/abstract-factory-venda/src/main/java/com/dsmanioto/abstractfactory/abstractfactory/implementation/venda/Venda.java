package com.dsmanioto.abstractfactory.abstractfactory.implementation.venda;

import com.dsmanioto.abstractfactory.abstractfactory.implementation.VendaFactory;
import com.dsmanioto.abstractfactory.abstractfactory.implementation.boleto.Boleto;
import com.dsmanioto.abstractfactory.abstractfactory.implementation.nfe.NFE;
import com.dsmanioto.abstractfactory.abstractfactory.implementation.produto.Produto;

public class Venda {
	
	private NFE notaFiscal;
	private Boleto boleto;
	
	public Venda(VendaFactory factory) {
		this.notaFiscal = factory.criarNFE();
		this.boleto = factory.criarBoleto();
	}
	
	public void realizarVenda(Produto produto) {
		double imposto = notaFiscal.calcularImposto(produto);
		boleto.emitir(produto, imposto);
	}
	
}
