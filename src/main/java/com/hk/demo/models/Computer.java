package com.hk.demo.models;

import javax.annotation.PreDestroy;

public class Computer {
	private String brand;

	public Computer() {
		super();
	}

	public Computer(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Computer object has been destroyed");
	}
}
