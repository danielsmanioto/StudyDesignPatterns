package com.danielsmanioto.notafiscal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Nota fiscal Builder
 * 
 *  Responsável por setar os campos de uma nota e retorna-la
 *   - Todos os campos de set retornam um NotaFiscalBuilder
 *   - Um método retorna a NotaFiscal
 *   - Os atributos são basicamente uma cópia dos atributos da nta
 * 
 * @author daniel
 *
 */
public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private List<ItemNota> itens = new ArrayList<ItemNota>();
	private double valorBruto;
	private double impostos;
	private String observacao;
	private Calendar dataAtual;
		
	/**
	 * Seta o campo razaoSocial
	 * @param razaoSocial
	 * @return
	 */
	public NotaFiscalBuilder paraEmpresas(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}
	
	/**
	 * Seta o campo cnpj
	 * @param cnpj
	 * @return
	 */
	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	
	/**
	 * Seta um item na nota
	 * @param item
	 * @return
	 */
	public NotaFiscalBuilder comItem(ItemNota item) {
		this.itens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 1.05;
		return this;
	}
	
	/**
	 * Seta a observação da nota
	 * @param observacao
	 * @return
	 */
	public NotaFiscalBuilder comObservacao(String observacao) {
		this.observacao = observacao;
		return this;
	}
	
	/**
	 * Seta a data da notsa
	 * @return
	 */
	public NotaFiscalBuilder naDataAtual(){
		this.dataAtual = Calendar.getInstance();
		return this;
	}
	
	/**
	 * Retorna uma nota fiscal 
	 * @return NotaFiscal
	 */
	public NotaFiscal constroi() {
		return new NotaFiscal(razaoSocial, cnpj, dataAtual, valorBruto, impostos, itens, observacao);
	}
	
}
