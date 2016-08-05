package com.danielsmanioto.notafiscal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private List<ItemNota> itens = new ArrayList<ItemNota>();
	private double valorBruto;
	private double impostos;
	private String observacao;
	private Calendar dataAtual;

	public NotaFiscalBuilder paraEmpresas(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder comItem(ItemNota item) {
		this.itens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 1.05;
		return this;
	}
	
	public NotaFiscalBuilder comObservacao(String observacao) {
		this.observacao = observacao;
		return this;
	}
	
	public NotaFiscalBuilder naDataAtual(){
		this.dataAtual = Calendar.getInstance();
		return this;
	}
	
	public NotaFiscal constroi() {
		return new NotaFiscal(razaoSocial, cnpj, dataAtual, valorBruto, impostos, itens, observacao);
	}
	
}
