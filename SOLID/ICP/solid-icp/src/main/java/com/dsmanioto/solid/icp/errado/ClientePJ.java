package com.dsmanioto.solid.icp.errado;

public class ClientePJ implements Cliente {
	
	private String cpf;
	private String cnpj;
	private String nome;
	private String telefone;
	private String email;
	
	@Override
	public void nome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void telefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public void email(String email) {
		this.email = email;
	}
	
	@Override
	public void cpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public void cnpj(String cpnj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public boolean validaCpf() {
		throw new RuntimeException("Não permitido validar CPF em uma pessoa juridica");
	}
	
	@Override
	public boolean validaCnpj() {
		return true;
	}
}
