package com.dsmanioto.solid.icp.errado;

public interface Cliente {
	
	void nome(String nome);
	
	void telefone(String telefone);
	
	void email(String email);
	
	void cpf(String cpf);
	
	void cnpj(String cpnj);
	
	boolean validaCpf();
	
	boolean validaCnpj();
	
}
