package com.baekjoon.q10250;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void lg(int h, int w, int n) {
		int y = 0;
		int x = 1;
		for(int i = 0; i < n; i++) {
			y = y + 1;
			if(y > h) {
				y = 1;
				x = x + 1;
			}
		}
		
		if(x < 10) {
			System.out.println(y + "0" + x);
		} else {
			System.out.println(y + "" + x);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> inputs = new ArrayList<>();
		int n = scan.nextInt();
		
		for(int i =0; i < n * 3; i++) {
			inputs.add(scan.nextInt());
		}
		
		for(int i = 0; i < inputs.size(); i = i + 3) {
			lg(inputs.get(i), inputs.get(i+1), inputs.get(i+2));
		}
	}
}
