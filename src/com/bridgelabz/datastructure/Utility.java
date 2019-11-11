package com.bridgelabz.datastructure;

public class Utility  {

	Node  head;
	int count = 0;
	
	//For adding element in the list
	public void add(String data) {
		Node node = new Node ();
		node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;
		}
		else {
			Node  n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	
	//For Display list element
	public String show() {
		Node node = head;
		String temp = "";
		int count = 0;
		while(node.next!=null) {
			//System.out.print(node.data+" ");
			temp += node.data+" ";
			node = node.next;
			count++;
		}
		temp+=node.data;
		size(temp);
		//System.out.print(temp+=node.data);
		return temp;
	}
	
	//For Search, search will return index number
	public int search(String data) {
		Node  node = head;
		boolean result = false;
		int count = 0;
		if(head == null) {
			System.out.println("Your list has no elements!!!");
		}
		else {
			while (node.next != null) {
				if (data.equals(node.data)) {
					result = true;
					System.out.println(node.data + " is Found in List so we need to delete " + data + " from the list\n");
					//remove(data);
					return count;
					// break;
				}
				node = node.next;
				count++;
		}
		if(node.data.equals(data)) {
			System.out.println(node.data+" is Found in List so we need to delete " + data + " from the list \n");
			result = true;
			//remove(data);
			return count;
		}
		if(result == false) {
			System.out.println(data+" is not found in the list so we need to add "+data+ " to the list\n");
			add(data);
		}
		}
		return -1;
	}
	
	//Deleting element by passing index value
	public void remove(int count) {
		//System.out.println("The index value is :"+count);
		Node  node = head;
		Node  n1 = null;
		
		if(count == 0) {
			head = head.next;
		}
		else {
			for(int i=0;i<count-1;i++) {
				node = node.next;
			}
			
			n1 = node.next;
			node.next = n1.next;
		}
	}

	//Delete element by passing actual data
	/*private void remove(T data) {
		//System.out.println("Remove :"+data);
		Node  node = head;
		Node  n1 = null;
		while(node.next.next!=null) {
			if(data.equals(node.next.data)) {
				System.out.println("While :"+node.next.data);
				n1 = node.next;
				node.next = n1.next;
				n1 = null;
				break;
			}
			node = node.next;
		}
		if(data.equals(node.next.data)) {
			//System.out.println("Coming inside :"+node.data);
			node.next = null;
		}
	}*/
	
	public void insertAt(int index,String data) {
		Node  node = new Node ();
		node.data = data;
		node.next = null;
		
		if(index == 0) {
			insertAtStart(data);
		}
		else {
			Node  n = head;
			Node  n1 = null;
			
			for(int i=0;i<index-1;i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			n1 = null;
		}
	}
	
	//Inserting element at a particular position
	public void insertAtStart(String data) {
		Node  node = new Node ();
		node.data = data;
		node.next = null;
		
		node.next = head;
		head = node;
	}
	
	//Getting list size
	public int size(String str) {
		String[] temp = str.split(" ");
		return temp.length;
	}

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
	
	public void insertInt(int data) {
		Node node = new Node();
		node.data1 = data;
		node.next = null;
		
		if(head == null) {
			head  = node;
		}
		else {
			Node n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public String displayInt() {
		Node n = head;
		String temp="";
		if(head == null) {
			System.out.println("Your List has no elements!!!");
		}
		else {
			while(n.next!=null) {
				//System.out.print(n.data1+" ");
				temp+=n.data1+",";
				n = n.next;
			}
			//System.out.print(n.data1);
			temp+=n.data1;
		}
		return temp;
	}
	
	public void searchInt(int data) {
		Node node = head;
		boolean result = false;
		while(node.next!=null) {
			if(data == node.data1) {
				result = true;
				removeInt(data);
				break;
			}
			node = node.next;
		}
		if(data == node.data1) {
			result = true;
			removeInt(data);
		}
		if(result == false) {
			insertAtPreservedPosition(data);
		}
	}
	
	private void removeInt(int data) {
		Node node = head;
		Node n1 = null;
		
		while(node.next.next!=null) {
			if(node.next.data1 == data) {
				n1 = node.next;
				node.next = n1.next;
				break;
			}
			node = node.next;
		}
		if(node.next.data1 == data) {
			node.next = null;
		}

	}

	//For insert at Appropriate Position
	public void insertAtPreservedPosition(int data) {
		//System.out.println("Coming inside inserAtPreserved Position method :"+data);
		Node  node = new Node ();
		node.data1 = data;
		node.next = null;
		
		if(data < head.data1) {
			node.next = head;
			head = node;
		}
		else {
			Node  n = head;
			while(n.next!=null) {
				if(data<n.next.data1) {
					//System.out.println("Data :"+n.data1);
					node.next = n.next;
					n.next = node;
					break;
				}
				n = n.next;
			}
			n.next = node;
		}
	}
	
	//Stack Implementation start from here
	public void push(char data) {
		Node node=new Node();
		node.next=head;
		head=node;
		count++;
	}
	
	public void pop(char ch) {
		if(head == null) {
			System.out.println("Stack UnderFlow!!!");
		}
		else {
			head = head.next;
			count--;
		}
	}

	public char peek() {
		if(head == null) {
			System.out.println("No Data Present");
		}
		char ch = head.data2;
		return ch;
	}
	private boolean isEmpty(int top) {
		if(count == 0){
			return true;
		}
		else
			return false;
	}
	public int size() {
		return count;
	}
}
