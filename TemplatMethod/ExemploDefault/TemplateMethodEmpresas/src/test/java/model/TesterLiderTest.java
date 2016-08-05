package model;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

public class TesterLiderTest {

	@Test
	public void verificaBonus() {
		Tester t = new Tester(2000.0, Calendar.getInstance());
		assertEquals(25.0, t.getBonus(), 0.01);
	}

}
