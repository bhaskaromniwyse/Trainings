package com.test3;

import static org.junit.Assert.*;

import org.junit.Test;

import com.assignment3.ValidateBST;

public class TestValidateBST {

	@Test
	public void test() {
		ValidateBST vbst = new ValidateBST();
		int[] in = {40, 30, 35, 80,100};
		assertEquals(true, vbst.isValidBST(in));
	}
	
	@Test
	public void test1() {
		ValidateBST vbst = new ValidateBST();
		int[] in = {40, 30, 35, 80,20,100};
		assertEquals(false, vbst.isValidBST(in));
	}

}
