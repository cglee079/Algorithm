package com.baekjoon.q10988;

import java.util.Scanner;

public class Main {

	public void run() {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		char[] cs = str.toCharArray();
		
		boolean result = true;
		for(int i = 0; i < (cs.length / 2); i++) {
			if(cs[i] != cs[cs.length - 1 - i]) {
				result = false;
				break;
			}
		}
		
		if(result) {
			System.out.print(1);
		} else {
			System.out.print(0);
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
