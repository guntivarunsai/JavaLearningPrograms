package com.StreamsAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int a =Integer.parseInt(bufferedReader.readLine());
		int b =Integer.parseInt(bufferedReader.readLine());
		
		List<Integer> b1 = new ArrayList<>();
		b1.add(a);
		b1.add(b);
		
		List<Integer> lt21 = b1.stream().sorted().collect(Collectors.toList());
		System.out.println(lt21);
		
		//take a string type array and convert into a list
		List<String> lst = Arrays.asList("USA","Japan","India","China","","Russia","UK");
		
		//count the number of strings with length more than 4 chars
		long n = lst.stream().filter(x->x.length()>4).count();
		System.out.println("the number of strings with length more than 4 chars : "+n);
		
		//Stream<String> sm = lst.stream();
		List<String> s1 = lst.stream().filter(x->x.length()>4).collect(Collectors.toList());
		System.out.println(s1);
		
		//Count number of string which start with 'U'
		n = lst.stream().filter(x->x.startsWith("U")).count();
		System.out.println("Number of string which start with U : "+n);
		
		//remove all empty from the list and collect them into anpother list
		List<String> lst1 = lst.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());
		System.out.println(lst1);
				
		//sort the stream and the convert into upper case and then collect into another list.
		List<String> lst2 = lst.stream().sorted().map(x->x.toUpperCase()).collect(Collectors.toList());
		System.out.println("Sorting: " +lst2);
		
		List<Integer> l1 = new ArrayList<>();

		// add elements to the list

		for (int i = 0; i < 10; i++) {
			l1.add(i);
		}
		
		l1.add(-10);
		List<Integer> lt2 = l1.stream().sorted().collect(Collectors.toList());
		System.out.println(lt2);
		
		
	}
	
}
