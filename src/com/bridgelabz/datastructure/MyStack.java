package com.bridgelabz.datastructure;

public class MyStack<T extends Comparable<T>>{
	MyLinkedList<T> myLinkedList;
	

	/**
	 * Constructor creates an object of MyLinkedList and
	 * initializes linked list 
	 */
	public MyStack() {
		myLinkedList = new MyLinkedList<>();
	}
	

	/**
	 * @param data - element to be added at front of the queue
	 * 
	 */
	public void push(T data) {
		myLinkedList.add( data);
	}
	
	public void pop(){
		myLinkedList.pop();
	}
	
	public T peek(){
		return myLinkedList.peek();
	}
	
	public boolean isEmpty(){
		return myLinkedList.isEmpty();
	}
	
	public int size(){
		return myLinkedList.size();
	}
	
	public String display() {
		return myLinkedList.show();
	}
}
