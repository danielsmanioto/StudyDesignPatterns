package com.danielsmanioto.template;

public class FilhoA extends TemplateMethod {

	public FilhoA() {
		System.out.println("FilhoA.FilhoA()");
	}

	@Override
	public void methodOne() {
		System.out.println("FilhoA.methodOne()");
	}

	@Override
	public void methodTwo() {
		System.out.println("FilhoA.methodTwo()");
	}

}
