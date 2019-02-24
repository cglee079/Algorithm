package com.study.designpatten.commandpattern;

public class AlarmStopCommand implements Command {
	private Alarm theAlarm;

	public AlarmStopCommand(Alarm theAlarm) {
		this.theAlarm = theAlarm;
	}

	@Override
	public void excute() {
		theAlarm.stop();
	}

}
