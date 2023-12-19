package com.AbstractDemo;

@FunctionalInterface
public interface Functional_interfacedemo {
	
	public void meth1();
	
	static void meth2() {
		System.out.println("meth 1");
	}
	static void meth3() {
		System.out.println("Meth2");
	}
	default void meth4() {
		System.out.println("meth4");
	}
	default void meth5() {
		System.out.println("meth5");
	}
	public static void main(String[] args) {
		Functional_interfacedemo.meth2();
		Functional_interfacedemo.meth3();
	}

}
