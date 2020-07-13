package com.rohith.spring.springcore.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cnt = new ClassPathXmlApplicationContext(
				"com/rohith/spring/springcore/property/propertyconfig.xml");
		Languages language = (Languages) cnt.getBean("language");

		System.out.println("Country and Languages : " + language.getCountryAndLangs());
		System.out.println("Memory Type : " + language.getCountryAndLangs().getClass());

	}

}
