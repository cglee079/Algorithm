package com.study.sort;

import java.util.Arrays;

public class InsertionSort {

	public void sort(int[] arr) {
		int n = arr.length;

		int k;
		int i, j;
		for (i = 1; i < n; i++) {
			k = arr[i];
			for (j = i - 1; j >= 0; j--) {
				if (k < arr[j]) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}
			}

			arr[j + 1] = k;

		}

	}

	public static void main(String[] args) {
		int arr[] = { 10, 8, 1, 7, 3, 2, 15, 9, 5 };
		new InsertionSort().sort(arr);
		System.out.print(Arrays.toString(arr));
	}

}
