package com.dsmanioto.ChainOfRepository.bancario.arquivos.impl;

import com.dsmanioto.ChainOfRepository.bancario.arquivos.Formato;
import com.dsmanioto.ChainOfRepository.bancario.arquivos.Requisicao;
import com.dsmanioto.ChainOfRepository.bancario.arquivos.Resposta;
import com.dsmanioto.ChainOfRepository.bancario.model.Conta;

public class RespostaEmXml implements Resposta {

	private Resposta outraReposta;

	public RespostaEmXml(Resposta resposta) {
		this.outraReposta = resposta;
	}

	public String responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.XML) {
			return "<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo()
					+ "</saldo></conta>";
		}

		return outraReposta.responde(req, conta);
	}

}
