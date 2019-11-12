package com.bridgelabz.datastructure;

public class DoubleLinkedList {
	static DllNode head;
	static int count=0;
	
	public static void insertAtStart(int data) {
		DllNode node = new DllNode();
		node.data = data;
		
		node.next = head;
		
		node.prev = null;
		
		if(head != null)
			head.prev = node;
		
		head = node;
	}
	 
	public static void insert(int data) {
		DllNode node = new DllNode();
		node.data = data;
		DllNode last = head;
		node.next = null;
		
		if(head == null) {
			head = node;
			node.prev = null;
			return;
		}
		else {
			while(last.next != null)
				last =last.next;
			last.next = node;
			node.prev = last;
		}
	}
	public static void insertAfter(DllNode prev_Node, int data) {
		if(prev_Node == null) {
			
		}
	}
	
	public static void display() {
		DllNode node = head;
		
		if(head == null) {
			System.out.println("Your list doesn't contains any data!!!");
			return;
		}
		else {
			while(node != null) {
				System.out.print(node.data+" ");
			}
			//System.out.print(node.data+" ");
		}
	}
	
	public static void main(String[] args) {
		DoubleLinkedList.insert(11);
		DoubleLinkedList.insert(12);
		DoubleLinkedList.display();
	}

}
