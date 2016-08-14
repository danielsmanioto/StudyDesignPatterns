package com.danielsmanioto.venda;

import java.util.Calendar;

/**
 * Representa uma VendaBuilder
 * Responsável por setar os campos de uma Venda e retorna-lo
 * 
 * @author danie
 *
 */
public class VendaBuilder {

	private int id;
	private Cliente cliente;
	private Vendedor vendedor;
	private Calendar dataVenda;
	
	/**
	 * Seta o id
	 * @param id
	 * @return
	 */
	public VendaBuilder id(int id) {
		this.id = id;
		return this;
	}
	
	/**
	 * Seta o cliente
	 * @param cliente
	 * @return
	 */
	public VendaBuilder cliente(Cliente cliente) {
		this.cliente = cliente;
		return this;
	}
	
	/**
	 * Seta o vendedor
	 * @param vendedor
	 * @return
	 */
	public VendaBuilder vendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
		return this;
	}
	
	/**
	 * Seta a data
	 * @param dataVenda
	 * @return
	 */
	public VendaBuilder dataVenda(Calendar dataVenda) {
		this.dataVenda = dataVenda;
		return this;
	}
	
	/**
	 * Retorna uma venda
	 * @return
	 */
	public Venda getVenda() {
		return new Venda(id, cliente, vendedor, dataVenda);
	}

}
