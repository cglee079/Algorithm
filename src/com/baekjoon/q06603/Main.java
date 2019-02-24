package com.baekjoon.q06603;

import java.util.Scanner;

public class Main {
	int arr[];
	boolean dp[];
	int n;

	public void back(int count, int s) {
		if (count == 6) {
			for (int j = 1; j <= n; j++) {
				if (dp[j]) {
					System.out.print(arr[j] + " ");
				}
			}
			
			System.out.print(arr[s] + " ");
			
			System.out.println("");
			return;
		}
		
		for (int i = s + 1; i <= n; i++) {
			dp[s] = true;
			back(count + 1, i);
			dp[s] = false;
		}

	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		while (true) {
			n = scan.nextInt();
			if (n == 0) {
				break;
			}

			arr = new int[n + 1];
			dp = new boolean[n + 1];
			for (int i = 1; i <= n; i++) {
				arr[i] = scan.nextInt();
			}

			for (int i = 1; i <= n - 6 + 1; i++) {
				back(1, i);
			}
			
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
