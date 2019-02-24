package com.baekjoon.q01977;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	List<Integer> sosoo = new LinkedList<>();

	public boolean soinsooDevider(int value, int i) {

		int sosooo = sosoo.get(i);
		if (sosooo > value) {
			return true;
		}

		int count = 0;
		while (value % sosooo == 0) {
			value = value / sosooo;
			count++;
		}

		if (count % 2 == 0) {
			return soinsooDevider(value, i + 1);
		} else {
			return false;
		}

	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();

		boolean isSosoo;
		for (int i = 2; i <= 10000; i++) {
			isSosoo = true;
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					isSosoo = false;
					break;
				}
			}

			if (isSosoo) {
				sosoo.add(i);
			}
		}

		int result = 0;
		int min = 0;
		for (int i = M; i >= N; i--) {
			if (soinsooDevider(i, 0)) {
				result += i;
				min = i;
			}
		}

		if (result == 0) {
			System.out.println(-1);
		} else {
			System.out.println(result);
			System.out.println(min);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
