package com.LambdaExpressionsDemo;

class Demo {
	private String s;

	Demo(String s) {
		this.s = s;
		System.out.println("Constructor executed " + s);
	}
}

//Function Interface with get() method that returns Sample Class Object
interface MyInter {
	Demo get(String str);
}

public class DcolonDemo1 {

	public static void main(String[] args) {
		MyInter mi = (String s) -> {
			return new Demo(s);
		};
		Demo s = mi.get("From Lambda Expression");

		// double colon operator refers to Sample CLass Object
		MyInter mi1 = Demo::new;
		Demo d1 = mi1.get("From Double colon Operator");
		// double colon
	}

}
