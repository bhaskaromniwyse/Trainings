package com.test2;

import static org.junit.Assert.*;
import com.assignment2.*;
import org.junit.Test;

public class TestWorkingList {

	@Test
	public void testInsert() {
		ListDataStructure list = new ListDataStructure();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.insert(list,10);
	}
	
	
	
	@Test
	public void testFind() {
		ListDataStructure list = new ListDataStructure();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		assertEquals(3,list.find(list,3));
	}
	
	@Test
	public void testSize() {
		ListDataStructure list1 = new ListDataStructure();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		System.out.println("%%%%%%%%%%   "+list1.size());
		assertEquals(6,list1.size());
	}
	
	@Test
	public void testIsEmpty() {
		ListDataStructure list = new ListDataStructure();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		equals(list.isEmpty(list));
	}
	
	@Test
	public void testDelete() {
		ListDataStructure list = new ListDataStructure();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.delete(list, 4);
	}
	
	@Test
	public void testDisplayList() {
		ListDataStructure list = new ListDataStructure();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.displayList(list);
	}

}
