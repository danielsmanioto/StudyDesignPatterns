package com.dsmanioto.solid.icp.correto.impl;

import com.dsmanioto.solid.icp.correto.PessoaFisica;
import org.springframework.util.StringUtils;

public class PessoaFisicaImpl implements PessoaFisica {
	
	private String cpf;
	private String nome;
	private String telefone;
	private String email;
	
	@Override
	public void cpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public boolean validaCpf() {
		return !StringUtils.isEmpty(this.cpf);
	}
	
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
}
