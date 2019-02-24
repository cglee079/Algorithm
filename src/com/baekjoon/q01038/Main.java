/*package com.baekjoon.q01038;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int ct[];
	int cut[];
	int sum[];

	public String find(String str, int N) {

		int k = 0;
		for (int i = 0; i <= 10; i++) {
			if (sum[i] > N) {
				k = i;
				break;
			}
		}
		
		k = i;
		
		return str;
	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		String dp[] = new String[1000];
		ct = new int[10];
		cut = new int[10];
		sum = new int[10];

		ct[0] = 0;
		cut[0] = 9;
		sum[0] = 9;
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= (10 - i); j++) {
				cut[i] += j;
			}
			ct[i] = cut[i-1] - cut[i];
			sum[i] += cut[i] + sum[i - 1];
		}

		System.out.println(Arrays.toString(ct));
		System.out.println(Arrays.toString(cut));
		System.out.println(Arrays.toString(sum));

		find("", N);

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
*/