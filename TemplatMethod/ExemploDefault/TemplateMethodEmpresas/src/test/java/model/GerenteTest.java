package model;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

public class GerenteTest {

	private static final double SALARIO = 1000.0;

	@Test
	public void verificaBonus() {
		Funcionario gerente = new Gerente(SALARIO, Calendar.getInstance());
		assertEquals(400.0, gerente.getBonus(), 0.01);
	}

}
