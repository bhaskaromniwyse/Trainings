package com.test5;

import static org.junit.Assert.*;

import org.junit.Test;

import com.assignment5.DetectCycleofGraph;

public class TestDetectCycleofGraph {

	@Test
	public void test() {
		DetectCycleofGraph dcg = new DetectCycleofGraph(3);
		dcg.addEdge(0, 1);
		dcg.addEdge(1, 2);
		dcg.addEdge(2, 0);
		assertEquals(true,dcg.isCyclic());
	}

	@Test
	public void test2() {
		DetectCycleofGraph dcg2 = new DetectCycleofGraph(5);
		dcg2.addEdge(1, 0);
		dcg2.addEdge(0, 2);
		dcg2.addEdge(2, 0);
		dcg2.addEdge(2, 3);
		dcg2.addEdge(3, 4);
		assertEquals(true,dcg2.isCyclic());
	}
}
