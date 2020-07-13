package com.rohith.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cnt = new ClassPathXmlApplicationContext("com/rohith/spring/springcore/map/mapconfig.xml");
		Customer customer = (Customer) cnt.getBean("customer");
		System.out.println("Customer Id : " + customer.getId());
		System.out.println("Products : " + customer.getProduct());
		System.out.println("Product Type : " + customer.getProduct().getClass());

	}

}
