package com.assignment2;

public class Node {
	public Node next;
	public int data;

	public Node(int datavalue){
		next = null;
		data = datavalue;
	}

	public Node(int datavalue,Node nextval){
		next = nextval;
		data = datavalue;
	}
	
	public int getData(){
		return data;
	}

	public void setData(int dataValue){
		data = dataValue;
	}
	public Node getNext(){
		return next;
	}

	public void setNext(Node nextval){
		this.next = nextval;
	}

}
