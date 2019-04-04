package com.study.practice;

import java.util.ArrayList;
import java.util.List;

public class MyString {
	String str;

	public MyString(String str) {
		this.str = str;
	}

	public MyString replace(String oldStr, String newStr) {
		if (oldStr.length() == 0) {
			return this;
		}

		List<Character> changed = new ArrayList<>();
		char[] c = this.str.toCharArray();
		char[] oldChar = oldStr.toCharArray();
		char[] newChar = newStr.toCharArray();

		int index = 0;
		for (int i = 0; i < c.length; i++) {

			if (c[i] != oldChar[index] && index == 0) {
				changed.add(c[i]);
			} else if (c[i] != oldChar[index] && index != 0) {
				for (int j = i - index; j <= i; j++) {
					changed.add(c[j]);
				}
				index = 0;
			} else if (c[i] == oldChar[index] && index == oldChar.length - 1) {
				for (int j = 0; j < newChar.length; j++) {
					changed.add(newChar[j]);
				}
				index = 0;
			} else if (c[i] == oldChar[index] && index != oldChar.length - 1 && i == c.length - 1) {
				for (int j = i - index; j <= i; j++) {
					changed.add(c[j]);
				}
				index = 0;
			} else if (c[i] == oldChar[index] && index != oldChar.length - 1 && i != c.length - 1) {
				index++;
			}
		}

		StringBuilder stb = new StringBuilder();
		for (int i = 0; i < changed.size(); i++) {
			stb.append(changed.get(i));
		}

		return new MyString(stb.toString());
	}

	public MyString remove(String removeStr) {
		if (removeStr.length() == 0) {
			return this;
		}

		List<Character> changed = new ArrayList<>();
		char[] c = this.str.toCharArray();
		char[] oldChar = removeStr.toCharArray();

		int index = 0;
		for (int i = 0; i < c.length; i++) {

			if (c[i] != oldChar[index] && index == 0) {
				changed.add(c[i]);
			} else if (c[i] != oldChar[index] && index != 0) {
				for (int j = i - index; j <= i; j++) {
					changed.add(c[j]);
				}
				index = 0;
			} else if (c[i] == oldChar[index] && index == oldChar.length - 1) {
				index = 0;
			} else if (c[i] == oldChar[index] && index != oldChar.length - 1 && i == c.length - 1) {
				for (int j = i - index; j <= i; j++) {
					changed.add(c[j]);
				}
				index = 0;
			} else if (c[i] == oldChar[index] && index != oldChar.length - 1 && i != c.length - 1) {
				index++;
			}
		}

		StringBuilder stb = new StringBuilder();
		for (int i = 0; i < changed.size(); i++) {
			stb.append(changed.get(i));
		}

		return new MyString(stb.toString());
	}

	public MyString reverse() {
		char[] c = this.str.toCharArray();
		char[] reversed = new char[c.length];

		for (int i = 0; i < c.length; i++) {
			reversed[i] = c[c.length - 1 - i];
		}

		return new MyString(new String(reversed));
	}

	public MyString reverse2() {
		char[] c = this.str.toCharArray();
		char temp;
		for (int i = 0; i < (c.length / 2); i++) {
			temp = c[i];
			c[i] = c[c.length - 1 - i];
			c[c.length - 1 - i] = temp;
		}

		return new MyString(new String(c));
	}

	@Override
	public String toString() {
		return str;
	}

	public static void main(String[] args) {
		MyString str = new MyString("AD");
		MyString changedStr = str.reverse2();
		System.out.print(changedStr);
	}
}
