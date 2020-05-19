package com.dsmanioto.factorymethod.mensagens.use.factory;

import com.dsmanioto.factorymethod.mensagens.use.Mensagem;

public class MensagemDefault implements Mensagem {
	
	@Override
	public void enviar(String mensagem) {
		System.out.println("MENSAGEM DEFAULT > " + mensagem);
	}
	
}
