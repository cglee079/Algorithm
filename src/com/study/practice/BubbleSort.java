package com.study.practice;

import java.util.Arrays;

public class BubbleSort {
	public void run(int arr[]) {
		int n = arr.length;

		int temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j + 1] < arr[j]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 3, 4, 3, 4, 100, 20, 30, 10 };
		new BubbleSort().run(arr);
		System.out.println(Arrays.toString(arr));
	}
}
