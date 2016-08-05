package com.danielsmanioto.decorator.orcamento.model;

public class ICMS extends Imposto {

	public ICMS() {
		super();
	}

	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return (orcamento.getValor() * 0.15) + calculaDoOutroImposto(orcamento);
	}

}
