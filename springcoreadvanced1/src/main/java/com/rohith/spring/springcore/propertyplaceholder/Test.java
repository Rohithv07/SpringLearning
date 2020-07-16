package com.rohith.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test { 
	
	public static void main(String[] args) {
		ApplicationContext cnt = new ClassPathXmlApplicationContext("com/rohith/spring/springcore/propertyplaceholder/config.xml");
		MyDAO my =(MyDAO) cnt.getBean("myDAO");
		System.out.println(my);

	
}
	
}
