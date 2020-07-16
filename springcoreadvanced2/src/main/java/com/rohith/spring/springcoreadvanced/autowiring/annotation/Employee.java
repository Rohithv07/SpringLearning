package com.rohith.spring.springcoreadvanced.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	//@Autowired
	
	@Autowired(required=false)
	@Qualifier("address123")
	private Address address;
	
	//@Autowired(required=false)
	Employee(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	//@Autowired - it can be used at field as well as property level
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
