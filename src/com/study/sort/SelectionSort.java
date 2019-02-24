package com.study.sort;

import java.util.Arrays;

public class SelectionSort {
	public void sort(int[] arr) {
		int n = arr.length;

		int min, temp;
		for (int i = 0; i < n - 1; i++) {
			min = i;
			for (int j = i; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 10, 8, 7, 3, 2, 15 };
		new SelectionSort().sort(arr);
		System.out.print(Arrays.toString(arr));
	}

}
