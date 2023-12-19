package com.Inheritance;

public class Ambiguty2 extends Ambiguty1{
   
	public void meth3()
	{
		System.out.println("METH3 ()");
	}public void meth4()
	{
		System.out.println("METH4 ()");
	}
	
	public static void main(String[] args) {
		
		Ambiguty2 a=new Ambiguty2();
		a.meth1();
		a.meth2();
		a.meth3();
		a.meth4();
	}

}
