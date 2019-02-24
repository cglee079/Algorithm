package com.study.designpatten.observerpattern;

import java.util.LinkedList;
import java.util.List;

public class Subject {
	private List<Observer> observers = new LinkedList<>();

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void detach(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			observers.get(i).update();
		}
	}
}
