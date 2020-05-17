package com.danielsmanioto.state.model;

import com.danielsmanioto.state.model.impl.Aprovado;
import com.danielsmanioto.state.model.impl.Finalizado;
import com.danielsmanioto.state.model.impl.Orcamento;
import com.danielsmanioto.state.model.impl.Reprovado;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DescontoExtraTest {

	@Test
	public void aplicarDescontoExtra1() {
		Orcamento orcamento = new Orcamento(500.0);
		orcamento.aplicaDescontoExtra();
		assertTrue(orcamento.getValor() == 475.0);
	}

	@Test
	public void aplicarDescontoExtra2() {
		Orcamento orcamento = new Orcamento(100.0);
		orcamento.aplicaDescontoExtra();
		assertTrue(orcamento.getValor() == 95.0);
	}

	@Test
	public void aprovar() {
		Orcamento orcamento = new Orcamento(500);
		orcamento.aprova();

		assertTrue(orcamento.getEstadoAtual() instanceof Aprovado);
	}

	@Test
	public void aprovar2x() {
		Orcamento orcamento = new Orcamento(500);
		orcamento.aprova();
		assertTrue(orcamento.getEstadoAtual() instanceof Aprovado);

		boolean erroaAprovar2x = false;
		try {
			orcamento.aprova();
		} catch (Exception e) {
			erroaAprovar2x = true;
		}

		assertTrue(orcamento.getEstadoAtual() instanceof Aprovado && erroaAprovar2x);
	}

	@Test
	public void reprovar() {
		Orcamento orcamento = new Orcamento(500);
		orcamento.reprovar();

		assertTrue(orcamento.getEstadoAtual() instanceof Reprovado);
	}

	@Test
	public void finalizar() {
		Orcamento orcamento = new Orcamento(500);

		boolean erro = false;
		try {
			orcamento.finaliza();
		} catch (RuntimeException r) {
			erro = true;
		}
		assertTrue(erro);
	}

	@Test
	public void finalizar2() {
		Orcamento orcamento = new Orcamento(500);
		orcamento.aprova();

		boolean erro = false;
		try {
			orcamento.finaliza();
		} catch (RuntimeException r) {
			erro = true;
		}
		assertTrue(!erro && (orcamento.getEstadoAtual() instanceof Finalizado));
	}

}
