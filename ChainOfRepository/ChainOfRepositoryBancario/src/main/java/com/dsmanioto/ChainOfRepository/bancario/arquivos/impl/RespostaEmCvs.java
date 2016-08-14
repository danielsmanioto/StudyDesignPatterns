package com.dsmanioto.ChainOfRepository.bancario.arquivos.impl;

import com.dsmanioto.ChainOfRepository.bancario.arquivos.Formato;
import com.dsmanioto.ChainOfRepository.bancario.arquivos.Requisicao;
import com.dsmanioto.ChainOfRepository.bancario.arquivos.Resposta;
import com.dsmanioto.ChainOfRepository.bancario.model.Conta;

public class RespostaEmCvs implements Resposta {

	private Resposta outraReposta;

	public RespostaEmCvs(Resposta resposta) {
		this.outraReposta = resposta;
	}

	public String responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.CSV) {
			return conta.getTitular() + ";" + conta.getSaldo();
		}

		return outraReposta.responde(req, conta);
	}

}
