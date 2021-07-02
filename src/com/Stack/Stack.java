package com.Stack;

import java.util.NoSuchElementException;

public class Stack<T> {
	LinkedList<T> list = new LinkedList<T>();

	/**
	 * Pushes an element onto the stack represented by this list. In other words,
	 * inserts the element at the front of this list.
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

	/**
	 * Retrieves, but does not remove, the head (first element) of this list.
	 *
	 * @return the head of this list, or {@code null} if this list is empty
	 */
	public T peek() {
		return list.peek();
	}

	/**
	 * Pops an element from the stack represented by this list. In other words,
	 * removes and returns the first element of this list
	 *
	 * @return the element at the front of this list (which is the top of the stack
	 *         represented by this list)
	 * @throws NoSuchElementException if this list is empty
	 */
	public Node<T> pop() {
		return list.pop();

	}
}
