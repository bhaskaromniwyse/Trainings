package com.test3;

import static org.junit.Assert.*;

import org.junit.Test;

import com.assignment3.InfixExpressionToPostfixExpression;

public class TestInfixExpressionToPostfixExpression {

	@Test
	public void test1() {
		InfixExpressionToPostfixExpression ip = new InfixExpressionToPostfixExpression();
		assertEquals("345*6/+",ip.postFixConvert("3+4*5/6"));		
	}
	
	@Test
	public void test2() {
		InfixExpressionToPostfixExpression ip = new InfixExpressionToPostfixExpression();
		assertEquals("AB+C+D+",ip.postFixConvert("A+B+C+D"));		
	}
	@Test
	public void test3() {
		InfixExpressionToPostfixExpression ip = new InfixExpressionToPostfixExpression();
		assertEquals("AB*CD*+",ip.postFixConvert("A*B+C*D"));		
	}
	/*@Test
	public void test4() {
		InfixExpressionToPostfixExpression ip = new InfixExpressionToPostfixExpression();
		assertEquals("ABC*+D+",ip.postFixConvert("A+B*C+D"));		
	}*/

}
