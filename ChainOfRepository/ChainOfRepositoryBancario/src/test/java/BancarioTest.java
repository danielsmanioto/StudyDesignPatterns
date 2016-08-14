
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dsmanioto.ChainOfRepository.bancario.arquivos.Formato;
import com.dsmanioto.ChainOfRepository.bancario.arquivos.Requisicao;
import com.dsmanioto.ChainOfRepository.bancario.arquivos.Resposta;
import com.dsmanioto.ChainOfRepository.bancario.arquivos.impl.RespostaEmCvs;
import com.dsmanioto.ChainOfRepository.bancario.arquivos.impl.RespostaEmPorcento;
import com.dsmanioto.ChainOfRepository.bancario.arquivos.impl.RespostaEmXml;
import com.dsmanioto.ChainOfRepository.bancario.model.Conta;

public class BancarioTest {

	@Test
	public void csv() {
		Conta conta = new Conta("Daniel", 800);

		Requisicao req = new Requisicao(Formato.CSV);

		Resposta r3 = new RespostaEmPorcento();
		Resposta r2 = new RespostaEmCvs(r3);
		Resposta r1 = new RespostaEmXml(r2);

		assertEquals("Daniel;800.0", r1.responde(req, conta));
	}

	@Test
	public void porcento() {
		Conta conta = new Conta("Daniel", 800);

		Requisicao req = new Requisicao(Formato.PORCENTO);

		Resposta r3 = new RespostaEmPorcento();
		Resposta r2 = new RespostaEmCvs(r3);
		Resposta r1 = new RespostaEmXml(r2);

		assertEquals("Daniel%800.0", r1.responde(req, conta));
	}

	@Test
	public void xml() {
		Conta conta = new Conta("Daniel", 800);

		Requisicao req = new Requisicao(Formato.XML);

		Resposta r3 = new RespostaEmPorcento();
		Resposta r2 = new RespostaEmCvs(r3);
		Resposta r1 = new RespostaEmXml(r2);

		assertEquals("<conta><titular>Daniel</titular><saldo>800.0</saldo></conta>", r1.responde(req, conta));
	}
}
