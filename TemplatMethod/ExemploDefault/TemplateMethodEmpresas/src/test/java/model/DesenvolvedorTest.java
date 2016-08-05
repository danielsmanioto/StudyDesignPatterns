package model;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

public class DesenvolvedorTest {

	@Test
	public void verificaBonus() {
		Funcionario dev = new Desenvolvedor(1000.0, Calendar.getInstance());
		assertEquals(250.0, dev.getBonus(), 0.01);
	}

	@Test
	public void verificaBonusSalarioMenor800() {
		Funcionario dev = new Desenvolvedor(700.0, Calendar.getInstance());
		assertEquals(0, dev.getBonus(), 0.01);
	}

	@Test
	public void verificaBonusSalarioIgual800() {
		Funcionario dev = new Desenvolvedor(700.0, Calendar.getInstance());
		assertEquals(0, dev.getBonus(), 0.01);
	}

}
