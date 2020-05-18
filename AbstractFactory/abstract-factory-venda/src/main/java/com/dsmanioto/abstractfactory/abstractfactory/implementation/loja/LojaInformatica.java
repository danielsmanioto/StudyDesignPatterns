package com.dsmanioto.abstractfactory.abstractfactory.implementation.loja;

import com.dsmanioto.abstractfactory.abstractfactory.implementation.VendaFactory;
import com.dsmanioto.abstractfactory.abstractfactory.implementation.boleto.BancoBrasilBoleto;
import com.dsmanioto.abstractfactory.abstractfactory.implementation.boleto.Boleto;
import com.dsmanioto.abstractfactory.abstractfactory.implementation.nfe.NFE;
import com.dsmanioto.abstractfactory.abstractfactory.implementation.nfe.SaoPauloNFE;

public class LojaInformatica implements VendaFactory {
	
	@Override
	public NFE criarNFE() {
		NFE notaFiscal = new SaoPauloNFE();
		return notaFiscal;
	}
	
	@Override
	public Boleto criarBoleto() {
		Boleto boleto = new BancoBrasilBoleto();
		return boleto;
	}
	
}
