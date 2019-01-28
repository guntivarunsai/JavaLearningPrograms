package com.polymorphism;

class One {
	public void calculate(double x) {
		System.out.println("Square Value: " + (x * x));
	}
}

class Two extends One {
	@Override
	public void calculate(double x) {
		System.out.println("Cube Value : " + (x * x * x));
	}
}

public class PolyOverriding {

	static {
		System.out.println("Vinay");
	}

	public static void main(String[] args) {

		Two t = new Two();
		t.toString();
		t.calculate(4);
	}
}