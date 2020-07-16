package com.rohith.spring.springcoreadvanced.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cnt = new ClassPathXmlApplicationContext(
				"com/rohith/spring/springcoreadvanced/autowiring/config.xml");
		Employee employee = (Employee) cnt.getBean("employee");
		System.out.println(employee);
	}

	/* For byType autowiring, change autowire="byType"
	 * For byName autowiring, do autowire="byName"
	 * 
	 */
}
