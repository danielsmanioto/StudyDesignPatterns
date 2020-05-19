package com.dsmanioto.builder.builder;

import com.dsmanioto.builder.builder.domain.Pedido;
import com.dsmanioto.builder.builder.domain.builder.PedidoBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class BuilderApplicationTests {

	@Test
	void validaNossoBuilder() {
		Pedido pedido = new PedidoBuilder("0001")
				.setCliente(1L, "Daniel Cliente")
				.setVendedor(1L, "Carol Vendedores")
				.setProduto("Coca Cola", BigDecimal.valueOf(2.98), 8)
				.setProduto("Cerveja Stella", BigDecimal.valueOf(3.64), 12)
				.setProduto("Cerveja Cristal", BigDecimal.valueOf(1.98), 12)
				.builder();
	
		System.out.println("Número do Pedido: " + pedido.getNumero());
		System.out.println("Número do Cliente: " + pedido.getCliente().getNome());
		System.out.println("Número do Vendedor: " + pedido.getVendedor().getNome());
		pedido.getProdutos().stream().forEach(produto -> {
			System.out.println("Produtos:");
			System.out.println("    " + produto.getQuantidade() + " de "+ produto.getDescricao() + " - Valor unit: " + produto.getValorUnitario());
		});
		
	}

}
