package com.bridgelabz.datastructure;

import java.util.Arrays;

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
		Node1<T> node = new Node1<T>();
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
	 * @returns index value if the element is in the list else returns -1
	 */
	public int search(T data) {
		Node1<T> node = head;
		int count = 0;
		if(head == null) {
			System.out.println("Your List has no Data");
		}
		else {
			
			while(node.next != null) {
				if(data.compareTo(node.data) == 0) {
					//System.out.println("Data found :"+node.data);
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
	public void pop() {
		if(head == null)
			System.out.println("Stack Underflow!!!");
		head = head.next;
		size--;
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
	
	/**
	 * @param range- up to which prime numbers are to be found
	 * @returns string array of prime numbers in  a given range
	 *//*
	public String[] prime(int range) {
		String[] array = new String[1000];
		int position = 0;
		for(int i = 2; i <= range; i++) {
			boolean isPrime = true;
			for(int j = 2; j <= i / 2; j++) {
				if((i % j) == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				array[position] = String.valueOf(i);
				position++;
			}
		}
		String[] returnArray = new String[position];
		for(int k = 0; k < position; k++) {
			returnArray[k] = array[k];
		}
		return returnArray;
	}
	
	*//** Returns true if strings are anagram else returns false **//*
	public boolean anagram(String string1, String string2) {
		if(string1.length() != string2.length()) {
			return false;
		}
		char[] array1 = string1.toCharArray();
		Arrays.sort(array1);
		char[] array2 = string2.toCharArray();
		Arrays.sort(array2);
		
		for(int i = 0; i < array1.length; i++) {
			if(array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}*/

}
