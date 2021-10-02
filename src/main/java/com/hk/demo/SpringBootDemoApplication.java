package com.hk.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.hk.demo.models.Coder;
import com.hk.demo.models.Office;
import com.hk.demo.config.BeanConfig;
import com.hk.demo.models.Car;

@SpringBootApplication
//@ImportResource({"classpath:BeanConfig.xml"})
//@Import({ BeanConfig.class })
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
		/*
		 * // XML based DI // coder type class System.out.println("Field Injection");
		 * 
		 * Coder c1 = (Coder) context.getBean("coder1");
		 * System.out.println(c1.getName());
		 * System.out.println(c1.getComputer().getBrand());
		 * 
		 * // Car type class Car car1 = (Car) context.getBean("car1");
		 * System.out.println("Car type: "); System.out.println(car1.getType());
		 * System.out.println(car1.getTyre()); car1.start();
		 * 
		 * System.out.println("Constructor Injection"); Coder c2 = (Coder)
		 * context.getBean("coder2"); System.out.println(c2.getName());
		 * System.out.println(c2.getComputer().getBrand());
		 */

		// Java based configuration DI
		// coder type class
//		System.out.println("Field Injection");
//
//		Coder c3 = (Coder) context.getBean("coder3");
//		System.out.println(c3.getName());
//		System.out.println(c3.getComputer().getBrand());
//
//		// Car type class
//		Car car4 = (Car) context.getBean("car4");
//		System.out.println("Car type: ");
//		System.out.println(car4.getType());
//		System.out.println(car4.getTyre());
//		car4.start();
//		
//		
//		//constructor injection
//		Coder c4 = (Coder) context.getBean("coder5");
//		System.out.println(c4.getName());
//		System.out.println(c4.getComputer().getBrand());

		// AutoWired based configuration DI

		Office o1 = (Office) context.getBean(Office.class);
		o1.getEmploy();

	}

}
