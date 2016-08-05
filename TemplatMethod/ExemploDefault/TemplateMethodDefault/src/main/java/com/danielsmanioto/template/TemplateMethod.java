package com.danielsmanioto.template;


/**
 * Um Template Method auxilia na definição de um algoritmo com partes do mesmo definidos por métodos abstratos. As subclasses devem se responsabilizar por estas partes abstratas, deste algoritmo, que serão implementadas, possivelmente de várias formas, ou seja, cada subclasse irá implementar à sua necessidade e oferecer um comportamento concreto construindo todo o algoritmo.
 * @author daniel
 *
 */
public abstract class TemplateMethod {
	
	public TemplateMethod() {
		System.out.println("TemplateMethod.TemplateMethod()");
	}
	
	public abstract void methodOne();

	public abstract void methodTwo();

}
