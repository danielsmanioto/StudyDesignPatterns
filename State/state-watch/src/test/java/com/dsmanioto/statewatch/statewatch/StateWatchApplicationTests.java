package com.dsmanioto.statewatch.statewatch;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StateWatchApplicationTests {

	@Test
	void testaLigado() {
		Stopwatch stopwatch = new Stopwatch();
		stopwatch.click();
	}
	
	@Test
	void testeDesligado() {
		Stopwatch stopwatch = new Stopwatch();
		stopwatch.click();
		stopwatch.click();
	}
	
}
