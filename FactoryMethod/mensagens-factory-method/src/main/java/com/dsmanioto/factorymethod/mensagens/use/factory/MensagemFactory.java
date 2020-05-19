package com.dsmanioto.factorymethod.mensagens.use.factory;

import com.dsmanioto.factorymethod.mensagens.use.Mensagem;
import com.dsmanioto.factorymethod.mensagens.use.enumeration.TipoMensagem;
import com.dsmanioto.factorymethod.mensagens.use.impl.MensagemEmail;
import com.dsmanioto.factorymethod.mensagens.use.impl.MensagemSMS;

public class MensagemFactory {
	
	public static Mensagem getMensagem(TipoMensagem tipoMensagem) {
		if(tipoMensagem == TipoMensagem.EMAIL) {
			return new MensagemEmail();
		}
		
		if(tipoMensagem == TipoMensagem.SMS) {
			return new MensagemSMS();
		}
		
		return new MensagemDefault();
	}
	
}
