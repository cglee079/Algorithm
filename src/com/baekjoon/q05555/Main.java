//실패!!! 

//package com.baekjoon.q05555;
//
//import java.util.Scanner;
//
//public class Main {
//
//	public void run() {
//		Scanner scan = new Scanner(System.in);
//
//		String find = scan.next();
//		char[] findChar = find.toCharArray();
//		int n = scan.nextInt();
//
//		int count = 0;
//		String str;
//		char[] c;
//		int index;
//		for (int i = 0; i < n; i++) {
//			str = scan.next();
//			str += str;
//			c = str.toCharArray();
//			index = 0;
//
//			for (int j = 0; j < c.length; j++) {
//				if (c[j] == findChar[index]) {
//					index++;
//					if (index == findChar.length) {
//						index = 0;
//						count++;
//						break;
//					}
//				} else {
//					if (index != 0) {
//						j = j - index + 1;
//					}
//					index = 0;
//				}
//			}
//		}
//
//		System.out.println(count);
//
//	}
//
//	public static void main(String[] args) {
//		new Main().run();
//	}
//
//}
