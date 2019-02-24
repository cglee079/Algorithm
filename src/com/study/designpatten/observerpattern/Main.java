package com.study.designpatten.observerpattern;

public class Main {
	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord();
		scoreRecord.attach(new DataSheetView(scoreRecord, 1));
		scoreRecord.attach(new DataSheetView(scoreRecord, 2));
		scoreRecord.attach(new DataSheetView(scoreRecord, 3));
		scoreRecord.attach(new DataSheetView(scoreRecord, 4));
		scoreRecord.attach(new DataSheetView(scoreRecord, 5));
		scoreRecord.attach(new MinMaxSheetView(scoreRecord));

		scoreRecord.addScore(10);
		scoreRecord.addScore(20);
		scoreRecord.addScore(30);
		scoreRecord.addScore(40);
		scoreRecord.addScore(50);
	}
}
