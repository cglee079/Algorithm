package com.baekjoon.q01205;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class MyCompator implements Comparator<Integer> {

	@Override
	public int compare(Integer a, Integer b) {
		if (a > b)
			return 1;
		else if (a < b)
			return -1;
		else
			return 0;
	}

}

public class Main {

	public void run() {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int me = scan.nextInt();
		int P = scan.nextInt();
		List<Integer> rank = new LinkedList<>();
		List<Integer> none = new LinkedList<>();
		int k = 0;

		for (int i = 0; i < N; i++) {
			rank.add(scan.nextInt());
		}

		rank.add(me);
		
		Collections.sort(rank, new MyCompator());
		
		boolean conti = false;
		int b, v;
		for(int i = 1; i < rank.size(); i++) {
			b = value
			value = rank.get(i);
		}
		

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
