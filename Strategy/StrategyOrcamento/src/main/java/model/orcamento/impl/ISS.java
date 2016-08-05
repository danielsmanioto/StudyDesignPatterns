package model.orcamento.impl;

import model.orcamento.Imposto;
import model.orcamento.Orcamento;

public class ISS implements Imposto {

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.20;
	}

}
