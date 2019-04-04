package com.baekjoon.q04153;

import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);

		int a;
		int b;
		int c;
		
		while(true) {
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			
			if (a == 0 && b == 0  && c == 0) {
				break;
			}
			
			if( a > c) {
				int temp = a;
				a = c;
				c = temp;
			}
			
			if( b > c) {
				int temp = b;
				b = c;
				c = temp;
			}
			
			if( (a * a) + (b * b) == (c * c)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
	}	

	public static void main(String[] args) {
		new Main().run();
	}

}
