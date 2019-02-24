package com.study.designpatten.commandpattern;

public class Button {
	private Command theCommand;

	public void setTheCommand(Command theCommand) {
		this.theCommand = theCommand;
	}

	public void pressed() {
		theCommand.excute();
	}
}
