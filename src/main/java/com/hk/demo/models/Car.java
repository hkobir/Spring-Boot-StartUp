package com.hk.demo.models;

public class Car {
	private int tyre;
	private String type;
	private Engine engine;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(int tyre, String type, Engine engine) {
		super();
		this.tyre = tyre;
		this.type = type;
		this.engine = engine;
	}

	public int getTyre() {
		return tyre;
	}

	public void setTyre(int tyre) {
		this.tyre = tyre;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void start() {
		engine.start();
	}
	
}
