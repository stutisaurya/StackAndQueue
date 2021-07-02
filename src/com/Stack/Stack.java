package com.Stack;

public class Stack<T> {
	LinkedList<T> list = new LinkedList<T>();

	/**
	 * 
	 * @param value
	 */
	public void push(T value) {
		list.addAtStart(value);
	}

	/**
	 * It is looping through the nodes and printing their values till the last
	 * node's next element is null
	 */
	public void show() {
		list.show();
	}
}
