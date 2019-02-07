package com.enumerationsandAnnotations;

import java.util.HashMap;

public class SuppressWarningDemo {
		@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		HashMap ht = new HashMap();

		ht.put(1, "Vinay");
		ht.put(2, "Shiva");
		ht.put(3, "Venky");

		System.out.println(ht);
	}

}
