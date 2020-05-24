package com.dsmanioto.solid.lcp.solidlcp;

import com.dsmanioto.solid.lcp.solidlcp.imposto.ICMS;
import com.dsmanioto.solid.lcp.solidlcp.imposto.ISS;
import com.dsmanioto.solid.lcp.solidlcp.imposto.Imposto;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class ImpostoTest {
	
	@Test
	public void deveCalcularISS() {
		Imposto iss = new ISS();
		BigDecimal valor = iss.calcular();
		System.out.println(valor);
	}
	
	@Test
	public void deveCalcularICMS() {
		Imposto icms = new ICMS();
		BigDecimal valor = icms.calcular();
		System.out.println(valor);
	}
	
}
