package com.StreamsAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Convert1 {

	public static void main(String[] args) {

		// create a list of objects
		List<Integer> lst = new ArrayList<>();

		// add elements to the list

		for (int i = 0; i < 10; i++) {
			lst.add(i);
		}

		// Covert this list List into Stream
		Stream<Integer> sm = lst.stream();

		// Filter the elemtns which are greater than 5 and collect them into a list
		// using collect.
		List<Integer> s1 = sm.filter(n -> n > 5).collect(Collectors.toList());

		// display the list
		System.out.println(s1);
	}
}
