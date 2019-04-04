package com.baekjoon.q05532;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		int l = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		int dayA = a / c;
		if(a % c != 0) {
			dayA++;
		}
		
		int dayB = b / d;
		if(b % d != 0) {
			dayB++;
		}
		
		int day = dayA;
		if(dayB > dayA) {
			day = dayB;
		}
		
		System.out.println(l - day);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
