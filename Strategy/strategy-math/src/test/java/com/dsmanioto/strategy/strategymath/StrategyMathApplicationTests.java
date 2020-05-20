package com.dsmanioto.strategy.strategymath;

import com.dsmanioto.strategy.strategymath.strategy.ContextMath;
import com.dsmanioto.strategy.strategymath.strategy.impl.Somar;
import com.dsmanioto.strategy.strategymath.strategy.impl.Subtrair;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class StrategyMathApplicationTests {

	@Test
	void deveSomarCorretamente() {
		ContextMath math = new ContextMath(new Somar());
		int resultado = math.calcular(10, 5);
		Assert.isTrue(resultado == 15);
	}
	
	@Test
	void deveSubtrairCorretamente() {
		ContextMath math = new ContextMath(new Subtrair());
		int resultado = math.calcular(10, 5);
		Assert.isTrue(resultado == 5);
	}

}
