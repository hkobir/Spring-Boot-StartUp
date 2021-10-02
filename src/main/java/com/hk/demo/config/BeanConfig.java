package com.hk.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hk.demo.models.Car;
import com.hk.demo.models.Coder;
import com.hk.demo.models.Computer;
import com.hk.demo.models.Engine;

@Configuration
public class BeanConfig {
//java based Dependency Injection
	// field DI
	@Bean
	public Coder coder3(Computer computer) {
		Coder coder = new Coder();
		coder.setId(2001);
		coder.setName("Mr. rahat");
		coder.setLanguage("OOP");
		coder.setComputer(computer);
		return coder;

	}

	@Bean
	public Computer computer3() {
		Computer computer = new Computer();
		computer.setBrand("Panasonic");
		return computer;
	}

	@Bean
	public Car car4(Engine engine) {
		Car car = new Car();
		car.setType("Marcities");
		car.setTyre(3);
		car.setEngine(engine);
		return car;

	}

	@Bean
	Engine engine4() {
		Engine engine = new Engine();
		return engine;
	}

	// constructor DI
	@Bean
	public Coder coder5(Computer computer) {
		Coder coder = new Coder(2009, "Mr. rashed", "Dot Net", computer);
		return coder;

	}

}
