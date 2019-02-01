package com.wrapperclasses;

public class MathExample {

	public static void main(String[] args) {

		// System.out.println(Math.pow(2, 3));

		int a = 2;
		int b = 3;
		long result = 1;
		while (b != 0) {
			// result = result*a;
			result *= a;
			--b;
		}
		System.out.println("Answer : " + result);
	}
}
