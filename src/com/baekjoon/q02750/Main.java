package com.baekjoon.q02750;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		int length = arr.length;
		int temp;

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		System.out.println("");

	}
}
