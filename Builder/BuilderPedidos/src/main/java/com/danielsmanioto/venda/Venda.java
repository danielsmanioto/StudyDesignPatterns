package com.danielsmanioto.venda;

import java.util.Calendar;

public class Venda {

	private int id;
	private Cliente cliente;
	private Vendedor vendedor;
	private Calendar dataVenda;

	public Venda(int id, Cliente cliente, Vendedor vendedor, Calendar dataVenda) {
		this.id = id;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.dataVenda = dataVenda;
	}

	public int getId() {
		return id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public Calendar getDataVenda() {
		return dataVenda;
	}

}
