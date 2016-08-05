package br.com.danielsmanioto.strategy.model.investimento.impl;

import br.com.danielsmanioto.strategy.model.investimento.Conta;
import br.com.danielsmanioto.strategy.model.investimento.Investimento;

public class Moderado implements Investimento {

	public double calcula(Conta conta) {
		return conta.getSaldo() * 0.05;
	}

}
