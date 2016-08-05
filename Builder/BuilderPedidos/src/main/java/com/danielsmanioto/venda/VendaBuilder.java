package com.danielsmanioto.venda;

import java.util.Calendar;

public class VendaBuilder {

	private int id;
	private Cliente cliente;
	private Vendedor vendedor;
	private Calendar dataVenda;

	public VendaBuilder id(int id) {
		this.id = id;
		return this;
	}

	public VendaBuilder cliente(Cliente cliente) {
		this.cliente = cliente;
		return this;
	}

	public VendaBuilder vendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
		return this;
	}

	public VendaBuilder dataVenda(Calendar dataVenda) {
		this.dataVenda = dataVenda;
		return this;
	}

	public Venda getVenda() {
		return new Venda(id, cliente, vendedor, dataVenda);
	}

}
