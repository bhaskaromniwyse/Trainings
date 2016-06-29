package com.test2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.assignment2.QueueDemo;

public class TestQueueDemo {

	@Test
	public void testPush() {
		QueueDemo q = new QueueDemo();
		q.push(q, 5);
	}
	
	@Test
	public void testDisplay() {
		QueueDemo q = new QueueDemo();
		q.display();
	}
	@Test
	public void testQueueSize() {
		QueueDemo q = new QueueDemo();
		q.queueSize(q);
	}
	
	@Test
	public void testPop() {
		QueueDemo q = new QueueDemo();
		q.pop();
	}
	
	@Test
	public void testQueueIsEmpty() {
		QueueDemo q = new QueueDemo();
		q.queueIsEmpty(q);
	}
}
