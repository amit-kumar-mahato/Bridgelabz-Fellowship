package com.bridgelabz.datastructure;

public class MyStack<T>{
	Node1<T>  head;
	int count=0;

	/**
	 * Constructor creates an object of MyLinkedList and
	 * initializes linked list 
	 */
	public MyStack() {
		head = null;
	}
	

	/**
	 * @param data - element to be added into the list
	 * 
	 */
	public void push(T data) {
		Node1<T> node = new Node1<T>();
		node.data = data;
		node.next=head;
		head=node;
		count++;
	}
	
	public void pop(){
		if(head==null)
		{
			System.out.println("Stack UnderFlow");
			return;
		}
		Node1<T> temp=head;
		head=temp.next;
		temp=null;
		count--;
	}
	
	public T peek(){
		if(head==null)
		{
			System.out.println("no data present");
		}
			T temp=head.data;
			return temp;
	}
	
	public boolean isEmpty(){
		return count == 0 ? true : false;
	}
	
	public int size(){
		return count;
	}
	
	public String display() {
		Node1<T> node = head;
		String temp="";
		
		while (node.next != null) {
			temp += node.data+" ";
			node = node.next;
		}
		temp += node.data;
		return temp;
	}
}
