package com.abstractmethodsandclasses;
class Myclass
{
	public void calculate(double x)
	{
		System.out.println("Square : "+(x*x));
	}
}
public class Common {
	public static void main(String[] args) {
		//create 3 objects
		Myclass myclass = new Myclass();
		Myclass myclass2 = new Myclass();
		Myclass myclass3 = new Myclass();
		
		myclass.calculate(3);
		myclass2.calculate(4);
		myclass3.calculate(5);
		
	}
}
