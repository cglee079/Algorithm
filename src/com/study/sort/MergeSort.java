package com.study.sort;

import java.util.Arrays;

public class MergeSort {
	int arr[] = { 10, 8, 1, 7, 3, 2, 15, 9, 5 };

	public void sort(int s, int mid, int e) {
		int k = s;
		int i = s;
		int j = mid + 1;
		int[] temp = new int[arr.length];

		while (i <= mid && j <= e) {
			if (arr[i] < arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}

		if (j > e) {
			for (int l = i; l <= mid; l++) {
				temp[k++] = arr[l];
			}
		} 
		
		if (i > mid) {
			for (int l = j; l <= e; l++) {
				temp[k++] = arr[l];
			}
		}

		for (int l = s; l <= e; l++) {
			arr[l] = temp[l];
		}

	}

	public void divide(int s, int e) {
		if (s < e) {
			int mid = (s + e) / 2;
			divide(s, mid);
			divide(mid + 1, e);
			sort(s, mid, e);
		}
	}

	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();
		mergeSort.divide(0, mergeSort.arr.length - 1);
		System.out.print(Arrays.toString(mergeSort.arr));
	}
}
