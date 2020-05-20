package com.dsmanioto.strategy.strategymath.strategy.impl;

import com.dsmanioto.strategy.strategymath.strategy.StrategyMath;

public class Somar implements StrategyMath {
	
	@Override
	public int operacao(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
}
