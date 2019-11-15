package com.bridgelabz.datastructure;

public class MyDeque<T> {
	Node1<T> head;
	Node1<T> front;
	Node1<T> rear;
	int count=0;
	
	/**
	 * Constructor creates an object of MyLinkedList and
	 * initializes linked list 
	 */
	public MyDeque() {
		this.front=null;
		this.rear=null;
	}
	
	/**
	 * @param data - element to be added at front of the queue
	 * 
	 */
	public void addFront(T data) {
		Node1<T> node = new Node1<>();
		node.data = data;
		if(front==null){
			front=node;
			rear=front;
		}
		else{
			node.next=front;
			front=node;
		}
		count++;
	}
	
	/**
	 * @param data - element to be added at the last of the queue
	 * 
	 */
	public void addRear(T data) {
		Node1<T> node=new Node1<>();
		node.data = data;
		if(rear==null)
		{
			rear=node;
			front=rear;
		}
		else
		{
			rear.next=node;
			rear=node;
		}
		count++;
	}
	
	/**
	 * @param data - element to be deleted at front of the queue
	 * 
	 */
	public T removeFront() {
		Node1<T> node=front;
		front=front.next;
		count--;
		return node.data;
	}
	
	/**
	 * @param data - element to be deleted at last of the queue
	 * 
	 */
	public Node1<T> removeRear() {
		Node1<T> node = front;
		Node1<T> prev = null;
		while(node.next!=null)
		{
			prev=node;
			node=node.next;
			count--;
		}
		prev.next=null;
		count--;
		return node;
		
	}

	/**
	 * @returns true if list is empty else returns false
	 */
	public boolean isEmpty() {
		return count == 0 ? true : false;
	}
	
	/**
	 * @returns size of the list
	 */
	public int size() {
		return count;
	}
	
	public void display() {
		Node1<T> temp=front;
		String str = "";
		while(temp!=null)
		{
			str+= temp.data;
			temp=temp.next;
		}
	}
}
