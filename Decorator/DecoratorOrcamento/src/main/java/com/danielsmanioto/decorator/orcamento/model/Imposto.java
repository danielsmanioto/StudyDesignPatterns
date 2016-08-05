package com.danielsmanioto.decorator.orcamento.model;

/**
 * No padrão decorator é possível fazer o calculo recursivo de impostos por
 * exemplos
 * 
 * @author DANIEL
 *
 */
public abstract class Imposto {

	protected final Imposto outroImposto;

	public Imposto() {
		outroImposto = null;
	}

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	public abstract double calcula(Orcamento orcamento);

	protected double calculaDoOutroImposto(Orcamento orcamento) {
		return outroImposto == null ? 0 : outroImposto.calcula(orcamento);
	}

}
