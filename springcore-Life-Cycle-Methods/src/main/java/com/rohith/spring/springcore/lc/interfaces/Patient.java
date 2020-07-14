package com.rohith.spring.springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {
	private int id;

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public void init() {
		System.out.println("Inside the init() method");
	}

	public void destroy1() {
		System.out.println("Inside the destroy() method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("Inside afterPropertiesSet()");

	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside destroy()");

	}

}
