package model;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

public class CordenadorTest {

	private static final double SALARIO = 1000.0;

	@Test
	public void verificaBonus() {
		Funcionario gerente = new Cordenador(SALARIO, Calendar.getInstance());
		assertEquals(300.0, gerente.getBonus(), 0.01);
	}
	
}
