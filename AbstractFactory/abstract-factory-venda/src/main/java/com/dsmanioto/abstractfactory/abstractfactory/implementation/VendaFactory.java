package com.dsmanioto.abstractfactory.abstractfactory.implementation;

import com.dsmanioto.abstractfactory.abstractfactory.implementation.boleto.Boleto;
import com.dsmanioto.abstractfactory.abstractfactory.implementation.nfe.NFE;

public interface VendaFactory {
	
	NFE criarNFE();
	
	Boleto criarBoleto();
	
}
