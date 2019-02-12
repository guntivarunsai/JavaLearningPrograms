package com.LambdaExpressionsDemo;

import java.util.function.Predicate;

public class PredicateDemoMultiple {

	public static void main(String[] args) {

		// Taking a group of Integer objects in an array
		Integer[] arr = { 8, 9, 10, 11, 12, 13, 14, 15, 16 };

		// create predicate references
		Predicate<Integer> gt, lt;

		// Lambda expression to return true if the number>10
		gt = (n) -> n > 10;
		// Lambda expression to return true if the number<15
		lt = (n) -> n < 16;

		System.out.println("Numbers >10 and <16");

		display(gt.and(lt), arr);

		System.out.println("\n Nubers <=10 and >=16: ");
		
		display(gt.and(lt).negate(), arr);
	}

	private static void display(Predicate<Integer> and1, Integer[] arr) {
		for (Integer i : arr) {
			if (and1.test(i))
				System.out.println(i + " ");
		}
	}
}
