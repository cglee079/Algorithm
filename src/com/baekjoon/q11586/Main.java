package com.baekjoon.q11586;

import java.util.Scanner;

public class Main {
	public void print(char[][] map, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println("");
		}
	}

	public void reverseCol(char[][] map, int n) {
		char temp;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n/2; j++) {
				temp = map[i][j];
				map[i][j] = map[i][n - 1- j];
				map[i][n - 1- j] = temp;
			}
		}
	}
	
	public void reverseRow(char[][] map, int n) {
		char temp;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n/2; j++) {
				temp = map[j][i];
				map[j][i] = map[n - 1 - j][i];
				map[n - 1 - j][i] = temp;
			}
		}
	}
	public void run() {
		Scanner scan = new Scanner(System.in);

		int r = scan.nextInt();
		char[][] map = new char[r][r];
		String str;
		for (int i = 0; i < r; i++) {
			str = scan.next();
			map[i] = str.toCharArray();
		}

		int status = scan.nextInt();

		switch (status) {
		case 1:
			break;
		case 2:
			reverseCol(map, r);
			break;
		case 3:
			reverseRow(map, r);
			break;
		}
		print(map, r);

	}

	public static void main(String[] args) {
		new Main().run();
	}
}
