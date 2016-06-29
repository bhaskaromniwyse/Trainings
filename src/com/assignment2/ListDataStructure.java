package com.assignment2;

public class ListDataStructure{
	private static int count;
	private Node head;
	
	public void add(int data){
		if(head == null){
			head = new Node(data);
		}
		Node temp = new Node(data);
		Node currentnode = head;
		if(currentnode != null)
			while(currentnode.getNext() != null)
				currentnode = currentnode.getNext();
		currentnode.setNext(temp);
		
		incrementCounter();		
	}
	
	public void insert(ListDataStructure list,int val){
		if(head == null){
			head = new Node(val);
		}
		Node temp = new Node(val);
		Node currentnode = head;
		if(currentnode != null)
			while(currentnode.getNext() != null)
				currentnode = currentnode.getNext();
		currentnode.setNext(temp);		
		incrementCounter();	
	}
	
	public static int getCounter(){
		return count;
	}
	
	public static void incrementCounter(){
		count++;
	}
	
	public static void decrementCounter(){
		count--;
	}
	
	public void add(int data, int index){
		Node temp = new Node(data);
		Node currentnode = head;
		
		if(currentnode != null)
			for(int i=0;i<index && currentnode.getNext() != null;i++)
				currentnode = currentnode.getNext();
		temp.setNext(currentnode.getNext());
		currentnode.setNext(temp);
		 incrementCounter();
	}
	
	public int getVal(int index){
	/*	if(index <= 0)
			return null;*/
		Node currentnode = null;
		if(head != null){
			currentnode = head.getNext();
			for(int i=0;i < index;i++){
				if(currentnode.getNext() == null)
					return 0;
				currentnode = currentnode.getNext();				
			}
			return currentnode.getData();
		}
		
		return 0;
	}
	
	public int getIndex(int val,ListDataStructure list){
		for(int i=0;i<list.size()-1;i++)
			if(val ==  list.getVal(i))
				return i;
		return -1;
		
		
	}
	
	public int find(ListDataStructure list,int val){
		for(int i=0;i<(list.size());i++){
			/*System.out.println(i);
			System.out.println("?????????????????????  "+i+"  "+(list.size()-1)+" val = "+val+" getval = = = "+list.getVal(i));
			System.out.println( list.getVal(i));*/
			if(val ==  list.getVal(i)){
				//System.out.println("value = "+val+" found in the list");
				return val;
			}
		}
		//System.out.println("value = "+val+" not found in the list");
		return -1;
	}
	
	public void delete(ListDataStructure list,int val){
		int index = 0;
		if(val == getVal(find(list,val)))
			index = find(list,val);
		Node currentnode = head;
		if(head != null){
			for(int i=0; i<index;i++){
				if(currentnode.getNext() == null)
					break;
				currentnode = currentnode.getNext();
				if(i == index)
					currentnode.setNext(currentnode.getNext().getNext());
			}
			currentnode.setNext(currentnode.getNext().getNext());
			decrementCounter();
		}
	}
	
	public int size(){
		return getCounter();
	}
	
	public void displayList(ListDataStructure list){
		//System.out.println("printing list size     "+list.size());
		if(list.size() != 0)
			for(int i=0;i<list.size();i++)
				System.out.print("["+list.getVal(i)+"]");
		System.out.println();
	}
	
	public boolean isEmpty(ListDataStructure list){
		if(list.size() == 0)
			return true;
		return false;
		
	}
	
	/*public static WorkingList reverseList(WorkingList list){
		WorkingList list1 = new WorkingList();
		if(list !=null){
			//System.out.println("[[[[[[[[[[[[[[[[["+(list.size()-1));
			for(int i=list.size()-1;i>=0;i--){
				System.out.println("[[[[[[[[[[[[[[[[["+list1.size()+"  "+i);
				list1.add(list.getVal(i),i);
			}
			return list1;			
		}
		return null;		
	}*/
	
		
}
