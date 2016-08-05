package com.danielsmanioto.pedido;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PedidoTest {

	private static Calendar data = Calendar.getInstance();

	@BeforeClass
	public static void beforeClass() {
		data = Calendar.getInstance();
	}

	@Test
	public void test1() {
		Pedido pedido = getPedido();

		assertEquals(1, pedido.getId(), 0.0005);
		assertEquals(data, pedido.getData());
	}

	private Pedido getPedido() {
		PedidoBuilder builder = new PedidoBuilder();

		builder.comId(1)
		.comData(data);

		Pedido pedido = builder.controi();

		return pedido;
	}

	@AfterClass
	public static void afterClass() {
		data = null;
	}

}
