package model;

import java.util.Calendar;

public class Tester extends TesterLider {

	private static final double VALOR_BONUS_PRE_FIXADO = 25.0;

	public Tester(double salario, Calendar dataAdmissao) {
		super(salario, dataAdmissao);
	}

	@Override
	public double getBonus() {
		return VALOR_BONUS_PRE_FIXADO ;
	}

}
