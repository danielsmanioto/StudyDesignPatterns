
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import model.orcamento.Orcamento;
import model.orcamento.impl.ICMS;
import model.orcamento.impl.IPI;
import model.orcamento.impl.ISS;

public class ImpostoTest {

	@Test
	public void icms() {
		ICMS icms = new ICMS();
		Orcamento orcamento = new Orcamento(100.0);
		double valor = icms.calcula(orcamento);
		assertTrue(valor == 10.0);
	}

	@Test
	public void iss() {
		ISS iss = new ISS();
		Orcamento orcamento = new Orcamento(100.0);
		double valor = iss.calcula(orcamento);
		assertTrue(valor == 20.0);
	}

	@Test
	public void ipi() {
		IPI ipi = new IPI();
		Orcamento orcamento = new Orcamento(100.0);
		double valor = ipi.calcula(orcamento);
		assertTrue(valor == 5.0);
	}
}
