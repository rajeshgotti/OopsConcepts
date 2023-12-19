package com.FinalKeyword;

class Finaldemo {
	
	//if we place final for METHOD means we cannot overide it
	 
	//final void meth1() { 
	void meth1() {
		System.out.println("meth1 ()");
	}
}

public class FinalKeyforMethod extends Finaldemo {
	

	void meth1() {
		System.out.println("meth1 () of Final");
	}

	public static void main(String[] args) {
		FinalKeyforMethod d = new FinalKeyforMethod();
		d.meth1();

	}

}
