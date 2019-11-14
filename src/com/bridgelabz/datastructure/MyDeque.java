package com.bridgelabz.datastructure;

public class MyDeque<T> {
	MyLinkedList<Character> myLinkedList;
	
	/**
	 * Constructor creates an object of MyLinkedList and
	 * initializes linked list 
	 */
	public MyDeque() {
		myLinkedList = new MyLinkedList<>();
	}
	
	public void add(T data) {
		myLinkedList.add((Character) data);
	}
	/**
	 * @param data - element to be added at front of the queue
	 * 
	 */
	public void addFront(T data) {
		myLinkedList.insertAtStart((Character) data);
	}
	
	/**
	 * @param data - element to be added at the last of the queue
	 * 
	 */
	public void addRear(T data) {
		myLinkedList.add((Character) data);
	}
	
	/**
	 * @param data - element to be deleted at front of the queue
	 * 
	 */
	public void removeFront() {
		myLinkedList.pop();
	}
	
	/**
	 * @param data - element to be deleted at last of the queue
	 * 
	 */
	public char removeRear() {
		return myLinkedList.removeRear();
	}

	/**
	 * @returns true if list is empty else returns false
	 */
	public boolean isEmpty() {
		return myLinkedList.isEmpty();
	}
	
	/**
	 * @returns size of the list
	 */
	public int size() {
		return myLinkedList.size();
	}
	
	public String display() {
		return myLinkedList.show();
	}
}
