package com.dsmanioto.mvc;

import com.dsmanioto.mvc.model.Modelo;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MvcApplicationTests {

	@Test
	void deveSomarValoresCorretamente() {
		Modelo modelo = new Modelo();
		modelo.somaNumeros(1, 3);
		Assert.assertEquals(4, modelo.getValor());
	}
	
	
}
