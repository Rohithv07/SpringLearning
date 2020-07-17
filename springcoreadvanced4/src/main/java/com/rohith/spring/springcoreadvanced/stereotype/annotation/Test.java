package com.rohith.spring.springcoreadvanced.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cnt = new ClassPathXmlApplicationContext(
				"com/rohith/spring/springcoreadvanced/stereotype/annotation/config.xml");
		Instructor instructor = (Instructor) cnt.getBean("instructor"); // here
																		// bean
																		// automatically
																		// generate
																		// instructor
																		// object
		System.out.println(instructor);
		System.out.println(instructor.hashCode());
		

		Instructor instructor2 = (Instructor) cnt.getBean("instructor");
		System.out.println(instructor2);
		System.out.println(instructor2.hashCode());
		
		
	}

}
