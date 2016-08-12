package com.dsmanioto.ChainOfRepository.orcamento;

public class DescontoPorCincoItens implements Desconto {

	private Desconto proximo;

	public double desconta(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		}

		return this.proximo.desconta(orcamento);
	}

	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

}
