package com.study.designpatten.commandpattern;

public class AlarmStartCommand implements Command {
	private Alarm theAlarm;

	public AlarmStartCommand(Alarm theAlarm) {
		this.theAlarm = theAlarm;
	}

	@Override
	public void excute() {
		theAlarm.start();
	}

}
