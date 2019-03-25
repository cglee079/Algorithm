package com.baekjoon.q02443;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int S;
		for (int i = 0; i < N; i++) {
			S = N * 2 - (i * 2) - 1;
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < S; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
