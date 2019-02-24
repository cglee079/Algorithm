package com.baekjoon.q14890;

import java.util.Scanner;

public class Main {
	int N;
	int L;
	int count = 0;

	public void count(int[] line) {
		boolean[] installed = new boolean[N + 1];

		int j = 1;
		int v = line[1];
		int nv;
		boolean isAvail = true;
		while (j < N) {
			v = line[j];
			nv = line[j + 1];
			if (Math.abs(v - nv) > 1) {
				break;
			} else if (v - nv == 1) {
				j++;
				int s = j;
				int m = nv;
				int c = 0;

				while (c < L) {
					if (j > N) {
						isAvail = false;
						break;
					}
					if (line[j] == m && installed[j] == false) {
						c++;
						if (c == L) {
							break;
						}
					} else {
						isAvail = false;
						break;
					}
					
					j++;
				}

				if (c == L) {
					for (int l = s; l <= j; l++) {
						installed[l] = true;
					}
				} else {
					break;
				}

			} else if (v - nv == -1) {
				int u = j;
				int m = v;
				int c = 0;

				while (c < L) {
					if (u < 1) {
						isAvail = false;
						break;
					}
					if (line[u] == m && installed[u] == false) {
						c++;
						if (c == L) {
							break;
						}
					} else {
						isAvail = false;
						break;
					}
					
					u--;
				}

				if (c == L) {
					for (int l = j; l >= u; l--) {
						installed[l] = true;
					}
					j++;
				} else {
					break;
				}

			} else if (Math.abs(v - nv) == 0) {
				j++;
			}

		}

		if (j == N && isAvail) {
			count++;
		}
	}

	public void run() {
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		L = scan.nextInt();
		int lmap[][] = new int[N + 1][N + 1];
		int umap[][] = new int[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				int k = scan.nextInt();
				lmap[i][j] = k;
				umap[j][i] = k;
			}
		}

		for (int i = 1; i <= N; i++) {
			 count(lmap[i]);
			 count(umap[i]);
		}

		System.out.println(count);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
