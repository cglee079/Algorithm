package com.study.sort.quick;

import java.util.Arrays;

public class Main {
	public int sort(int[] arr, int start, int end) {
		int pivot = arr[start];
		int left = start + 1;
		int right = end;

		do{
			while (arr[left] < pivot && left < end) {
				left++;
			}

			while (arr[right] > pivot && right > start) {
				right--;
			}

			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}

		}	while (left < right);

		int temp = arr[start];
		arr[start] = arr[right];
		arr[right] = temp;

		return right;
	}

	public void divide(int[] arr, int s, int e) {
		if (s < e) {
			int pivot = sort(arr, s, e);
			divide(arr, s, pivot - 1);
			divide(arr, pivot + 1, e);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 5, 4, 3, 2, 1 };
		Main quickSort = new Main();
		quickSort.divide(arr, 0, arr.length - 1);
		System.out.print(Arrays.toString(arr));
	}
}
