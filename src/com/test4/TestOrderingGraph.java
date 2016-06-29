package com.test4;

import static org.junit.Assert.*;

import org.junit.Test;

import com.assignment4.OrderingGraph;

public class TestOrderingGraph {

	@Test
	public void testOrderingGraph() {
		OrderingGraph og = new OrderingGraph(6);
		og.addEdge(5,2);
        og.addEdge(5,0);
        og.addEdge(4,0);
        og.addEdge(4,1);
        og.addEdge(2,3);
        og.addEdge(3,1);
        assertEquals(true,og.topologicalSort());
	}
	
	@Test
	public void testOrderingGraph2() {
		OrderingGraph og = new OrderingGraph(5);
		og.addEdge(4,2);
        og.addEdge(3,1);
        og.addEdge(4,0);
        og.addEdge(4,1);
        og.addEdge(2,3);
       
        assertEquals(true,og.topologicalSort());
	}

}
