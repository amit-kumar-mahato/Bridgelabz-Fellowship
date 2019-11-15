package com.bridgelabz.datastructure;

public class MyQueue<T extends Comparable<T>> {
	MyLinkedList<T> myLinkedList;

	/**
	 * Constructor creates an object of MyLinkedList and
	 * initializes linked list 
	 */
	public MyQueue() {
		myLinkedList = new MyLinkedList<>();
	}
	
	/**
	 * @param data - element to be enqueued
	 * adds element a the end of the list
	 */
	public void enqueue(T data){
		myLinkedList.add(data);
	}
	
	/**
	 * removes first element in the list
	 * @returns removed element
	 */
	public void dequeue(){
		myLinkedList.pop();
	}
	
	/**
	 * @returns true if list is empty else returns false
	 */
	public boolean isEmpty(){
		return myLinkedList.isEmpty();
	}
	
	/**
	 * @returns size of the list
	 */
	public int size(){
		return myLinkedList.size();
	}
	public String display() {
		return myLinkedList.show();
	}

}
