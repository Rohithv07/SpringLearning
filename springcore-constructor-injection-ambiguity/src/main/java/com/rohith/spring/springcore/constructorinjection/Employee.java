package com.rohith.spring.springcore.constructorinjection;

public class Employee {
	private Address address;
	private int id;

	Employee(int id, Address address) {
		this.id = id;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + ", id=" + id + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
