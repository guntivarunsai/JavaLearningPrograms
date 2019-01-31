package com.exceptionalhandling;

public class Ex1handling {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("Open Files");
			
			int n = args.length;//0
			System.out.println("n : "+n);
			int a = 45/n;
			System.out.println("a : "+a);
			int b[] = {10,20,30};
			b[50] =100;
		}
		catch(ArithmeticException|ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae);
		}
		finally {
			System.out.println("close the files");
		}
	}
}
