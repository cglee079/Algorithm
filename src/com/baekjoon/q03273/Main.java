package com.baekjoon.q03273;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n + 1];
		int count = 0;
		int sum;

		for (int i = 1; i <= n; i++) {
			a[i] = scan.nextInt();
		}
		sum = scan.nextInt();
		
		Arrays.sort(a);
		
		int left;
		int right;
		int mid;
		int find;
		for(int i = 1; i <= n; i++) {
			left = 1;
			right = n;
			find = sum - a[i];
			
			while(left <= right) {
				mid = (left + right) / 2;
				if(a[mid] > find) {
					right = mid - 1;
				} else if(a[mid] < find) {
					left = mid + 1;
				} else {
					count++;
					break;
				}
			}
		}
		
		System.out.println(count/2);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
