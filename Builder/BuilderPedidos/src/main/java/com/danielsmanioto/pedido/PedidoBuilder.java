package com.danielsmanioto.pedido;

import java.util.Calendar;

public class PedidoBuilder {

	private Integer id;
	private Calendar data;

	public PedidoBuilder comId(Integer id) {
		this.id = id;
		return this;
	}

	public PedidoBuilder comData(Calendar data) {
		this.data = data;
		return this;
	}

	public Pedido controi() {
		return new Pedido(this.id, this.data);
	}

}
