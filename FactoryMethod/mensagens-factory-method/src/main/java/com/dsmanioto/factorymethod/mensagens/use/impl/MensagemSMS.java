package com.dsmanioto.factorymethod.mensagens.use.impl;

import com.dsmanioto.factorymethod.mensagens.use.Mensagem;

public class MensagemSMS implements Mensagem {
	
	@Override
	public void enviar(String mensagem) {
		System.out.println("SMS > " + mensagem);
	}
	
}
