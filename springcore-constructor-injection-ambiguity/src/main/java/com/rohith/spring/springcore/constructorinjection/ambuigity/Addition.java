package com.rohith.spring.springcore.constructorinjection.ambuigity;

public class Addition {

	Addition(int a, int b) {
		System.out.println("Inside the constructor INT");
	}

	Addition(double a, double b) {
		System.out.println("Inside the constructor double");
	}
	Addition(String a, String b) {
		System.out.println("Inside the constructor string");
	}

	/*
	 * Here if we change the order of the constructor, say first we write
	 * double, then int, then double will be invoked first. Also if we introduce
	 * a new constructor of String type, no matter what is the order, String
	 * constructor will be invoked and this is ambiguity problem.
	 * Its fixed using any of the 3 below:
	 * <constructor-arg>
	 * 				type
	 * 				index
	 * 				name
	 * </constructor-arg>
	 */
}
