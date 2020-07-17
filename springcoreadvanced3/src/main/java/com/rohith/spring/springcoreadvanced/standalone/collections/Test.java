package com.rohith.spring.springcoreadvanced.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cnt = new ClassPathXmlApplicationContext(
				"com/rohith/spring/springcoreadvanced/standalone/collections/config.xml");
		ProductList productList = (ProductList) cnt.getBean("productList");
		System.out.println(productList);
		System.out.println(productList.getClass());
	}

}
