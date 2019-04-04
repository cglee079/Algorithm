package com.baekjoon.q10984;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		int k;
		int c;
		int cs;
		double g;
		double sum;
		for(int i = 0; i < n; i++) {
			k = scan.nextInt();
			cs = 0;
			sum = 0;
			for(int j = 0; j < k ; j++) {
				c = scan.nextInt();
				g = scan.nextDouble();
				sum += (c * g);
				cs += c;
			}
			
			System.out.println(cs + " " + String.format("%.1f", (sum/cs)));
		}
	}	

	public static void main(String[] args) {
		new Main().run();
	}

}
