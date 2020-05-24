package com.dsmanioto.solid.icp;

import com.dsmanioto.solid.icp.correto.PessoaFisica;
import com.dsmanioto.solid.icp.correto.PessoaJuridica;
import com.dsmanioto.solid.icp.correto.impl.PessoaFisicaImpl;
import com.dsmanioto.solid.icp.correto.impl.PessoaJuridicaImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AplicacaoCorretaICPTest {
	
	@Test
	public void validaCPF() {
		PessoaFisica pessoaFisica = new PessoaFisicaImpl();
		pessoaFisica.cpf("35346931830");
		pessoaFisica.email("daniel.smanioto@gmail.com");
		pessoaFisica.telefone("98890980");
		pessoaFisica.nome("Daniel Smanioto");
		
		Assert.assertTrue(pessoaFisica.validaCpf());
	}
	
	@Test
	public void validaCPNJ() {
		PessoaJuridica pessoaJuridica = new PessoaJuridicaImpl();
		pessoaJuridica.cnpj("35346931830");
		pessoaJuridica.email("daniel.smanioto@gmail.com");
		pessoaJuridica.telefone("98890980");
		pessoaJuridica.nome("Daniel Smanioto");
		
		Assert.assertTrue(pessoaJuridica.validaCnpj());
	}
	
}
