package com.dsmanioto.solid.icp.correto;

public interface PessoaJuridica extends Pessoa {
	
	void cnpj(String cnpj);
	
	boolean validaCnpj();
	
}