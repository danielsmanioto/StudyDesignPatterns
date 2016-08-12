package com.dsmanioto.ChainOfRepository.orcamento;


/**
 * O pattern Chain of Responsibility ajuda a solucionar o problema de multiplos ifs
 * @author DANIEL
 *
 */
public interface Desconto {

	double desconta(Orcamento orcamento);
	
	void setProximo(Desconto proximo);
	
}
