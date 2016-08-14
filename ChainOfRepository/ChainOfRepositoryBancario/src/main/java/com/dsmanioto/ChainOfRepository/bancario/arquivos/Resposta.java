package com.dsmanioto.ChainOfRepository.bancario.arquivos;

import com.dsmanioto.ChainOfRepository.bancario.model.Conta;

public interface Resposta {

	public abstract String responde(Requisicao req, Conta conta);
}
