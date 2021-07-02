package com.Stack;

public class Runner {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.show();
		System.out.println();
		while (stack.peek() != null) {
			System.out.println("First element of the stack is " + stack.peek());
			stack.pop();
			stack.show();
		}
	}
}
