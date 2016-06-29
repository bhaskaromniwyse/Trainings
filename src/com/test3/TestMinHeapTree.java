package com.test3;

import static org.junit.Assert.*;

import org.junit.Test;

import com.assignment3.MinHeapTree;

public class TestMinHeapTree {

	@Test
	public void testInsert() {
		MinHeapTree mnht = new MinHeapTree(10);
		mnht.insert(25);		
	}
	
	@Test
	public void testSearch() {
		MinHeapTree mnht = new MinHeapTree(10);
		mnht.insert(25);		
		mnht.insert(10);
		mnht.insert(4);
		mnht.insert(3);
		mnht.insert(9);
		mnht.insert(11);
		mnht.insert(44);
		assertEquals(true,mnht.searchElement(44));
	}
	
	@Test
	public void testSearch2() {
		MinHeapTree mnht = new MinHeapTree(10);
		mnht.insert(25);		
		mnht.insert(10);
		mnht.insert(4);
		mnht.insert(3);
		mnht.insert(9);
		mnht.insert(11);
		mnht.insert(44);
		assertEquals(false,mnht.searchElement(40));
	}
	@Test
	public void testFindMinValue() {
		MinHeapTree mnht = new MinHeapTree(10);
		mnht.insert(25);		
		mnht.insert(10);
		mnht.insert(4);
		mnht.insert(3);
		mnht.insert(9);
		mnht.insert(11);
		mnht.insert(44);
		assertEquals(3,mnht.minVal());
	}
	/*@Test
	public void testFindMinValue2() {
		MinHeapTree mnht = new MinHeapTree(10);
		mnht.insert(25);		
		mnht.insert(10);
		mnht.insert(4);
		mnht.insert(3);
		mnht.insert(9);
		mnht.insert(11);
		mnht.insert(44);
		assertEquals(25,mnht.minVal());
	}*/
	
	@Test
	public void testDeleteElement() {
		MinHeapTree mnht = new MinHeapTree(10);
		mnht.insert(25);		
		mnht.insert(10);
		mnht.insert(4);
		mnht.insert(3);
		mnht.insert(9);
		mnht.insert(11);
		mnht.insert(44);
		assertEquals(true,mnht.deleteElement(11));
	}
	@Test
	public void testDeleteElement2() {
		MinHeapTree mnht = new MinHeapTree(10);
		mnht.insert(25);		
		mnht.insert(10);
		mnht.insert(4);
		mnht.insert(3);
		mnht.insert(9);
		mnht.insert(11);
		mnht.insert(44);
		assertEquals(false,mnht.deleteElement(111));
	}
	
}












