package com.study.sort.merge;

import java.util.Scanner;

public class Main {
	private int list[];
	private int sorted[];

	public void merge(int left, int right) {
		int i, m, j, r, k;
		i = left;
		m = (left + right) / 2;
		r = right;
		j = m + 1;
		k = left;

		while (i <= m && j <= r) {
			if (list[i] > list[j]) {
				sorted[k++] = list[i++];
			} else {
				sorted[k++] = list[j++];
			}
		}

		int l;
		if (i > m) {
			for (l = j; l <= r; l++) {
				sorted[k++] = list[l];
			}
		} else {
			for (l = i; l <= m; l++) {
				sorted[k++] = list[l];
			}
		}

		for (l = left; l <= r; l++) {
			list[l] = sorted[l];
		}
		
		
		

	}

	public void mergeSort(int left, int right) {
		int mid;

		if (left < right) {
			mid = (left + right) / 2;

			mergeSort(left, mid);
			mergeSort(mid + 1, right);
			merge(left, right);
		}

	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		list = new int[n];
		sorted = new int[n];

		for (int i = 0; i < n; i++) {
			list[i] = scan.nextInt();
		}

		mergeSort(0, n - 1);

		for(int i = 0; i < n; i++) {
			System.out.println(list[i]);
		}
		
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
