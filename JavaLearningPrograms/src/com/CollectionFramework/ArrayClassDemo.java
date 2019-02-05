package com.CollectionFramework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter an Integer:");
			arr[i] = Integer.parseInt(bufferedReader.readLine());
		}

		System.out.println("Contents of the Array");
		for (int j : arr) {
			System.out.println(j);
		}

		// Sort my Array
		System.out.println("Sorint");
		Arrays.sort(arr);
		for (int v : arr) {
			System.out.println(v);
		}
		
		Arrays.asList(arr);
	}
}
