package com.bridgelabz.datastructure;

public class Utility1<T extends Comparable<T>> {

	Node1<T> head;
	int size = 0;
	
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
		int result;
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
		Node1 node = head;
		Node1 n1 = null;
		
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
		Node1 node = new Node1();
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
	/*
	 * @param data- data to be added at appropriate postion
	 * 
	 * */
	public void insertAtPreservedPosition(T data) {
		Node1<T> node = new Node1<T>();
		node.data = data;
		node.next = null;
		
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
	
	/*
	 * @return data - size of the list
	 * */
	public int size() {
		return size;
	}

}
