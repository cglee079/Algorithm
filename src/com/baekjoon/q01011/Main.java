package com.baekjoon.q01011;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void logic(int x, int y) {
		int k = 0;
		
	}
	
	public static void main(String[] args) {
		List<Integer> inputs = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		int tNumber = scan.nextInt();
		for(int i = 0;  i < tNumber * 2; i++) {
			inputs.add(scan.nextInt());
		}
		
		for(int i = 0; i < inputs.size(); i = i + 2) {
			logic(inputs.get(i), inputs.get(i+1));
		}
		
	}
}
