package com.baekjoon.q05598;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		char[] c = str.toCharArray();
		for(int i = 0; i < c.length; i++) {
			c[i] = (char)((int) c[i] - 3);
			if(c[i] < 'A') {
				c[i] = (char) (c[i] + ('Z' - 'A' + 1));
			}
		}
		
		System.out.println(new String(c));
	}

	public static void main(String[] args) {
		new Main().run();
	}

}