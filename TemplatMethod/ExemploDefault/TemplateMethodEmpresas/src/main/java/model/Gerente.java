package model;

import java.util.Calendar;

public class Gerente extends Funcionario {

	private static final double PORCENTAGEM_BONUS = 40;

	public Gerente(double salario, Calendar dataAdmissao) {
		super(salario, dataAdmissao);
	}

	@Override
	public double getBonus() {
		return super.getBonus(PORCENTAGEM_BONUS);
	}

}
