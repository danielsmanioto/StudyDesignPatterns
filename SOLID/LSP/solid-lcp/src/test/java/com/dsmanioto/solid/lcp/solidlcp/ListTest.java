package com.dsmanioto.solid.lcp.solidlcp;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

/**
 * Exemplo de uso correto do LCP
 *
 * Conforme demosntrano na imagem em anexo /uml_examples
 */
public class ListTest {

	@Test
	public void deveAdicionarEMostrarUsandoArrayList() {
		List<String> users = new ArrayList<>();
		show(users);
	}
	
	@Test
	public void deveAdicionarEMostrarUsandoVector() {
		List<String> users = new Vector<>();
		show(users);
	}
	
	@Test
	public void deveAdicionarEMostrarUsandoLinkedList() {
		List<String> users = new LinkedList<>() {};
		show(users);
	}
	
	@Test
	public void deveAdicionarEMostrarUsandoStack() {
		List<String> users = new Stack<>() {};
		show(users);
	}
	
	private void show(List<String> users) {
		users.add("user1");
		users.add("user2");
		users.add("user3");
		users.add("user4");
		users.add("user5");
		
		System.out.println("Exibindo todos");
		users.stream().forEach(System.out::println);
		
		users.remove(users.get(0));
		
		System.out.println("Exibindo todos após remoção");
		users.stream().forEach(System.out::println);
	}
	
}
