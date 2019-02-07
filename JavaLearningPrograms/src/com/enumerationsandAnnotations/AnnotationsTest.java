package com.enumerationsandAnnotations;

class One {
	public void doSomething() {
		System.out.println("Hai");
	}
}

class Two extends One {
	@Override
	public void doSomething() {
		System.out.println("Hello");
	}
}

public class AnnotationsTest {
	public static void main(String[] args) {

		Two t = new Two();
		One one = new One();
		one.doSomething();
		t.doSomething();
	}

}
