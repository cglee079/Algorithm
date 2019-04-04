package com.baekjoon.q02863;

import java.util.Scanner;

public class Main {
	
	public void run() {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		
		String aStr = String.valueOf(a);
		String bStr = String.valueOf(b);
		
		aStr = aStr.replace("5", "6");
		bStr = bStr.replace("5", "6");
		
		int max = Integer.parseInt(aStr) + Integer.parseInt(bStr);
 	
		aStr = aStr.replace("6", "5");
		bStr = bStr.replace("6", "5");
		
		int min = Integer.parseInt(aStr) + Integer.parseInt(bStr);
		
		System.out.println(min + " " + max);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
