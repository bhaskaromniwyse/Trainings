package com.test2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.assignment2.ExpressionChecking;

public class TestExpressionChecking {

	@Test
	public void testExpressionMatch() {
		assertEquals(true,ExpressionChecking.isParenthesisMatch("[]"));;
	}
	
	@Test
	public void testFail1ExpressionMatch() {
		assertEquals(false,ExpressionChecking.isParenthesisMatch("[{]}"));;
	}

	@Test
	public void testFail2ExpressionMatch() {
		assertEquals(false,ExpressionChecking.isParenthesisMatch("[{("));;
	}
	
	@Test
	public void testnotFailExpressionMatch() {
		assertEquals(true,ExpressionChecking.isParenthesisMatch("{([])}"));;
	}


}
