package com.LambdaExpressionsDemo;

import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String[] args) {

		Predicate<Integer> predicate = (i) -> i > 13;
		boolean result = predicate.test(9);
		System.out.println("Greater than 13 : " + result);

		Integer[] arr = {8,9,10,11,12,13,14,15};
		Predicate<Integer> gt = (i) -> i>10;
		
		System.out.println("Numbers greater than 10:");
		myMethod(gt,arr);
	}

	private static void myMethod(Predicate<Integer> gt, Integer[] arr) {
		for(Integer i:arr)
		{
			if(gt.test(i))
				System.out.println(i+"\n");
		}
		
	}

}
