package com.rohith.spring.springcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cnt = new ClassPathXmlApplicationContext(
				"com/rohith/spring/springcore/innerbeans/config.xml");
		Employee employee = (Employee) cnt.getBean("employee");
		System.out.println(employee);
		Employee employee2 = (Employee) cnt.getBean("employee");
		System.out.println(employee2);

		// Here when we check for the hashcode with employee.hashCode()
		// and employee2.hashcode(), we can see its exactly the same.
		// but when we change the scope to prototype in config.xml, its no
		// longer the same.
		// scope="singleton" is the default scope
	}

}
