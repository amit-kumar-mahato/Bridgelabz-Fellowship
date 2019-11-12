package com.bridgelabz.datastructure;

public class FibonacciSeries {

	static Node head;
	
	public static void main(String[] args) {
		int a= 0; int b=1; int c= 0;
		for(int i=1;i<=10;i++) {
			insert(a);
			c = a+b;
			a = b;
			b = c;
		}
		FibonacciSeries.display();
	}

	private static void insert(int data) {
		Node node = new Node();
		node.data1 = data;
		node.next = null;
		
		if(head == null)
			head = node;
		else {
			Node n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	
	private static void display() {
		if(head == null) {
			System.out.println("Your List doen't contains any data!!!");
			return;
		}
		else {
			Node n = head;
			while(n.next!=null) {
				System.out.print(n.data1+" ");
				n = n.next;
			}
			System.out.print(n.data1);
		}
	}
}
