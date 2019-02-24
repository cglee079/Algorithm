package com.study.designpatten.observerpattern;

import java.util.List;

public class DataSheetView implements Observer {
	private ScoreRecord scoreRecord;
	private int n;

	public DataSheetView(ScoreRecord scoreRecord, int n) {
		this.scoreRecord = scoreRecord;
		this.n = n;
	}

	public void update() {
		List<Integer> scores = scoreRecord.getScores();
		displayScores(scores);
	}

	private void displayScores(List<Integer> scores) {
		System.out.print(n + "°³ Ãâ·Â SHEET ");
		for (int i = 0; i < n && i < scores.size(); i++) {
			System.out.print(scores.get(i) + " ");
		}
		System.out.println("");
	}
}
