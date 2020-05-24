package com.dsmanioto.solid.lcp.solidlcp;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

/**
 * Exemplo de uso correto do LCP
 *
 * Conforme demosntrano na imagem em anexo /uml_examples
 */
public class SetTest {

	@Test
	public void deveAdicionarEMostrarUsandoHashSet() {
		Set<String> users = new HashSet<>();
		show(users);
	}
	
	@Test
	public void deveAdicionarEMostrarUsandoTreeSet() {
		Set<String> users = new TreeSet<>();
		show(users);
	}
	
	@Test
	public void deveAdicionarEMostrarUsandoLinkedHashSet() {
		Set<String> users = new LinkedHashSet<>();
		show(users);
	}
	
	private void show(Set<String> users) {
		users.add("user1");
		users.add("user2");
		users.add("user3");
		users.add("user4");
		users.add("user5");
		
		System.out.println("Exibindo todos");
		users.stream().forEach(System.out::println);
		
		String remover = users.stream().findFirst().get();
		users.remove(remover);
		
		System.out.println("Exibindo todos após remoção");
		users.stream().forEach(System.out::println);
	}
	
}
