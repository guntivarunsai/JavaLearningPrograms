package com.CollectionFramework;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		stack.push(5);
		
	//	System.out.println(stack.peek());
		
		System.out.println(stack.search(5));
		
	//	System.out.println(stack);
	}

}
