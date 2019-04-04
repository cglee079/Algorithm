package com.baekjoon.q02908;

import java.util.Scanner;

public class Main {
	public int reverse(int v) {
		int answer = 0;
		int index = 2;
		int m;

		while (v >= 10) {
			m = v % 10;
			for (int i = 0; i < index; i++) {
				m *= 10;
			}
			answer += m;
			v = v / 10;
			index--;
		}

		if (v != 0) {
			answer += v;
		}

		return answer;
	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		int reverseA = reverse(a);
		int reverseB = reverse(b);

		if (reverseA > reverseB) {
			System.out.print(reverseA);
		} else {
			System.out.print(reverseB);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
