package com.baekjoon.q01918;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		Stack<Character> stack = new Stack<>();
		StringBuffer output = new StringBuffer(input.length());
		char c;
		char t;
		for (int i = 0; i < input.length(); i++) {
			t = '.';
			c = input.charAt(i);

			switch (c) {
			case '+':
			case '-':
				while (!stack.isEmpty()) {
					t = stack.peek();
					if (t == '*' || t == '+' || t == '-' || t == '/') {
						output.append(stack.pop());
					} else {
						break;
					}
				}
				stack.push(c);
				break;

			case '*':
			case '/':
				while (!stack.isEmpty()) {
					t = stack.peek();
					if (t == '*' || t == '/') {
						output.append(stack.pop());
					} else {
						break;
					}
				}
				stack.push(c);
				break;

			case '(':
				stack.push(c);
				break;
			case ')':
				while(!stack.isEmpty()) {
					t = stack.pop();
					if(t == '(') { break;}
					output.append(t);
				}
				break;
			default:
				output.append(c);
			}
		}

		while (!stack.empty()) {
			output.append(stack.pop());
		}

		System.out.println(output.toString());
	}
}
