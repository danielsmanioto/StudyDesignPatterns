package model.orcamento;

/**
 * No padrão strategy criado uma interface e assim cada classe que a
 * implemente saber� o que fazer quando acionada.
 * 
 * @author DANIEL
 *
 */
public interface Imposto {

	double calcula(Orcamento orcamento);

}
