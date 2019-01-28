package com.polymorphism;

class Sample {
	public void add(int a, int b) {
		System.out.println("Addition of a and b: " + (a + b));
	}

	public void add(int a, int b, int c) {
		System.out.println("Addition of a, b and c :" + (a + b + c));
	}
}

public class Poly {
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.add(5, 2);
		sample.add(10, 25, 30);
	}
}
