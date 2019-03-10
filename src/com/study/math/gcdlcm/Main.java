package com.study.math.gcdlcm;

public class Main {
	public int getGCD(int x, int y) {
		int temp;

		while (y != 0) {
			temp = x % y;
			x = y;
			y = temp;
		}
		
		return x;

	}

	public void run() {
		int a = 4;
		int b = 5;
		int gcd = this.getGCD(a, b);
		int lcm = (a * b) / gcd;
		System.out.println("최대공약수 : " + gcd);
		System.out.println("최소공배수 : " + lcm);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
