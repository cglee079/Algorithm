package com.study.sort.bubble;

import java.util.Arrays;

public class Main {
	public void sort(int[] arr) {
		int n = arr.length;

		int temp;
		for (int i = 0; i <= n - 2; i++) {
			for (int j = 0; j <= n - 2 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 10, 8, 7, 3, 2, 15, 9, 5 };
		new Main().sort(arr);
		System.out.print(Arrays.toString(arr));
	}
	
}
