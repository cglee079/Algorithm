package com.study.designpatten.observerpattern;

import java.util.Collections;
import java.util.List;

public class MinMaxSheetView implements Observer{
	private ScoreRecord scoreRecord;

	public MinMaxSheetView(ScoreRecord scoreRecord) {
		this.scoreRecord = scoreRecord;
	}

	public void update() {
		List<Integer> scores = scoreRecord.getScores();
		displayScores(scores);
	}

	private void displayScores(List<Integer> scores) {
		System.out.print("�ּҰ�, �ִ밪 ��� SHEET  ");
		System.out.print(Collections.min(scores) + " ");
		System.out.print(Collections.max(scores) + " ");
		System.out.println("");
	}
}
