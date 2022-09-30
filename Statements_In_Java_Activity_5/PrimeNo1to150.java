package com.nil;

public class PrimeNo1to150 {
	public static void main(String[] args) {
		for (int i = 1; i <= 150; i++) { // outer loop

			for (int j = 2; j <= i; j++) { // inner loop
				if (i % j != 0)
					System.out.println("Numbrs: " + i + " ");
				break;

			}
		}
	}
}
