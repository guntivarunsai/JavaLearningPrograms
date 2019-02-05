package com.CollectionFramework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Ascend implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {
		// TODO Auto-generated method stub
		return i1.compareTo(i2);
	}
}

class Descend implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {
		// TODO Auto-generated method stub
		return i2.compareTo(i1);
	}

}
public class ArrayComparatorDemo {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("How many elements:");
		int size = Integer.parseInt(bufferedReader.readLine());

		Integer arr[] = new Integer[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter integer: ");
			arr[i] = Integer.parseInt(bufferedReader.readLine());
		}

		// sort the array in ascending order.
		Arrays.sort(arr, new Ascend());
		System.out.println("Arrays in sorting order");
		for (Integer a : arr) {
			System.out.println(a);
		}
		System.out.println("Descendingf Order:");
		// Sort the array in descending order.
		Arrays.sort(arr, new Descend());
		for (Integer b : arr) {
			System.out.println(b);
		}
	}

}
