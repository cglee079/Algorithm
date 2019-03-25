package com.study.practice;

import java.util.Arrays;

public class SelectionSort {
	public void run(int arr[]) {
		int len = arr.length;
		int min;
		int temp;
		
		for(int i = 0; i < len -1; i++) {
			min = i;
			for(int j = i + 1; j < len; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
	}
	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 3, 4, 3, 4, 100, 20, 30, 10};
		new SelectionSort().run(arr);
		System.out.println(Arrays.toString(arr));
	}
}
