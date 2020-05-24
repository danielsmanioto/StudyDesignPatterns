package com.dsmanioto.solid.lcp.solidlcp.imposto;

import java.math.BigDecimal;

public class ICMS implements Imposto {
	
	@Override
	public BigDecimal calcular() {
		return new BigDecimal("80");
	}
	
}
