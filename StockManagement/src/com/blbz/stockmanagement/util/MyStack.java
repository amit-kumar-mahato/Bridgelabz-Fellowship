package com.blbz.stockmanagement.util;
/*
* Purpose: This class contains all methods implementation of Stack
* @author: Amit
* @since: 24-11-2019
* 
* */
public class MyStack<T> {

MyLinkedList<T> myLinkedList;
	
	//Constructor where creating object of MyLinkedList
	public MyStack(){
		myLinkedList = new MyLinkedList<T>();
	}
	
	/*
	 * Used to add data into the Stack
	 * @param-type: Generics
	 * @return-type: Doesn't return anything
	 * 
	 * */
	public void push(T data){
		myLinkedList.add(data);
	}
	
	/*
	 * Used to delete data from the Stack
	 * @param-type: Takes no argument
	 * @return-type: Generics
	 * 
	 * */
	public T pop(){
		return myLinkedList.pop();
	}
	
	public T peek(){
		T temp = myLinkedList.pop();
		myLinkedList.add(temp);
		return temp;
	}
	
	/*
	 * Check wheather the list is empty or not
	 * @param-type: Takes no argument
	 * @return-type: boolean value
	 * 
	 * */
	public boolean isEmpty(){
		return myLinkedList.isEmpty();
	}
	
	/*
	 * return size of te list
	 * @param-type: Takes no argument
	 * @return-type: int 
	 * 
	 * */
	public int size(){
		return myLinkedList.size();
	}

}
