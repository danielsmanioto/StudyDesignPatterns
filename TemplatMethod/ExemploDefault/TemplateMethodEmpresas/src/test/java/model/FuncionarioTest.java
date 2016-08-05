package model;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

public class FuncionarioTest {

	private static final double SALARIO = 1000.0;
	private static final int PORCENTAGEM_BONUS = 20;

	@Test
	public void verificaMetodoToString() {
		Funcionario f = capturaNovoFuncionario();
		
		assertEquals("Funcionário", f.toString());
		assertEquals(200.0, f.getBonus(), 0.001);
	}

	private Funcionario capturaNovoFuncionario() {
		return new Funcionario(SALARIO, Calendar.getInstance()) {

			public double getBonus() {
				return super.getBonus(PORCENTAGEM_BONUS);
			}
		};
	}

}
