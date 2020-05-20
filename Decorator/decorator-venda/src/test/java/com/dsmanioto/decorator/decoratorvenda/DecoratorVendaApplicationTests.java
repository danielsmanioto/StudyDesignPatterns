package com.dsmanioto.decorator.decoratorvenda;

import com.dsmanioto.decorator.decoratorvenda.implementation.decorator.CalculoPreco;
import com.dsmanioto.decorator.decoratorvenda.implementation.decorator.CalculoPrecoComum;
import com.dsmanioto.decorator.decoratorvenda.implementation.decorator.CalculoProdutoComFrete;
import com.dsmanioto.decorator.decoratorvenda.implementation.model.Produto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class DecoratorVendaApplicationTests {

	@Test
	void deveCalcularValorProdutoComFrete() {
		Produto produto = new Produto("Coca Cola Lata 350ml", 3, BigDecimal.valueOf(2.98));
		
		CalculoPreco calculo = new CalculoProdutoComFrete(new CalculoPrecoComum());
		BigDecimal valor = calculo.valorFinal(produto);
		
		System.out.println(valor);
	}

}
