package model.orcamento.impl;

import model.orcamento.Imposto;
import model.orcamento.Orcamento;

public class IPI implements Imposto {

	public double calcula(Orcamento orcamento) {
		return (orcamento.getValor() / 100) * 5;
	}

}
