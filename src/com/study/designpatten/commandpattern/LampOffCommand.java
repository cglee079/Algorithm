package com.study.designpatten.commandpattern;

public class LampOffCommand implements Command {
	private Lamp theLamp;

	public LampOffCommand(Lamp theLamp) {
		this.theLamp = theLamp;
	}

	@Override
	public void excute() {
		theLamp.turnOff();
	}

}
