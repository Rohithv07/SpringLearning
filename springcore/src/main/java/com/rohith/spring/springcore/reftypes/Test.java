package com.rohith.spring.springcore.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cnt = new ClassPathXmlApplicationContext("com/rohith/spring/springcore/reftypes/refconfig.xml");
		Student stud = (Student) cnt.getBean("student");
		System.out.println("Student Scores on different Subjects : " + stud);
		System.out.println("Memory type for storage : " + stud.getScores().getClass());
		
		// There are other ways for injecting also, please refer videos if in doubt and run the code.

	}

}
