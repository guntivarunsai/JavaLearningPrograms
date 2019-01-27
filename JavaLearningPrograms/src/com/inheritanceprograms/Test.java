package com.inheritanceprograms;
class Access {
	public void get() {
		int a = 10;
		int b = 20;
	}
}

class Sub extends Access {
	public void get() {
		double a=10.23;
		
		String a1 = "10";
		System.out.println(a1);
		int b1 = 10;
		System.out.println(a1);
		System.out.println(b1);
	}
}

class Add extends Sub {
	public void add() {
		System.out.println("");
	}
}

public class Test {

	public static void main(String[] args) {
		Add sub = new Add();
		sub.get();
		sub.add();
	}
}
