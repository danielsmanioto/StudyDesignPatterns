package model.orcamento.impl;

import model.orcamento.Imposto;
import model.orcamento.Orcamento;

public class ICMS implements Imposto {

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

}
