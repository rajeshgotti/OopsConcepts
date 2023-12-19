package com.polymorpismmm;
 
public class MethodOverloadinfg {
	
	public void add(int a) {
		System.out.println(a);
	}
	public void add(int a,int b) 
	{
		System.out.println("adding 2 elements "+a*b);
	}public void add(String s,double d)
	{
		System.out.println("string is"+s+"double is "+d);
	}

	public static void main(String[] args) {
		MethodOverloadinfg d=new MethodOverloadinfg();
		
		d.add(10, 20);
		d.add(10);
		d.add("java", 2.0);

	}

}
