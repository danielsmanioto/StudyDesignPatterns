package com.dsmanioto.decorator.decoratorvenda;

import com.dsmanioto.decorator.decoratorvenda.implementation.decorator.CalculoPreco;
import com.dsmanioto.decorator.decoratorvenda.implementation.decorator.CalculoPrecoComum;
import com.dsmanioto.decorator.decoratorvenda.implementation.decorator.CalculoProdutoComFrete;
import com.dsmanioto.decorator.decoratorvenda.implementation.model.Produto;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class DecoratorVendaApplicationTests {

	@Test
	void deveCalcularValorProdutoComFrete() {
		Produto produto = new Produto("Coca Cola Lata 350ml", 3, BigDecimal.valueOf(2.98));
		
		CalculoPreco calculo = new CalculoProdutoComFrete(new CalculoPrecoComum());
		BigDecimal valorFinal = calculo.valorFinal(produto);
		
		Assert.assertEquals(new BigDecimal("9.94"), valorFinal);
	}
	
	@Test
	void deveCalcularValorProdutoComPrecoComum() {
		Produto produto = new Produto("Coca Cola Lata 350ml", 3, BigDecimal.valueOf(2.98));
		
		CalculoPreco calculo = new CalculoPrecoComum();
		BigDecimal valorFinal = calculo.valorFinal(produto);
		
		Assert.assertEquals(new BigDecimal("8.94"), valorFinal);
	}

}
