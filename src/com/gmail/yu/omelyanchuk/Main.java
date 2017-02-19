package com.gmail.yu.omelyanchuk;

import java.util.Scanner;

public class Main {
	private static void pyramid(int height) {

		height--;
		int rowNow = 0;
		int kolPrint = 0;
		boolean b = true;
		boolean c = true;
		for (; c;) {
			if (b) {
				if (rowNow >= kolPrint) {
					kolPrint++;
					System.out.print("*");

				} else if (rowNow % height == 0 && rowNow > 0) {
					b = false;
					System.out.println();
					kolPrint = 0;
					continue;
				} else if (rowNow < kolPrint) {
					rowNow++;
					System.out.println();
					kolPrint = 0;

				}

			} else {
				if (height * 2 - rowNow > kolPrint) {
					System.out.print("*");
					kolPrint++;

				} else {
					rowNow++;
					System.out.println();
					kolPrint = 0;
				}
			}
			if (rowNow == height * 2 + 1) {
				c = false;
			}
		}

	}

	private static void primeNumber(int toNumber) {
		for (int i = 1; i <= toNumber; i++) {
			boolean b = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					b = false;
				}
			}
			if (b) {
				System.out.print(i+" ");
			}

		}
		System.out.println();
	}

	private static void hourGlass(int height) {
		if (height % 2 == 0 || height < 1) {
			System.out.println("not odd number");
			return;
		}
		int k = 0;

		for (int i = 0; i < height; i++) {
			for (int j = 0; j <= height - 1; j++) {
				if (j >= k && j < (height - k)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			if (i < height / 2) {
				k++;
			} else {
				k--;

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input triangle height");
		pyramid(sc.nextInt());
		System.out.println("prime number to 100");
		primeNumber(100);
		System.out.println("input hour glass height");
		hourGlass(sc.nextInt());

	}

}
