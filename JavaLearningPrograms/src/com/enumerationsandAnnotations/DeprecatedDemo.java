package com.enumerationsandAnnotations;

class MyClass {
	public void method2()
	{
		System.out.println("I am not deprecated");
	}
	
	@Deprecated
	public void method1() {
		System.out.println("This method is gng to be deprecated");
	}
}

public class DeprecatedDemo {
	public static void main(String[] args) {
		MyClass class1 = new MyClass();
		class1.method1();
	}

}