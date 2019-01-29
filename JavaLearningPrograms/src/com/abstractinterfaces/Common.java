package com.abstractinterfaces;

class MyClass
{
	public void calculate(double x)
	{
		System.out.println("Square value: "+(x*x));
	}
}
public class Common {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		MyClass myClass1 = new MyClass();
		MyClass myClass2 = new MyClass();
		
		myClass.calculate(3);
		myClass1.calculate(4);
		myClass2.calculate(5);
	}

}
