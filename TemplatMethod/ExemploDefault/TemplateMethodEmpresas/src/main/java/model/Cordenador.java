package model;

import java.util.Calendar;

public class Cordenador extends Funcionario {

	private static final double PORCENTAGEM_BONUS = 30;

	public Cordenador(double salario, Calendar dataAdmissao) {
		super(salario, dataAdmissao);
	}

	@Override
	public double getBonus() {
		return super.getBonus(PORCENTAGEM_BONUS);
	}

}
