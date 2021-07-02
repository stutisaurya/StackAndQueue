package com.Stack;

public class Queue<T> {
	LinkedList<T> list = new LinkedList<T>();

	/**
	 * Add elements to the queue
	 * 
	 * @param value
	 */
	public void enqueue(T value) {
		list.add(value);
	}

	/**
	 * It is looping through the nodes and printing their values till the last
	 * node's next element is null
	 */
	public void show() {
		list.show();
	}
}
