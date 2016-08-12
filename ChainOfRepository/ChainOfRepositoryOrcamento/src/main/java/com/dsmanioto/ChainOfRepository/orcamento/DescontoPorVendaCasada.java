package com.dsmanioto.ChainOfRepository.orcamento;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximo;

	public double desconta(Orcamento orcamento) {
		if (aconteceuVendaCasadaEm(orcamento)) {
			return orcamento.getValor() * 0.05;
		}

		return this.proximo.desconta(orcamento);
	}

	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

	private boolean existe(String nomeDoItem, Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getNome().equals(nomeDoItem))
				return true;
		}

		return false;
	}

	private boolean aconteceuVendaCasadaEm(Orcamento orcamento) {
		return existe("Lapis", orcamento) && existe("Caneta", orcamento);
	}

}
