package com.study.designpatten.commandpattern;

public class LampOnCommand implements Command {
	private Lamp theLamp;

	public LampOnCommand(Lamp theLamp) {
		this.theLamp = theLamp;
	}

	@Override
	public void excute() {
		theLamp.turnOn();
	}

}
