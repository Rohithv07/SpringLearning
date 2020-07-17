package com.rohith.springAssignment.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	private String name;
	private Reservation reservation;

	@Autowired
	Customer(String name, Reservation reservation) {
		this.name = name;
		this.reservation = reservation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", reservation=" + reservation + "]";
	}
}
