package com.dsmanioto.builder.builder.domain.builder;


import com.dsmanioto.builder.builder.domain.Cliente;
import com.dsmanioto.builder.builder.domain.Pedido;
import com.dsmanioto.builder.builder.domain.Produto;
import com.dsmanioto.builder.builder.domain.Vendedor;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PedidoBuilder {
	
	private Pedido instancia;
	
	public PedidoBuilder(String numeroPedido) {
		this.instancia = new Pedido();
		this.instancia.setNumero(numeroPedido);
	}
	
	public PedidoBuilder setCliente(Long id, String nome) {
		Cliente cliente = new Cliente(id, nome);
		this.instancia.setCliente(cliente);
		return this;
	}
	
	public PedidoBuilder setVendedor(Long id, String nome) {
		Vendedor vendedor = new Vendedor(id, nome);
		this.instancia.setVendedor(vendedor);
		return this;
	}
	
	public PedidoBuilder setProduto(String descricao, BigDecimal valorUnitario, int quantidade) {
		Produto produto = new Produto(descricao, valorUnitario, quantidade);
		
		if(instancia.getProdutos() == null) {
			instancia.setProdutos(new ArrayList<>());
		}
		
		instancia.getProdutos().add(produto);
		
		return this;
	}
	
	public Pedido builder() {
		return instancia;
	}
	
}
