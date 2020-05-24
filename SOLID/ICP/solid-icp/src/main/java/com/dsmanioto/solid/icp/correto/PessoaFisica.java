package com.dsmanioto.solid.icp.correto;

public interface PessoaFisica extends Pessoa {
	
	void cpf(String cpf);
	
	boolean validaCpf();
	
}
