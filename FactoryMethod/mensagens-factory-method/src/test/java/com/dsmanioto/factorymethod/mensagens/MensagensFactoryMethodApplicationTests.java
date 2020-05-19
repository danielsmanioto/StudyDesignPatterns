package com.dsmanioto.factorymethod.mensagens;

import com.dsmanioto.factorymethod.mensagens.use.Mensagem;
import com.dsmanioto.factorymethod.mensagens.use.enumeration.TipoMensagem;
import com.dsmanioto.factorymethod.mensagens.use.factory.MensagemFactory;
import com.dsmanioto.factorymethod.mensagens.use.impl.MensagemEmail;
import com.dsmanioto.factorymethod.mensagens.use.impl.MensagemSMS;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MensagensFactoryMethodApplicationTests {

	@Test
	void exibeMensagemSMS() {
		Mensagem sms = MensagemFactory.getMensagem(TipoMensagem.SMS);
		sms.enviar("Olá");
	}
	
	@Test
	public void exibeMensagemEmail() {
		Mensagem email = MensagemFactory.getMensagem(TipoMensagem.EMAIL);
		email.enviar("Olá");
	}
	
	@Test
	public void exibeMensagemDefault() {
		Mensagem mdefault = MensagemFactory.getMensagem(null);
		mdefault.enviar("Olá");
	}

}
