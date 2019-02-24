package com.study.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/study/di/AppContext.xml");

		PetOwner petOwner = (PetOwner) context.getBean("PetOwner");
		petOwner.doSound();
		
		context.close();
	}
}
