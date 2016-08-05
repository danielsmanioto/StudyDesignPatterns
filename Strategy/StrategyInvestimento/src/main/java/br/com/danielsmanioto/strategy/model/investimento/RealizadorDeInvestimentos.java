package br.com.danielsmanioto.strategy.model.investimento;

public class RealizadorDeInvestimentos {

	public void investir(Conta conta, Investimento investimento) {
		final double resultado = investimento.calcula(conta);
		conta.deposita(resultado);
	}

}
