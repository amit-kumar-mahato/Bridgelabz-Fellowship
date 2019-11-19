package com.bridgelabz.datastructure;

import com.bridgelabz.customexception.NoDataPresentException;

public class MyLinkedList<T extends Comparable<T>> {

	Node1<T> head;
	Node1<T> front,rear;
	int size = 0;
	Node1[] array = new Node1[11];
	
	public MyLinkedList() {
		this.front = this.rear = null;
	}
	
	/**
	 * @param data - data to be added
	 * 
	 */
	public void add(T data) {
		Node1<T> node = new Node1<>();
		node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;
			size++;
		}
		else {
			Node1<T> n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;
			size++;
		}
	}
	
	/**
	 * @param data - elements to be searched in the list
	 * @throws NoDataPresentException 
	 * @returns index value if the element is in the list else returns -1
	 */
	public int search(T data) throws NoDataPresentException {
		Node1<T> node = head;
		int count = 0;
		if(head == null) {
			throw new NoDataPresentException();
		}
		else {
			
			while(node.next != null) {
				if(data.compareTo(node.data) == 0) {
					return count;
				}
				node = node.next;
				count++;
			}
			if(data.compareTo(node.data) == 0)
				return count;
		}
		return -1;
	}
	
	/**
	 * @param data - data to be removed
	 * removes given index element from the list
	 */
	public void remove(int index) {
		Node1<T> node = head;
		Node1<T> n1 = null;
		
		if(index == 0) {
			head = head.next;
		}
		else {
			for(int i=0;i<index-1;i++) {
				node = node.next;
			}
			
			n1 = node.next;
			node.next = n1.next;
			size--;
		}
	}
	
	/**
	 * @param data - data to be added at first position
	 * 
	 */
	public void insertAtStart(T data) {
		Node1<T> node = new Node1<>();
		node.data = data;
		node.next = null;
		
		node.next = head;
		head = node;
	}

	/**
	 * @param data - data to be added
	 * adds data to the end of the list
	 */
	public void append(T data){
		add(data);
	}
	
	//For OrderedList
	//For Sorting
		public int[] sorting(int[] array) {
			for(int i=0;i<array.length;i++) {
				for(int j=0;j<array.length-1;j++) {
					if(array[j]>array[j+1]) {
						int temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
					}
				}
			}
			return array;
		}
	
	/*
	 * @param data- data to be added at appropriate postion
	 * 
	 * */
	public void insertAtPreservedPosition(T data) {
		Node1<T> node = new Node1<>();
		node.data = data;
		node.next = null;
		
		if(data.compareTo(head.data)==-1) {
			node.next = head;
			head = node;
		}
		else {
			Node1<T> n = head;
			while(n.next!=null) {
				if(data.compareTo((T) n.next.data)==-1) {
					node.next = n.next;
					n.next = node;
					break;
				}
				n = n.next;
			}
			n.next = node;
		}
	}
	
	/*
	 * pop element from stack 
	 */
	public T pop() {
		Node1<T> tmp=head;
		if(head == null) {
			System.out.println("Stack Underflow!!!");
			return null;
		}
		else {
		head = head.next;
		size--;
		return tmp.data;
		}
	}
	
	/*
	 *search element in stack 
	 **/
	public T peek() {
		if(head == null) {
			System.out.println("No Data Present");
		}
		
		return head.data;
	}
	
	
	
	/*
	 * Display the list element
	 * 
	 */
	public String show() {
		Node1<T> node = head;
		String temp="";
		
		while (node.next != null) {
			temp += node.data+" ";
			node = node.next;
		}
		temp += node.data;
		return temp;
	}
	
	//Pallindrome Checker implementation
	
	
	// Remove rear element
	public char removeRear() {

		Node1<T> node = head;
		char temp = 0;
		if (node.next == null) {
			temp = (char) node.data;
			return temp;
		}
		while (node.next.next != null) {
			node = node.next;
		}

		temp = (char) node.next.data;
		node.next = null;
		return temp;
	}
	
	/*
	 * @return data - size of the list
	 * 
	 */
	public int size() {
		return size;
	}
	/*
	 * check stack is empty or not
	 */
	public boolean isEmpty() {
		return size == 0 ? true : false;
	}
	
}
