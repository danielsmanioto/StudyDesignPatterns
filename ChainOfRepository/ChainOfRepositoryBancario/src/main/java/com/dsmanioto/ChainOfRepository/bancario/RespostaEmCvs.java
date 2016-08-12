package com.dsmanioto.ChainOfRepository.bancario;

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
