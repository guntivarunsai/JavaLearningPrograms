package com.CollectionFramework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, Long> hashMap = new HashMap<>();

		// put and get
		hashMap.put("Vinay", (long) 888888888);
		hashMap.put("Ajay", (long) 777777777);

		System.out.println(hashMap.get("Vinay"));

		Set<String> set = new HashSet<String>();
		set = hashMap.keySet();
		System.out.println(set);

		Map<Integer, String> map = new HashMap<>();

	}

}