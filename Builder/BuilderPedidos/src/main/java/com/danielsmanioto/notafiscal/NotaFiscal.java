package com.danielsmanioto.notafiscal;

import java.util.Calendar;
import java.util.List;

/**
 * Representa uma nota fiscal
 * @author daniel
 *
 */
public class NotaFiscal {

	private String razaoSocial;
	private String cnpj;
	private Calendar dataEmissao;
	private double valorBruto;
	private double impostos;
	public List<ItemNota> itens;
	private String observacao;
	
	/**
	 * Construtor com todos os campos necessários
	 * @param razaoSocial
	 * @param cnpj
	 * @param dataEmissao
	 * @param valorBruto
	 * @param impostos
	 * @param itens
	 * @param observacao
	 */
	public NotaFiscal(String razaoSocial, String cnpj, Calendar dataEmissao, double valorBruto, double impostos,
			List<ItemNota> itens, String observacao) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.dataEmissao = dataEmissao;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.itens = itens;
		this.observacao = observacao;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Calendar getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public double getImpostos() {
		return impostos;
	}

	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}

	public List<ItemNota> getItens() {
		return itens;
	}

	public void setItens(List<ItemNota> itens) {
		this.itens = itens;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Override
	public String toString() {
		return "NotaFiscal [razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", dataEmissao=" + dataEmissao
				+ ", valorBruto=" + valorBruto + ", impostos=" + impostos + "]";
	}

}
