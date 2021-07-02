package com.Stack;

import java.util.NoSuchElementException;

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
	 * Pops an element from the stack represented by this list. In other words,
	 * removes and returns the first element of this list
	 *
	 * @return the element at the front of this list (which is the top of the stack
	 *         represented by this list)
	 * @throws NoSuchElementException if this list is empty
	 */
	public Node<T> dequeue() {
		return list.pop();

	}

	/**
	 * It is looping through the nodes and printing their values till the last
	 * node's next element is null
	 */
	public void show() {
		list.show();
	}
}
