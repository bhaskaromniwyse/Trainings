package com.test4;

import static org.junit.Assert.*;



import org.junit.Test;

import com.assignment4.WeightedGraphShortPath;

public class TestWeightedGraphShortPath {

	@Test
	public void test() {
		WeightedGraphShortPath wg = new WeightedGraphShortPath(3);
		wg.createGraph();
		System.out.println(wg.findShoetestPath(1,3));
	}

}
