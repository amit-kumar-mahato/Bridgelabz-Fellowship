package com.bridgelabz.datastructure;

public class Queue {

	QNode front,rear;
	int count = 0;
	
	public Queue() {
		this.front = rear = null;
	}
	
	/*public void enqueue(int data) {
		//If Queue is empty
		QNode node = new QNode(data);
		
		if(this.rear == null) {
			this.front = this.rear = node;
			return;
		}
		// Add the new node at the end of queue and change rear
		else {
			this.rear.next = node;
			this.rear = node;
		}
	}
	
	//Method to remove data from queue
	public QNode dequeue() {
		if(this.front == null) {
			return null;
		}
		//If front becomes Null, then change rear also as null
		QNode temp = this.front;
		this.front = this.front.next;
		
		if(this.front == null) {
			this.rear = null;
		}
		return temp;
	}*/
	
	public void enqueue(int data) {
		QNode node = new QNode(data);
		
		if(this.front == null) {
			this.front = this.rear = node;
		}
		this.rear.next = node;
		this.rear = node;
		count++;
	}
	
	public void dequeue() {
		if(this.front == null) {
			System.out.println("Queue is empty");
		}
		
		//QNode temp = this.front;
		this.front = this.front.next;
		
		if(this.front == null) {
			this.rear = null;
		}
		count--;
	}
	
	public void display() {
		QNode node = this.front;
		while(node.next!=null) {
			System.out.println("Data :");
		}
	}
	public int size() {
		return count;
	}
}
