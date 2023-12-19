package com.interfacedemo;

public abstract class AbstractDemo2 {
    public static final int i=10;
	abstract void FIVEG();
	public abstract void sim();
	public  void meth1() {
  System.out.println("Meth 1 form  abstract class");
	}

	public void meth2() {
		System.out.println("Meth 2 form  abstract class");
	}
	public static void main(String[] args) {
		Redmi a= new Redmi();
		a.camera();
		Mobile m= new Redmi();
		m.FIVEG();
	}
	
}
