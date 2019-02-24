package com.study.di;

import org.springframework.stereotype.Component;

@Component
public class Dog implements AnimalType{
	public void sound() {
		System.out.println("¸Û¸Û");
	}
}
