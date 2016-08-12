package com.dsmanioto.ChainOfRepository.bancario;

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
