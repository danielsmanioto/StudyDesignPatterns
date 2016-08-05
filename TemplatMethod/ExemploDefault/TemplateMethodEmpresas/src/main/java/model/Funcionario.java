package model;

import java.util.Calendar;

public abstract class Funcionario {

	private static final String NOME = "Funcionário";
	
	private double salario;
	private Calendar dataAdmissao;

	public Funcionario(double salario, Calendar dataAdmissao) {
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}

	public double getSalario() {
		return salario;
	}

	public Calendar getDataAdmissao() {
		return dataAdmissao;
	}

	public double getBonus(double porcentagemBonus) {
		final double valorBonus = (this.getSalario() * porcentagemBonus) / 100;
		return valorBonus;
	}
	
	public abstract double getBonus(); 
	
	@Override
	public String toString() {
		return NOME;
	}

}
