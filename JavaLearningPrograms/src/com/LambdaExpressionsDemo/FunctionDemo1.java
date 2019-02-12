package com.LambdaExpressionsDemo;

import java.util.function.Function;

public class FunctionDemo1 {
	public static void main(String[] args) {

		Function<String, Integer> len = (str) -> str.length();
		String ha = "Haneesha";
		System.out.println("Length = " + len.apply(ha));
	}
}
