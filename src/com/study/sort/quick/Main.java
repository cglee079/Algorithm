package com.study.sort.quick;

import java.util.Arrays;

class QuickSort {
	int arr[];
	int n;

	public QuickSort(int arr[]) {
		this.arr = arr;
		this.n = arr.length;
	}
	
	public void run() {
		this.divide(0, n - 1);
	}

	public void swap(int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public int partition(int left, int right) {
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

	public void divide(int left, int right) {
		if (left < right) {
			int mid = partition(left, right);
			divide(left, mid);
			divide(mid + 1, right);
		}
	}

}

public class Main {
	public static void main(String[] args) {
		int arr[] = { 0, 1};
		new QuickSort(arr).run();
		System.out.print(Arrays.toString(arr));
	}
}
