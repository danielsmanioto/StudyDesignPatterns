package com.danielsmanioto.state.model;

import com.danielsmanioto.state.model.impl.Orcamento;

public interface EstadoOrcamento {

	void aplicaDescontoExtra(Orcamento orcamento);

	void aprova(Orcamento orcamento);

	void reprovar(Orcamento orcamento);

	void finaliza(Orcamento orcamento);

}
