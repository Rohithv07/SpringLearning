package com.rohith.spring.springcore.dependencycheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Prescription {

	private int id;
	private String name;
	private List<String> medicineName;

	public int getId() {
		return id;
	}

	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(List<String> medicineName) {
		this.medicineName = medicineName;
	}

	@Override
	public String toString() {
		return "Prescription [id=" + id + ", name=" + name + ", medicineName=" + medicineName + "]";
	}

}
