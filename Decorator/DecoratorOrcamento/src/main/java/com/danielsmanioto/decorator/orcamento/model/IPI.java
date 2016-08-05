package com.danielsmanioto.decorator.orcamento.model;

import com.danielsmanioto.decorator.orcamento.model.Imposto;
import com.danielsmanioto.decorator.orcamento.model.Orcamento;

public class IPI extends Imposto {

	public IPI() {
		super();
	}

	public IPI(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return (orcamento.getValor() * 0.10) + calculaDoOutroImposto(orcamento);
	}

}
