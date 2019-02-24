package com.study.di;

import org.springframework.stereotype.Component;

@Component
public class Cat implements AnimalType{
	public void sound() {
		System.out.println("³Ä¿Ë");
	}
}
