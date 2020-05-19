package com.dsmanioto.factorymethod.mensagens.use.impl;

import com.dsmanioto.factorymethod.mensagens.use.Mensagem;

public class MensagemEmail implements Mensagem {
	
	@Override
	public void enviar(String mensagem) {
		System.out.println("EMAIL > " + mensagem);
	}
	
}
