package com.typeCasting;


public class WideningSample {
	
	public static void main(String[] args) {
		
		char ch = 'A';
		int number1 = ch;
		System.out.println(number1);
		
		
		System.out.println(ch);
		
		int number = (int)ch;
		System.out.println(number);
		
		System.out.println(ch);
		
		
	}
	 

}
