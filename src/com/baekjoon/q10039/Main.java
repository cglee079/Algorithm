package com.baekjoon.q10039;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = 5;
		int k;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			k = scan.nextInt();
			if(k < 40) {
				k = 40;
			}
			sum += k;
		}
		
		System.out.println(sum / n);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
