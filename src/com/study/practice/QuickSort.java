package com.study.practice;

import java.util.Arrays;

public class QuickSort {
	int[] arr;

	public void swap(int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public int sort(int left, int right) {
		int pivot = arr[left];
		int l = left + 1;
		int r = right;

		do {
			while (arr[l] < pivot && l < right) {
				l++;
			}
			while (arr[r] >= pivot && r > left) {
				r--;
			}

			if (l < r) {
				swap(l, r);
			}
			
		} while (l < r);

		swap(left, r);

		return r;
	}

	public void partition(int left, int right) {
		if (left < right) {
			int p = sort(left, right);
			partition(left, p);
			partition(p + 1, right);
		}
	}

	public void run(int arr[]) {
		this.arr = arr;
		partition(0, arr.length - 1);
	}

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 3, 4, 3, 4, 100, 20, 30, 10 };
		new QuickSort().run(arr);
		System.out.println(Arrays.toString(arr));
	}
}
