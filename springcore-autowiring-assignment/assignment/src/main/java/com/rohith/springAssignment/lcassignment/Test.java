package com.rohith.springAssignment.lcassignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext cnt = new ClassPathXmlApplicationContext(
				"com/rohith/springAssignment/lcassignment/Config.xml");
		TicketReservation ticket = (TicketReservation) cnt.getBean("ticket");
		System.out.println(ticket);
		cnt.registerShutdownHook();
	}

}
