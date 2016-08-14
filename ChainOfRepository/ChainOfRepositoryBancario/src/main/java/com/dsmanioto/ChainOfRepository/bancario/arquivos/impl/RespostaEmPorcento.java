package com.dsmanioto.ChainOfRepository.bancario.arquivos.impl;

import com.dsmanioto.ChainOfRepository.bancario.arquivos.Formato;
import com.dsmanioto.ChainOfRepository.bancario.arquivos.Requisicao;
import com.dsmanioto.ChainOfRepository.bancario.arquivos.Resposta;
import com.dsmanioto.ChainOfRepository.bancario.model.Conta;

public class RespostaEmPorcento implements Resposta {

	private Resposta outraReposta;

	public RespostaEmPorcento() {
		this.outraReposta = null;
	}

	public String responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.PORCENTO) {
			return conta.getTitular() + '%' + conta.getSaldo();
		} else if (outraReposta != null) {
			return outraReposta.responde(req, conta);
		} else {
			throw new RuntimeException("Formato de resposta não encontrado");
		}
	}

}
