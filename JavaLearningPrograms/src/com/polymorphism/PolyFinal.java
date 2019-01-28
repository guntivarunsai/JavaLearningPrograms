package com.polymorphism;

class A {
	public final void method1() {
		System.out.println("Hello");
	}
}

class B extends A {
	public void method2() {
		B b = new B();
		
		b.method1();
		System.out.println("K");
	}
}

public class PolyFinal {
	public static void main(String[] args) {

		B b = new B();
		b.method2();
		System.out.println("Github");
	}

}
