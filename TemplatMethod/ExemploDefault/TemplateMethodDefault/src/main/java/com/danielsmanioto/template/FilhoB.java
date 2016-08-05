package com.danielsmanioto.template;

public class FilhoB extends TemplateMethod {

	public FilhoB() {
		System.out.println("FilhoB.FilhoB()");
	}

	@Override
	public void methodOne() {
		System.out.println("FilhoB.methodOne()");
	}

	@Override
	public void methodTwo() {
		System.out.println("FilhoB.methodTwo()");
	}

}
