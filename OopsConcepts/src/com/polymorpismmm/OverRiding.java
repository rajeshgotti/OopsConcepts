package com.polymorpismmm;
//NOTE :inheritance is mandatary here by extends keyword
public class OverRiding extends MethodOverloadinfg{
  
	@Override
	public void add(int a) {
		System.out.println(a);
	}
	@Override
	public void add(int a,int b) {
		System.out.println("adding 2 elements in CHILD "+a*b);
	}public void add(String s,double d) {
		System.out.println("string is CHILD "+s+"double is "+d);
	}
	public static void main(String[] args) {
		

	}

}
