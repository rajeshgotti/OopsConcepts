package com.interfacedemo;

public interface Mobile {
	 int i = 10; //by default all variables in interface is public static final
	 public static final int j = 20;

	void sim();// by default all methods  in interface are public abstract

	void FIVEG();

	public abstract void ram();

	public void rom();

	// from 1.8versin
	default void hello() {
		meth5();
		System.out.println("default methond");
	}

	static void staticmeth() {
		meth5();

		System.out.println("static ()");
	}

	private static void meth5() {
		System.out.println("commond code");
	}

}
