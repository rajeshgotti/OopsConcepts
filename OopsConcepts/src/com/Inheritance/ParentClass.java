package com.Inheritance;
//data reusability
public class ParentClass {

	public ParentClass() {
		System.out.println("THIS IS PARENT DC");
	}

	public int id = 10;
	public String name = "Java";
	public double sal;

	public static void main(String[] args) {
		ParentClass D1 = new ParentClass();
		System.out.println("ID is :" + D1.id);
		System.out.println("Name is :" + D1.name);
		System.out.println("Sal is : " + D1.sal); // sal is 0 bx we not assign value
	}
}
