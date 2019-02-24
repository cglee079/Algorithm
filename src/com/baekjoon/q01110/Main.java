package com.baekjoon.q01110;

import java.util.Scanner;

public class Main {
	public int[] getAB(int v) {
		int a, b;
		if (v < 10) {
			a = 0;
		} else {
			a = v / 10;
		}

		b = v - a * 10;

		int result[] = new int[2];
		result[0] = a;
		result[1] = b;
		return result;
	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int v = N;
		int a, b, sum;
		int cycle = 0;

		int result[];
		do {
			cycle++;
			result = getAB(v);
			sum = result[0] + result[1];
			a = result[1];
			b = getAB(sum)[1];
			v = a * 10 + b;

		} while (v != N);

		System.out.println(cycle);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
