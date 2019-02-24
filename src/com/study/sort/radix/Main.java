package com.study.sort.radix;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public void run() {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int list[] = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = scan.nextInt();
		}
		
		Queue<Integer> buckets[] = new LinkedList[10];
		for (int i = 0; i < 10; i++) {
			buckets[i] = new LinkedList<>();
		}

		int mod = 1;
		int k;
		int index;
		Queue<Integer> tQ;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < n; j++) {
				k = list[j];
				if (k < mod) {
					buckets[0].add(k);
				} else {
					buckets[(k / mod) % 10].add(k);
				}
			}

			index = 0;
			for (int j = 0; j < 10; j++) {
				tQ = buckets[j];
				while (!tQ.isEmpty()) {
					list[index++] = tQ.poll();
				}
			}

			mod *= 10;

		}

		for (int i = 0; i < n; i++) {
			System.out.println(list[i]);
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
