package com.rohith.spring.springcore.constructorinjection.ambuigity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cnt = new ClassPathXmlApplicationContext("com/rohith/spring/springcore/constructorinjection/ambuigity/config.xml");
		Addition addition = (Addition) cnt.getBean("addition");
		System.out.println(addition);
	}

}
