package com.rohith.spring.springcore.constructorinjection.ambuigity2;

public class Addition {
	
	Addition(int a, double b) {
		System.out.println("Inside the constructor");
		System.out.println(a);
		System.out.println(b);
	}

}
