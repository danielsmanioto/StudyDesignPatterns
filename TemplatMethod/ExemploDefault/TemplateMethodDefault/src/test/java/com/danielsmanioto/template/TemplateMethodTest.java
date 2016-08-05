package com.danielsmanioto.template;

import org.junit.Test;

/**
 * 
 * Possibilita que o desenvolvedor escreva a "estrutura" do algoritmo apenas uma
 * vez, e a reutilize nas implementa��es espec�ficas de cada um dos algoritmos.
 * 
 * Isso faz com o que o c�digo fique mais simples, possibilita que mudan�as na
 * estrutura desses algoritmos sejam facilmente modificadas, e que novos
 * algoritmos sejam criados de forma simples
 * 
 * @author DANIEL
 *
 */
public class TemplateMethodTest {

	@Test
	public void executaFilho1() {
		FilhoA a = new FilhoA();
		a.methodOne();
		a.methodTwo();
	}

	@Test
	public void executaFilho2() {
		FilhoB b = new FilhoB();
		b.methodOne();
		b.methodTwo();
	}

	@Test
	public void executaFilho1DuasVezes() {
		TemplateMethod a = new FilhoA();
		a.methodOne();
		a.methodTwo();
	}

	@Test
	public void executaFilho2DuasVezes() {
		TemplateMethod b = new FilhoB();
		b.methodOne();
		b.methodTwo();
	}

}
