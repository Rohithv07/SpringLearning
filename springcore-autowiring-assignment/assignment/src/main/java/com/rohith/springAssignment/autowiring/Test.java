package com.rohith.springAssignment.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cnt = new ClassPathXmlApplicationContext(
				"com/rohith/springAssignment/autowiring/Config.xml");
		Customer customer = (Customer) cnt.getBean("customer");
		System.out.println(customer);
	}
}
