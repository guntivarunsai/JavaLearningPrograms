package com.exceptionalhandling;

class Sample1
{
	public static void demo()
	{
		try
		{
			System.out.println("Inside demo () ");
			throw new ArithmeticException("Exception Data in Inside demo () Method");
		}
		catch(ArithmeticException nullPointerException)
		{
			System.out.println(nullPointerException);
		}
	}
}
public class ThrowExample {
	public static void main(String[] args) {
	
		Sample1.demo();

	}

}
