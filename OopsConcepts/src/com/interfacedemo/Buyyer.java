package com.interfacedemo;

public class Buyyer {

	public static void main(String[] args) {
		Redmi r= new Redmi();//creating obj for child class
		r.sim();
		r.FIVEG();
		r.ram();  //prss f3 to see implementation
		r.rom();
	   

		Mobile l=new Redmi();//creating obj for child class  and refercing to parent
		l.sim();
		l.FIVEG();
		
		Sumsung s=new Sumsung();
	
	    s. FIVEG();
	    s.sim();
	    s.ram();
	    s.ram();
	  
			   
	} 
	}

