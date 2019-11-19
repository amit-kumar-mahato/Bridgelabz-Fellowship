package com.bridgelabz.datastructure;

public class MyStack<T>{
	Node1<T>  head;
	int count=0;

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
	
	public T pop(){
		if(head==null)
		{
			System.out.println("Stack UnderFlow");
			return null;
		}
		Node1<T> temp=head;
		head=temp.next;
		count--;
		return temp.data;
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
