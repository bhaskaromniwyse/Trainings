package com.test2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.assignment2.StackDemo;

public class TestStackDemo {

	@Test
	public void testPush() {
		StackDemo stck = new StackDemo();
		stck.push(3);
	}
	
	@Test
	public void testPrintElement() {
		StackDemo stck = new StackDemo();
		stck.printElements();
	}
	
	@Test
	public void testStackSize() {
		StackDemo stck = new StackDemo();
		System.out.println("stack size    "+stck.getStackSize());
		stck.push(3);
		assertEquals(1,stck.getStackSize());
	}
	
	@Test
	public void testIsEmpty() {
		StackDemo stck = new StackDemo();
		equals(stck.isStackEmpty());
	}
	
	@Test
	public void testPop() {
		StackDemo stck = new StackDemo();
		stck.pop();
	}
	
}
