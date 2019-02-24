package com.study.designpatten.observerpattern;

import java.util.LinkedList;
import java.util.List;

public class ScoreRecord extends Subject {
	private List<Integer> scores = new LinkedList<>();

	public void addScore(int s) {
		scores.add(s);

		notifyObservers();
	}

	public List<Integer> getScores() {
		return scores;
	}
}
