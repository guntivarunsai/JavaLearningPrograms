package com.StreamsAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Convert2 {

	public static void main(String[] args) {
		// create a list to store Integer objects
		List<Integer> lst = new ArrayList<>();
		// add elements to the list
		for (int i = 0; i < 10; i++) {
			lst.add(i);
		}
		// convert this list to stream
		Stream<Integer> sm = lst.stream();

		// Filter the elemets which are lesser than 5 and collect
		// them into an Integre type array using toArray(Integer[]::new)

		Integer[] arr = sm.filter(n -> n < 5).toArray(Integer[]::new);

		// display the array

		for (Integer integer : arr) {
			System.out.println(integer);
		}
	}
}
