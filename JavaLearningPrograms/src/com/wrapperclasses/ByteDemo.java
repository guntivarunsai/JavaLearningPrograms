package com.wrapperclasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteDemo {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a byte no 1:");
		String s1 = bufferedReader.readLine();
		
		@SuppressWarnings("deprecation")
		Byte b1 = new Byte(s1);
		
		System.out.println(b1);
		
		System.out.println("Enter a byte no 2:");
		String s2 = bufferedReader.readLine();
		
		@SuppressWarnings("deprecation")
		Byte b2 = new Byte(s2);
		
		System.out.println(b2);
		
		int n = b1.compareTo(b2);
		
		if(n==0)
		{
			System.out.println("Both bytes are same");
		}
		else if(n<0)
		{
			System.out.println(b1+" is less");
		}
		else if(n>0)
		{
			System.out.println(b2+ "is less");
		}
		else
		{
			System.out.println("I don't know what I am doing");
		}
		
		
	}

}
