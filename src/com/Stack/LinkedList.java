package com.Stack;

public class LinkedList<T> {
	Node<T> head;

	/**
	 * Appends the specified element to the end of this list.
	 * 
	 * @param value
	 */
	public void add(T value) {
		Node<T> newNode = new Node<T>();
		newNode.value = value;
		newNode.next = null;
		if (head == null) {
			head = newNode;
		} else {
			Node<T> currNode = head;
			while (currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = newNode;
		}
	}

	/**
	 * It is looping through the nodes and printing their values till the last
	 * node's next element is null
	 */
	public void show() {
		Node<T> currNode = head;
		while (currNode.next != null) {
			System.out.println(currNode.value);
			currNode = currNode.next;
		}
		System.out.println(currNode.value);
	}

	/**
	 * Inserts the specified element at the start of the list.
	 * 
	 * @param value
	 */
	public void addAtStart(T value) {
		Node<T> newNode = new Node<>();
		newNode.value = value;
		newNode.next = head;
		head = newNode;
	}

	/**
	 * Inserts the specified element at the specified position in this list
	 * 
	 * @param value
	 * @param index
	 */
	public void addAtIndex(T value, int index) {
		if (index == 0) {
			addAtStart(value);
		} else {
			Node<T> newNode = new Node<>();
			newNode.value = value;
			Node<T> nodeAtPreviousIndex = head;
			for (int i = 0; i < index - 1; i++) {
				nodeAtPreviousIndex = nodeAtPreviousIndex.next;
			}
			newNode.next = nodeAtPreviousIndex.next;
			nodeAtPreviousIndex.next = newNode;
		}
	}

	/**
	 * Removes the first element from this list, if it is present
	 */
	public void pop() {
		if (null != head) {
			Node<T> newHead = head.next;
			head = newHead;
		}
	}

	/**
	 * Removes the last element from this list, if it is present
	 */
	public void popLast() {
		Node<T> currNode = head;
		Node<T> prevNode = head;
		while (currNode.next != null) {
			prevNode = currNode;
			currNode = currNode.next;
		}
		prevNode.next = null;
	}

	/**
	 * Returns the index of the first occurrence of the specified element in this
	 * list, or -1 if this list does not contain the element. More formally, returns
	 * the lowest index {@code i} such that {@code Objects.equals(o, get(i))}, or -1
	 * if there is no such index.
	 * 
	 * @param value
	 * @return
	 */
	public int searchByValue(T value) {
		Node<T> currNode = head;
		int index = 0;
		if (null != currNode) {
			while ((null != currNode.next) || (null != currNode.value)) {
				if (currNode.value == value) {
					break;
				}
				currNode = currNode.next;
				if (null == currNode) {
					return -1;
				}
				index++;
			}
		}
		return index;
	}

	/**
	 * Removes the element at the specified position in this list
	 * 
	 * @param index
	 */
	public void popAtIndex(int index) {
		if (index == 0) {
			pop();
		} else {
			Node<T> prevNode = head;
			Node<T> currNode = head;
			for (int i = 0; i < index; i++) {
				prevNode = currNode;
				currNode = currNode.next;
			}
			prevNode.next = currNode.next;
		}
	}

	/**
	 * Returns the number of elements in this list. If this list contains more than
	 * {@code Integer.MAX_VALUE} elements, returns {@code Integer.MAX_VALUE}.
	 * 
	 * @return
	 */
	public int size() {
		Node<T> currNode = head;
		int count = 0;
		if (null != currNode) {
			while ((null != currNode.next) || (null != currNode.value)) {
				currNode = currNode.next;
				count++;
				if (null == currNode) {
					break;
				}
			}
		}
		count = (count > Integer.MAX_VALUE) ? Integer.MAX_VALUE : count;
		return count;
	}
}
