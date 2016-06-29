package com.assignment2;

public class ReversePrintingofList {
	
	public static void main(String ar[]){
		ListDataStructure list = new ListDataStructure();
	list.add(4);
	list.add(5);
	list.add(6);
	list.add(7);
	list.add(8);
	list.add(9);
	list.displayList(list);
	//WorkingList list1 = reverseList(list);
	//list1.displayList(list1);
	}
	
	public void reverseList(ListDataStructure list){
		if(list.size() != 0){
			ListDataStructure list1 = new ListDataStructure();
			for(int i=(list.size()-1);i>=0;i--){
				//list1.add(list.getVal(i));
				System.out.print("["+list.getVal(i)+"]");
			}
			
		}		
		
	}
}
