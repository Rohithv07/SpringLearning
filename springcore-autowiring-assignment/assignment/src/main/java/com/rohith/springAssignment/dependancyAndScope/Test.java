package com.rohith.springAssignment.dependancyAndScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cnt = new ClassPathXmlApplicationContext(
				"com/rohith/springAssignment/dependancyAndScope/Config.xml");
		University university = (University) cnt.getBean("university");
		System.out.println(university);
		System.out.println("Hash code is : " + university.hashCode());
		
		University university2 = (University) cnt.getBean("university");
		System.out.println(university2);
		System.out.println("Hash code is : " + university2.hashCode());
		
		
	}

}
