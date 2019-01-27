package com.inheritanceprograms;
final class A {
	final static void method1() {
		System.out.println("Hello");
	}
}
class B {
	void method2() {
		A.method1();
	}
}
public class Main {
	public static void main(String[] args) {
		B b = new B();
		b.method2();

	}
}
