package com.LambdaExpressionsDemo;

interface Myclass2 {
	public void add();
	//public void sub(int a,int b);
}

public class LEDemo {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		Myclass2 myclass2 = () -> {
			System.out.println("Sum : " + (a + b));
			int a1=50;
			System.out.println("hello");
		};
		
		myclass2.add();
		
		/*Myclass2 myclass3 = (int a,int b) ->{
			System.out.println("Sub : " + (a - b));
		};*/
		//myclass2.add(40, 50);
		//myclass3.add(40, 50);
		
	}
}
