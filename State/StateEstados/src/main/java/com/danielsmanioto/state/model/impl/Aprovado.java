package com.danielsmanioto.state.model.impl;

import com.danielsmanioto.state.model.EstadoOrcamento;

public class Aprovado implements EstadoOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.05;
	}

	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Não é possível aprovar");
	}

	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Não é possível reprovar");
	}

	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
