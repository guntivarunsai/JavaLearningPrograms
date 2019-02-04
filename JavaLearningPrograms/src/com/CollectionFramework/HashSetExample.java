package com.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<>();

		hashSet.add("India");
		hashSet.add("America");
		hashSet.add("China");
		hashSet.add("Japan");
		hashSet.add("America");

		//System.out.println("Hash Set = " + hashSet);

		Iterator<String> it = hashSet.iterator();
		System.out.println("Elements using Iterator: ");

		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
		
		System.out.println(hashSet);

	}

}
