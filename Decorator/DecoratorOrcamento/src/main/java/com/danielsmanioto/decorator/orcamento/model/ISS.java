package com.danielsmanioto.decorator.orcamento.model;

import com.danielsmanioto.decorator.orcamento.model.Imposto;
import com.danielsmanioto.decorator.orcamento.model.Orcamento;

public class ISS extends Imposto {
	
	public ISS() {
		super();
	}
	
	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.20 + calculaDoOutroImposto(orcamento);
	}

}
