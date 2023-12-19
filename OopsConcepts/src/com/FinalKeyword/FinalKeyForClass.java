package com.FinalKeyword;

//if we declare class as final we cannot extends it
  class FinalDemo2
{
	void fun()
	{
		System.out.println("hello ");
	}
}


public class FinalKeyForClass extends FinalDemo2{

	public static void main(String[] args) {
		FinalKeyForClass f=new FinalKeyForClass();
                   f.fun();
	}

}
