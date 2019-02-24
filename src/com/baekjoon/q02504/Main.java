package com.baekjoon.q02504;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static final char A_ = '(';
	public static final char _A = ')';
	public static final char B_ = '[';
	public static final char _B = ']';
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		Stack<Character> stck = new Stack<>();
		Stack<Character> stckCal = new Stack<>();
		Stack<Integer> stckNum = new Stack<>();
		
		char k;
		char kBefore = '-';
		for(int i = 0; i < input.length(); i++) {
			k = input.charAt(i);
			if(i>0) {kBefore = input.charAt(i-1);}
			if(k == A_ || k == B_) {
				if(kBefore == A_ || kBefore == B_) {
					stckCal.push('*');
				} else if (kBefore == _A || kBefore == _B){
					stckCal.push('+');
				}
				stck.push(input.charAt(i));
			} else if(k == _A) {
				stck.pop();
				stckNum.push(2);
			} else if(k == _B) {
				stck.pop();
				stckNum.push(3);
			}
		}
		
		while(!stckNum.empty() && !stckCal.empty()) {
			System.out.print(stckNum.pop());
			System.out.print(stckCal.pop());
		}
		System.out.print(stckNum.pop());
		
	}
}
