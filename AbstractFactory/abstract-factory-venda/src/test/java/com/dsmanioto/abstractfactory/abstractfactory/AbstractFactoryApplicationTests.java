package com.dsmanioto.abstractfactory.abstractfactory;

import com.dsmanioto.abstractfactory.abstractfactory.implementation.VendaFactory;
import com.dsmanioto.abstractfactory.abstractfactory.implementation.loja.LojaInformatica;
import com.dsmanioto.abstractfactory.abstractfactory.implementation.produto.Produto;
import com.dsmanioto.abstractfactory.abstractfactory.implementation.venda.Venda;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class AbstractFactoryApplicationTests {

	@Test
	void validarRealizarVenda() {
		VendaFactory factory = new LojaInformatica();
		
		Venda venda = new Venda(factory);
		
		Produto produto = getProduto();
		venda.realizarVenda(produto);
		
		Assert.assertEquals(new BigDecimal("29.50000000000000177635683940025046467781066894531250"), produto.getValorTotal());
		
	}
	
	private Produto getProduto() {
		Produto produto = new Produto();
		produto.setDescricao("Coca cola lata");
		produto.setValorUnitario(new BigDecimal(2.95));
		produto.setQuantidade(10);
		return produto;
	}
	
}
