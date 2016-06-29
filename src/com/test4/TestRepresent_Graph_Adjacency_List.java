package com.test4;

import static org.junit.Assert.*;

import org.junit.Test;

import com.assignment4.Represent_Graph_Adjacency_List;

public class TestRepresent_Graph_Adjacency_List {

	@Test
	public void testgetpath() {
		Represent_Graph_Adjacency_List test = new Represent_Graph_Adjacency_List(3);
			test.setEdge(1, 2);
			test.setEdge(1, 3);
			test.setEdge(3, 1);
			
		 test.getPathbwNodes(2,3);
	}
	
	@Test
	public void testdfs() {
		Represent_Graph_Adjacency_List test = new Represent_Graph_Adjacency_List(3);
			test.setEdge(1, 2);
			test.setEdge(2, 3);
			test.setEdge(3, 1);
			
		 test.DfsTraversal(3);
	}
	
	@Test
	public void testbfs() {
		Represent_Graph_Adjacency_List test = new Represent_Graph_Adjacency_List(3);
			test.setEdge(1, 2);
			test.setEdge(2, 3);
			test.setEdge(3, 1);
			
		 test.BfsTraversal(3);
	}
}
