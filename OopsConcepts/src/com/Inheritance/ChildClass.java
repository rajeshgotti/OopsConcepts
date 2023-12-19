package com.Inheritance;
//NOTE : Adv of inheritance is 1. Reusability 


public class ChildClass extends ParentClass {
	public ChildClass() {
		System.out.println("This is CHILD DC");
	}

	public double sal = 20.000;

	public static void main(String[] args) {
		ChildClass d = new ChildClass();
		System.out.println(d.id);
		System.out.println(d.name);
		System.out.println("Child salry is : " + d.sal);
	}

}
