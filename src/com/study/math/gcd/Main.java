package com.study.math.gcd;

import java.util.Scanner;

public class Main {
	public int getGCD(int x, int y) {
		int temp;

		int m = 1;
		while (m != 0) {
			if (y > x) {
				temp = x;
				x = y;
				y = temp;
			}

			m = x % y;
			if(m == 0) {
				break;
			}
			x = y;
			y = m;
		}
		
		return y;

	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println(getGCD(a, b));
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
