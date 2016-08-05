
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.danielsmanioto.decorator.orcamento.model.ICMS;
import com.danielsmanioto.decorator.orcamento.model.IPI;
import com.danielsmanioto.decorator.orcamento.model.ISS;
import com.danielsmanioto.decorator.orcamento.model.Imposto;
import com.danielsmanioto.decorator.orcamento.model.Orcamento;

public class DecoratorTest {

	@Test
	public void calculartodosImpostos() {
		Imposto ipi = new IPI(new ISS(new ICMS()));

		Orcamento orcamento = new Orcamento(100);

		double resultado = ipi.calcula(orcamento);

		assertTrue(resultado == 45.0);
	}

	@Test
	public void calcularIpi() {
		Imposto ipi = new IPI();

		Orcamento orcamento = new Orcamento(100);

		double resultado = ipi.calcula(orcamento);

		assertTrue(resultado == 10.0);
	}

	@Test
	public void calcularIpiComIpi() {
		Imposto ipi = new IPI(new IPI());

		Orcamento orcamento = new Orcamento(100);

		double resultado = ipi.calcula(orcamento);

		assertTrue(resultado == 20.0);
	}

}
