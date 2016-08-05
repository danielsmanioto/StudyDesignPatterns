package model;

import java.util.Calendar;

public class Desenvolvedor extends Funcionario {

	private static final double PORCENTAGEM_BONUS = 25;

	public Desenvolvedor(double salario, Calendar dataAdmissao) {
		super(salario, dataAdmissao);
	}
	
	@Override
	public double getBonus() {
		if (aplicaBonus()) {
			return super.getBonus(PORCENTAGEM_BONUS);
		}

		return 0;
	}

	private boolean aplicaBonus() {
		return this.getSalario() > 800.0;
	}

}
