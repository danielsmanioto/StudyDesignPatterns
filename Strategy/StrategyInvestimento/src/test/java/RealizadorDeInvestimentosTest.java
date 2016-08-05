import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.danielsmanioto.strategy.model.investimento.Conta;
import br.com.danielsmanioto.strategy.model.investimento.Investimento;
import br.com.danielsmanioto.strategy.model.investimento.RealizadorDeInvestimentos;
import br.com.danielsmanioto.strategy.model.investimento.impl.Arrojado;
import br.com.danielsmanioto.strategy.model.investimento.impl.Conservador;
import br.com.danielsmanioto.strategy.model.investimento.impl.Moderado;

public class RealizadorDeInvestimentosTest {

	@Test
	public void testaInvestirModerado() {
		Conta conta = new Conta(0.0);
		assertEquals(0.0, conta.getSaldo(), 0.01);
		conta.deposita(200.0);
		assertEquals(200.0, conta.getSaldo(), 0.01);

		Investimento investimento = new Moderado();
		RealizadorDeInvestimentos realizaInvestimento = new RealizadorDeInvestimentos();
		realizaInvestimento.investir(conta, investimento);
		
		realizaInvestimento.investir(conta, investimento);
		assertEquals(220.50, conta.getSaldo(), 0.01);
	}
	
	@Test
	public void testaInvestirConservado() {
		Conta conta = new Conta(0.0);
		assertEquals(0.0, conta.getSaldo(), 0.01);
		conta.deposita(200.0);
		assertEquals(200.0, conta.getSaldo(), 0.01);

		Investimento investimento = new Conservador();
		RealizadorDeInvestimentos realizaInvestimento = new RealizadorDeInvestimentos();
		realizaInvestimento.investir(conta, investimento);
		
		realizaInvestimento.investir(conta, investimento);
		assertEquals(204.02, conta.getSaldo(), 0.01);
	}
	
	@Test
	public void testaInvestirArrojado() {
		Conta conta = new Conta(0.0);
		assertEquals(0.0, conta.getSaldo(), 0.01);
		conta.deposita(200.0);
		assertEquals(200.0, conta.getSaldo(), 0.01);

		Investimento investimento = new Arrojado();
		RealizadorDeInvestimentos realizaInvestimento = new RealizadorDeInvestimentos();
		realizaInvestimento.investir(conta, investimento);
		
		realizaInvestimento.investir(conta, investimento);
		assertEquals(242.0, conta.getSaldo(), 0.01);
	}
}
