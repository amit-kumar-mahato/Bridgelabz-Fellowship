package com.bridgelabz.datastructure;

public class Utility1<T extends Comparable<T>> {

	Node1<T> head;
	public void add(T data) {
		Node1<T> node = new Node1<T>(data);
		//node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;
		}
		else {
			Node1<T> n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public int search(T data) {
		System.out.println("Data :"+data);
		Node1<T> node = head;
		boolean flag = false;
		int result;
		int count = 0;
		if(head == null) {
			System.out.println("Your List has no Data");
		}
		else {
			//System.out.println("Coming inside else block"+node.data);
			
			while(node.next != null) {
				result = data.compareTo(node.data);
				//System.out.println("Result :"+result);
				if(result == 0) {
					flag = true;
					return count;
				}
				//System.out.println("Inside if block flag :"+flag);
				/*if(node.data == data) {
					System.out.println("Data found :"+node.data);
					return count;
				}*/
				node = node.next;
				count++;
			}
			//System.out.println("Flag value :"+flag);
			result = data.compareTo(node.data);
			if(result == 0) {
				//System.out.println("Found at Last "+result);
				return count;
			}
			count = 0;
		}
		return count;
	}
	
	public void remove(int index) {
	
		if(index == 0) {
			head = head.next;
		}
		else {
			Node1<T> node = head;
			Node1<T> n1 = null;
			while(node.next!=null) {
				for(int i=0;i<index-1;i++) {
					node  = node.next;
				}
				n1 = node.next;
				node.next = n1.next;
			}
		}
	}
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

}
