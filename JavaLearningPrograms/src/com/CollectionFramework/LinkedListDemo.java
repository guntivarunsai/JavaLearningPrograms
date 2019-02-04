package com.CollectionFramework;

import java.util.LinkedList;
import java.util.TreeSet;

public class LinkedListDemo {
	
	public static void main(String[] args) {
	
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("1");
		linkedList.add("2");
		linkedList.add("32");
		linkedList.add("40");
		linkedList.add("555");
		linkedList.add("6");
		
		linkedList.removeFirst();
		linkedList.remove();
		//linkedList.removeAll(linkedList);
		System.out.println(linkedList);
		
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("9");
		treeSet.add("8");
		treeSet.add("5");
		treeSet.add("0");
		
		System.out.println(treeSet);
		
	}

}
