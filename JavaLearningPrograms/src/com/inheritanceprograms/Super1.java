package com.inheritanceprograms;
class One {
	int i = 10;

	public void show() {
		System.out.println("Super class method: i = " + i);
	}
}

class Two extends One {
	int i = 20;

	public void show() {
		System.out.println("sub class method: i = " + i);
		super.show();
		System.out.println(super.i);
	}
}

public class Super1 {
	
	public static void main(String[] args) {
		Two two  = new Two();
		two.show();
	}

}
