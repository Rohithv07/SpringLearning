package com.rohith.spring.springcore.constructorinjection.ambuigity2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cnt = new ClassPathXmlApplicationContext("com/rohith/spring/springcore/constructorinjection/ambuigity2/config.xml");
		Addition addition = (Addition) cnt.getBean("addition");
		System.out.println(addition);
	}

}
