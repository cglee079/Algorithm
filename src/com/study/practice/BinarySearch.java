package com.study.practice;

import java.util.Arrays;

public class BinarySearch {
	int[] arr;

	public BinarySearch(int[] arr) {
		this.arr = arr;
	}

	public int search(int i) {
		int left = 0;
		int right = arr.length - 1;
		int mid;

		while (left <= right) {
			mid = (left + right) / 2;
			if (arr[mid] == i) {
				return mid;
			} else if (arr[mid] > i) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return -1;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 10, 40, 30, 20, 130, 20, 4, 20 };

		Arrays.sort(arr);

		System.out.println(new BinarySearch(arr).search(11));
	}

}
