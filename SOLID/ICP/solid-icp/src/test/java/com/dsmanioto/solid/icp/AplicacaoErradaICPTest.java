package com.dsmanioto.solid.icp;

import com.dsmanioto.solid.icp.errado.Cliente;
import com.dsmanioto.solid.icp.errado.ClientePF;
import com.dsmanioto.solid.icp.errado.ClientePJ;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AplicacaoErradaICPTest {
	
	@Test
	public void validaCPF() {
		Cliente cliente = new ClientePF();
		cliente.nome("Daniel Smanioto");
		cliente.cpf("333,745.851-0");
		cliente.telefone("9989800988");
		cliente.email("asdlkjaksdl@ajksdjkasd.com");
		
		Assert.assertTrue(cliente.validaCpf());
	}
	
	@Test
	public void validarCNPJ() {
		Cliente cliente = new ClientePJ();
		cliente.nome("Daniel Smanioto");
		cliente.cnpj("33,745a.851-0");
		cliente.telefone("9989800988");
		cliente.email("asdlkjaksdl@ajksdjkasd.com");
		
		Assert.assertTrue(cliente.validaCnpj());
	}
	
}
