package com.rohith.spring.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cnt = new ClassPathXmlApplicationContext(
				"com/rohith/spring/springcore/dependencycheck/config.xml");
		Prescription prescription = (Prescription) cnt.getBean("prescription");
		System.out.println(prescription);

	}

}
