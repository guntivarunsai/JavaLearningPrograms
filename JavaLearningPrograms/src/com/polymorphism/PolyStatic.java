package com.polymorphism;

class One1 {
	public static void calculate(double x) {
		System.out.println("Square Value : " + (x * x));
	}
}

class Two1 extends One1{
	public static void calculate(double x) {
		System.out.println("Cube Value : " + (x * x * x));
	}
}

public class PolyStatic {

	public static void main(String[] args) {
		One1 one1 = new Two1();
		one1.calculate(5);
		Two1.calculate(5);

	}

}
