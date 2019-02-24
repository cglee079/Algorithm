//package com.baekjoon.q01958;
//
//import java.util.Scanner;
//
//public class Main {
//	public String LCS(String s1, String s2, String s3) {
//		char a[] = s1.toCharArray();
//		char b[] = s2.toCharArray();
//		
//		
//		int dp[][] = new int[s1.length() + 1][s2.length() + 1];
//		String output = "";
//		int max = 0;
//		int maxI = 0;
//		int maxJ = 0;
//
//		for (int i = 0; i < s1.length(); i++) {
//			for (int j = 0; j < s2.length(); j++) {
//				if (a[i] == b[j]) {
//					dp[i + 1][j + 1] = dp[i][j] + 1;
//
//					if (max < dp[i + 1][j + 1]) {
//						max = dp[i + 1][j + 1];
//						maxI = i;
//						maxJ = j;
//					}
//
//				} else {
//					dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
//				}
//			}
//		}
//
//		int i = maxI;
//		int j = maxJ;
//		while (i >= 0 && j >= 0) {
//			if(dp[i+1][j+1] == dp[i][j+1]) {
//				i--;
//			} else if(dp[i+1][j+1] == dp[i+1][j]) {
//				j--;
//			} else {
//				output = a[i] + output;
//				i--;
//				j--;
//			}
//		}
//		
//		return output;
//	}
//
//	public void run() {
//		Scanner scan = new Scanner(System.in);
//
//		String aa = scan.nextLine();
//		String bb = scan.nextLine();
//		String cc = scan.nextLine();
//
//		String o1 = LCS(aa, bb);
//		String o2 = LCS(bb, cc);
//		String output = LCS(o1, o2);
//		System.out.println(output.toCharArray().length);
//	}
//
//	public static void main(String[] args) {
//		new Main().run();
//	}
//
//}
