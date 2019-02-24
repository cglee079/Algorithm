package com.baekjoon.q01920;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public int find(int ar[], int f) {
		int left = 1;
		int right = ar.length - 1;
		int mid;

		while (left <= right) {
			mid = (left + right) / 2;
			if (ar[mid] > f) {
				right = mid - 1;
			} else if (ar[mid] < f) {
				left = mid + 1;
			} else {
				return 1;
			}
		}

		return 0;
	}

	public void run() {
		int n;
		int ar[];
		int k;
		int find[];

		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		ar = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			ar[i] = scan.nextInt();
		}
		Arrays.sort(ar);

		k = scan.nextInt();
		find = new int[k + 1];
		for (int i = 1; i <= k; i++) {
			find[i] = scan.nextInt();
		}

		for (int i = 1; i <= k; i++) {
			System.out.println(find(ar, find[i]));
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
