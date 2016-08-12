package com.dsmanioto.ChainOfRepository.orcamento;

import static org.junit.Assert.*;

import org.junit.Test;

public class DescontoTest {

	@Test
	public void vendaCasada() {
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto d4 = new SemDesconto();

		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);

		Orcamento orcamento = new Orcamento(500.0);
		orcamento.adicionaItem(new Item("Caneta", 250.0));
		orcamento.adicionaItem(new Item("Lapis", 250.0));

		double descontoFinal = d1.desconta(orcamento);

		assertTrue(descontoFinal == 25.0);
	}

	@Test
	public void descontoMaisDe500Reais() {
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto d4 = new SemDesconto();

		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);

		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adicionaItem(new Item("Lapis", 600.0));

		double descontoFinal = d1.desconta(orcamento);

		assertTrue(descontoFinal == 48.0);
	}

	@Test
	public void descontoMais5Itens() {
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto d4 = new SemDesconto();

		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);

		Orcamento orcamento = new Orcamento(100.0);
		orcamento.adicionaItem(new Item("Camiseta", 10.0));
		orcamento.adicionaItem(new Item("Blusa", 10.0));
		orcamento.adicionaItem(new Item("Lapis", 10.0));
		orcamento.adicionaItem(new Item("Caderno", 10.0));
		orcamento.adicionaItem(new Item("Estoujo", 10.0));
		orcamento.adicionaItem(new Item("CD", 50));

		double descontoFinal = d1.desconta(orcamento);

		assertTrue(descontoFinal == 10.0);
	}

	@Test
	public void descontoTodos() {
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto d4 = new SemDesconto();

		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);

		Orcamento orcamento = new Orcamento(800.0);
		orcamento.adicionaItem(new Item("Camiseta", 100.0));
		orcamento.adicionaItem(new Item("Blusa", 100.0));
		orcamento.adicionaItem(new Item("Lapis", 100.0));
		orcamento.adicionaItem(new Item("Caderno", 100.0));
		orcamento.adicionaItem(new Item("Estoujo", 100.0));
		orcamento.adicionaItem(new Item("CD", 100.0));
		orcamento.adicionaItem(new Item("Caneta", 100.0));
		orcamento.adicionaItem(new Item("Lapis", 100.0));

		double descontoFinal = d1.desconta(orcamento);

		assertTrue(descontoFinal == 80.0/* 184.0 */);
	}

}
