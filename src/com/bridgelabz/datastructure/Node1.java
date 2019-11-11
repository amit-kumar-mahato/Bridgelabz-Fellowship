package com.bridgelabz.datastructure;

public class Node1<T> {
	T data;
	Node1<T> next;
	
	public Node1(T data) {
		this.data = data;
	}

	public Node1<T> getNext() {
		return next;
	}

	public void setNext(Node1<T> next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}
		
}
