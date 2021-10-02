package com.hk.demo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Office {
	@Autowired
	private Employ employ;

	public Office() {
		
	}

	public void getEmploy() {
		 employ.getEmployInfo();
	}
}
