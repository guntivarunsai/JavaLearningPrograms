package com.CollectionFramework;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		String str = "Ajay and Haneesha are pro developers";
		
		StringTokenizer stringTokenizer = new StringTokenizer(str, ":");
		System.out.println("Tokens:");
		while (stringTokenizer.hasMoreElements()) {
			String one = stringTokenizer.nextToken();
			System.out.println(one);
		}
	}

}
