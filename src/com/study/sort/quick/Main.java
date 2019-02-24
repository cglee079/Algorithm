package com.study.sort.quick;

import java.util.Scanner;

public class Main {
	int list[];

	public void swap(int i, int j) {
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}

	public int partipication(int left, int right) {
		int low = left;
		int high = right + 1;
		int pivot = list[left];

		do {
			do {
				low++;
			} while (low <= right && list[low] < pivot);

			do {
				high--;
			} while (high >= left && list[high] > pivot);

			if (low < high) {
				swap(low, high);
			}
		} while (low < high);

		swap(left, high);

		return high;

	}

	public void quickSort(int left, int right) {

		if (left < right) {
			int p = partipication(left, right);
			quickSort(left, p);
			quickSort(p + 1, right);
		}
	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		list = new int[n];

		for (int i = 0; i < n; i++) {
			list[i] = scan.nextInt();
		}

		quickSort(0, n - 1);
		
		for (int i = 0; i < n; i++) {
			System.out.println(list[i]);
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}
}
