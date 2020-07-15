package com.rohith.spring.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cnt = new ClassPathXmlApplicationContext(
				"com/rohith/spring/springcore/constructorinjection/config.xml");
		Employee employee = (Employee) cnt.getBean("employee");
		System.out.println(employee);
	}

}
