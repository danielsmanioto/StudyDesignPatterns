package com.dsmanioto.ChainOfRepository.bancario;

public interface Resposta {

	public abstract String responde(Requisicao req, Conta conta);
}
