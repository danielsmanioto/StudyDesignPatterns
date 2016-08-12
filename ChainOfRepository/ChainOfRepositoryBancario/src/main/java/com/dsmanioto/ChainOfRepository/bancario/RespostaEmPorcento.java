package com.dsmanioto.ChainOfRepository.bancario;

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
