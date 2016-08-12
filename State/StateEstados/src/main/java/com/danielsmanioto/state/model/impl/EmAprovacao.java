package com.danielsmanioto.state.model.impl;

import com.danielsmanioto.state.model.EstadoOrcamento;

public class EmAprovacao implements EstadoOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.05;
	}

	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
	}

	public void reprovar(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
	}

	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("N�o � possivel finalizar.");
	}

}
