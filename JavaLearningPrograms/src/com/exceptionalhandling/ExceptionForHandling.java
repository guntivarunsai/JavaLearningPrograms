package com.exceptionalhandling;

public class ExceptionForHandling {
	public static void main(String[] ajay) {
		
	//	System.out.println(1/0);
	//	int b1[] = {10,20,30};
	//	b1[50] =100;
	//	System.out.println(b1);
		try
		{
			System.out.println("Open Files");
			
			int n = ajay.length;//0
			System.out.println("n : "+n);
			
			int a = 45/5;
			System.out.println("a : "+a);
		
			int b[] = {10,20,30};
			b[50] =100;
		}
		catch(ArithmeticException exception)
		{
			System.out.println(exception);
			System.out.println("Please pass the data");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("Please Maintain array index is within the range");
		}
		finally
		{
			System.out.println("closing the program");
		}
	}

}
