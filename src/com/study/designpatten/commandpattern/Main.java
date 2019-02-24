package com.study.designpatten.commandpattern;

public class Main {
	public static void main(String[] args) {
		Lamp theLamp = new Lamp();
		Alarm theAlarm = new Alarm();
		Button button = new Button();

		button.setTheCommand(new LampOnCommand(theLamp));
		button.pressed();

		button.setTheCommand(new LampOffCommand(theLamp));
		button.pressed();

		button.setTheCommand(new AlarmStartCommand(theAlarm));
		button.pressed();

		button.setTheCommand(new AlarmStopCommand(theAlarm));
		button.pressed();

	}
}
