package com.Encapsulation;

//NOTE : Mainly we use this Encapsulation for Data Security 
public class EncapsulationDemo2 {

	public static void main(String[] args) {
		EncapsulationDemo d=new EncapsulationDemo();
		d.setId(20);   //setting data
		d.setName("Mukesh");
		System.out.println("Employee id is : "+d.getId());   //getting the data
		System.out.println("Employee name is : "+d.getName());
	
		d.setId(30);
		d.setName("SANTHOSH");
		System.out.println(d.getId());
		System.out.println(d.getName());
	  
		d.setId(40);
		d.setName("HELLO");
		System.out.println(d.getId());
		System.out.println(d.getName());
		
		d.setId(50);
		d.setName("HELLO WORLD");
		System.out.println(d.getId());
		System.out.println(d.getName());
	
	}

}
