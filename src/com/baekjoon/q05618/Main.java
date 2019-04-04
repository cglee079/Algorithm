package com.baekjoon.q05618;

import java.util.Scanner;

public class Main {
	public int getGcd(int a, int b) {
		int temp;
		while (b != 0) {
			temp = a;
			a = b;
			b = temp % b;
		}
		
		return a;
	}
	
	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int[] k = new int[n];

		for (int i = 0; i < n; i++) {
			k[i] = scan.nextInt();
		}
		
		int gcd = getGcd(k[0], k[1]);
		if(n == 3) {
			gcd = getGcd(gcd, k[2]);
		}
		
		boolean flag = false;
		for (int i = 1; i <= gcd; i++) {
			flag = true;
			for (int j = 0; j < n; j++) {
				if (k[j] % i != 0) {
					flag = false;
				}
			}

			if (flag) {
				System.out.println(i);
			}

		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
