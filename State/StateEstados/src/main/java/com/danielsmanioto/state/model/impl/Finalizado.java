package com.danielsmanioto.state.model.impl;

import com.danielsmanioto.state.model.EstadoOrcamento;

public class Finalizado implements EstadoOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("N�o poss�vel aplicar desconto em finalizado.");
	}

	public void aprova(Orcamento orcamento) {
		// TODO Auto-generated method stub
	}

	public void reprovar(Orcamento orcamento) {
		// TODO Auto-generated method stub
	}

	public void finaliza(Orcamento orcamento) {
		// TODO Auto-generated method stub
	}

}
