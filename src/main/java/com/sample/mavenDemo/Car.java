package com.sample.mavenDemo;
import org.springframework.stereotype.Component;


@Component
public class Car implements Vehicle {
	
	public void drive()  {
		System.out.println("Its a car drive");
	}

}
