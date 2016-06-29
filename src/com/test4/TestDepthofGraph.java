package com.test4;

import static org.junit.Assert.*;

import org.junit.Test;

import com.assignment4.DepthofGraph;
import com.assignment4.OrderingGraph;

public class TestDepthofGraph {

	@Test
	public void testDepth() {
		DepthofGraph og = new DepthofGraph(6);
		og.addEdge(5,2);
        og.addEdge(5,0);
        og.addEdge(4,0);
        og.addEdge(4,1);
        og.addEdge(2,3);
        og.addEdge(3,1);
        assertEquals(5,og.findDepth());
	}

}
