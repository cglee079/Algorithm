package com.study.practice;

import java.util.Arrays;

public class MergeSort {
	int[] arr;

	public void sort(int left, int right) {
		int mid = (left + right) / 2;
		int i = left;
		int j = mid + 1;
		int k = left;
		int sorted[] = new int[arr.length];

		while (i <= mid && j <= right) {
			if (arr[i] < arr[j]) {
				sorted[k++] = arr[i++];
			} else {
				sorted[k++] = arr[j++];
			}
		}

		if (j > right) {
			for (int l = i; l <= mid; l++) {
				sorted[k++] = arr[l];
			}
		}

		if (i > mid) {
			for (int l = j; l <= right; l++) {
				sorted[k++] = arr[l];
			}
		}

		for (int l = left; l <= right; l++) {
			arr[l] = sorted[l];
		}

	}

	public void divide(int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			divide(left, mid);
			divide(mid + 1, right);
			sort(left, right);
		}
	}

	public void run(int arr[]) {
		this.arr = arr;
		divide(0, arr.length - 1);
	}

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 3, 4, 3, 4, 100, 20, 30, 10 };
		new MergeSort().run(arr);
		System.out.println(Arrays.toString(arr));
	}
}
