package com.danielsmanioto.notafiscal;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Pattern Builder
 * Resover o problema de objetos complexos a serem criados 
 * 
 *  Foi utilizado interfaces fluentes e method chain
 * @author DANIEL
 *
 */
public class NotaFiscalBuilderTest {
	
	@Test
	public void validar() {
		NotaFiscal nf = getNotaFiscal();

		assertEquals("Daniel Smanioto LTDA", nf.getRazaoSocial());
		assertEquals("3535679789789", nf.getCnpj());
	}

	private NotaFiscal getNotaFiscal() {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		
		builder.paraEmpresas("Daniel Smanioto LTDA")
		.comCnpj("3535679789789")
		.comItem(new ItemNota("Item 1", 100.0))
		.comItem(new ItemNota("Item 2", 200.0))
		.comItem(new ItemNota("Item 3", 300.0))
		.comObservacao("Obs")
		.naDataAtual();
				
		NotaFiscal nf = builder.constroi();
		
		return nf;
	}

}
