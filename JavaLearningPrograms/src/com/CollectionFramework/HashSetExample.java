package com.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<>();

		hashSet.add("India");
		hashSet.add("America ");
		hashSet.add("China ");
		hashSet.add("Japan ");
		hashSet.add("America ");
		
		hashSet.add("India");
		hashSet.add("America ");
		hashSet.add("China ");
		hashSet.add("Japan ");
		hashSet.add("America ");
		
		hashSet.add("India");
		hashSet.add("America ");
		hashSet.add("China ");
		hashSet.add("Japan ");
		hashSet.add("America ");

		//System.out.println("Hash Set = " + hashSet);
		
		HashSet<Integer> hashSet2 = new HashSet<>();
		hashSet2.add(1);
		hashSet2.add(2);
		hashSet.remove("India");
		System.out.println(hashSet);
		
		System.out.println(hashSet2);
		
		Iterator<String> it = hashSet.iterator();
		System.out.println("Elements using Iterator: ");

		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s.trim());
		}
		
		System.out.println(hashSet);

	}

}
