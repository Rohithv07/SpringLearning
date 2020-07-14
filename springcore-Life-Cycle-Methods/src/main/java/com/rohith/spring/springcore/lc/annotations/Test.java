package com.rohith.spring.springcore.lc.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext cnt = new ClassPathXmlApplicationContext(
				"com/rohith/spring/springcore/lc/annotations/config.xml");
		Patient patient = (Patient) cnt.getBean("patient");
		System.out.println("Patient id : " + patient);
		cnt.registerShutdownHook();

	}

}
