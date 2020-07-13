package com.rohith.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/rohith/spring/springcore/set/setconfig.xml");
		CarDealer car = (CarDealer) ctx.getBean("cardealer");
		System.out.println("Car Name: " + car.getName());
		System.out.println("Car Models: " + car.getModels());
		System.out.println("Models Memory Type: " + car.getModels().getClass());

	}

}
