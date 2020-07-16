package com.rohith.spring.springcoreadvanced.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cnt = new ClassPathXmlApplicationContext(
				"com/rohith/spring/springcoreadvanced/autowiring/annotation/config.xml");
		Employee employee = (Employee) cnt.getBean("employee");
		System.out.println(employee);
	}

}
