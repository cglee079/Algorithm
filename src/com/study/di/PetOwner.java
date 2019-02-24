package com.study.di;


public class PetOwner {
	AnimalType animal;

	public PetOwner(AnimalType animalType) {
		this.animal = animalType;
	}

	public void doSound() {
		animal.sound();
		System.out.println("");
	}
}
