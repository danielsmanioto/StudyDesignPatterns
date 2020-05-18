package com.dsmanioto.templatemethod.templatemethod.implementation;

public abstract class AbstractClass {
	
	public void templateMethod() {
		System.out.println("AbstractClass.templateMethod");
		primitiveOperation1();
		primitiveOperation2();
	}
	
	public abstract void primitiveOperation1();
	
	public abstract void primitiveOperation2();
	
}
