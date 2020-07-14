package com.rohith.springAssignment.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext cnt = new ClassPathXmlApplicationContext(
				"com/rohith/springAssignment/assignment/Config.xml");
		ShoppingCart shop = (ShoppingCart) cnt.getBean("shopping");
		System.out.println("Details are : " + shop);

	}
}
