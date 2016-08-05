package br.com.danielsmanioto.strategy.model.investimento;

public class Conta {

	private static double saldo;

	public Conta() {
		Conta.saldo = 0.0;
	}

	public Conta(double saldo) {
		Conta.saldo = saldo;
	}

	public void deposita(double valor) {
		Conta.saldo += valor;
	}

	public double getSaldo() {
		return Conta.saldo;
	}

}
