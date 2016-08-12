package com.danielsmanioto.state.model.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.danielsmanioto.state.model.EstadoOrcamento;

public class Orcamento {

	protected EstadoOrcamento estadoAtual;
	protected double valor;
	private List<Item> itens;

	public Orcamento() {
		estadoAtual = new EmAprovacao();
	}

	public Orcamento(double valor) {
		this();
		this.valor = valor;
		itens = new ArrayList<Item>();
	}

	public double getValor() {
		return valor;
	}

	public EstadoOrcamento getEstadoAtual() {
		return estadoAtual;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void adicionaItem(Item item) {
		itens.add(item);
	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}

	public void aprova() {
		estadoAtual.aprova(this);
	}

	public void reprovar() {
		estadoAtual.reprovar(this);
	}

	public void finaliza() {
		estadoAtual.finaliza(this);
	}

}
