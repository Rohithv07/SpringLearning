package com.spring.ui;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.Address;
import com.spring.app.AddressBook;

public class Driver {

	@SuppressWarnings("resource")
	public static AddressBook loadAddressBook() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		AddressBook ad = (AddressBook)ctx.getBean("addrObj");
		return ad;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// invoke the loadAddressBook() method from main retrieve the
		// AddressBook object, get the details from the user set the values and
		// display the values
		AddressBook ad = loadAddressBook();
		Address a = new Address();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temporary address");
		System.out.println("Enter the house name");
		String name = sc.nextLine();
		System.out.println("Enter the street");
		String street = sc.nextLine();
		System.out.println("Enter the city");
		String city = sc.nextLine();
		System.out.println("Enter the state");
		String state = sc.nextLine();
		System.out.println("Enter the phone number");
		String phone = sc.nextLine();
		a.setHouseName(name);
		a.setStreet(street);
		a.setCity(city);
		a.setState(state);
		ad.setPhoneNumber(phone);

		System.out.println("Temporary address");
		System.out.println("House name:" + a.getHouseName());
		System.out.println("Street:" + a.getStreet());
		System.out.println("City:" + a.getCity());
		System.out.println("State:" + a.getState());
		System.out.println("Phone number :" + ad.getPhoneNumber());
	}

}