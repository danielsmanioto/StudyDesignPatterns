package com.dsmanioto.solid.icp.correto.impl;

import com.dsmanioto.solid.icp.correto.PessoaJuridica;
import org.springframework.util.StringUtils;

public class PessoaJuridicaImpl implements PessoaJuridica {
	
	private String cnpj;
	private String nome;
	private String telefone;
	private String email;
	
	@Override
	public void cnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public boolean validaCnpj() {
		return !StringUtils.isEmpty(this.cnpj);
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
