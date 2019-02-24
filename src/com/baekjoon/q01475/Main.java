package com.baekjoon.q01475;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int number[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int rs = 0;
		Scanner scan = new Scanner(System.in);
		String ns = scan.nextLine();

		for (int i = 0; i < ns.length(); i++) {
			int k = Integer.parseInt(ns.substring(i,i+1));
			if(k == 9) {k = 6;}
			number[k] = number[k] + 1;
		}
		
		for(int i = 0; i < number.length; i++) {
			if(number[i] > 0 && i == 6 ) {
				int k = number[i]/2;
				if((number[i]%2) != 0) {
					k ++;
				}
				if(rs < k) {
					rs = k;
				}
			} else if(number[i] > 0 && i != 6 && rs < (number[i])){
				rs = number[i];
			}
		}
		
		System.out.println(rs);		
	}
}
