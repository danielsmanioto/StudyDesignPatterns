package com.danielsmanioto.venda;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class VendaTest {
	
	private static Calendar data;
	
	@BeforeClass
	public static void init() {
		data = Calendar.getInstance();
	}
	
	@Test
	public void testar() {
		Cliente cliente = new Cliente(1, "Cliente");
		Vendedor vendedor = new Vendedor(1, "Vendedor");
		
		Venda venda = getVenda(1, cliente, vendedor);

		assertEquals(1, venda.getId());
		assertEquals(1, venda.getCliente().getId());
		assertEquals(1, venda.getVendedor().getId());
		assertEquals(data, venda.getDataVenda());
	}

	private Venda getVenda(int id, Cliente cliente, Vendedor vendedor) {
		return new VendaBuilder()
				.id(id)
				.cliente(cliente)
				.vendedor(vendedor)
				.dataVenda(data)
				.getVenda();
	}
	
}
