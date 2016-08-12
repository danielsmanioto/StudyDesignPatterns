package com.danielsmanioto.state.model;

import com.danielsmanioto.state.model.impl.Orcamento;

public interface EstadoOrcamento {

	public abstract void aplicaDescontoExtra(Orcamento orcamento);

	public abstract void aprova(Orcamento orcamento);

	public abstract void reprovar(Orcamento orcamento);

	public abstract void finaliza(Orcamento orcamento);

}
