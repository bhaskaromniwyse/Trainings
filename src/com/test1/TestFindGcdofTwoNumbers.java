package com.test1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.assignment1.CalculateXpowerN;
import com.assignment1.FindGcdofTwoNumbers;


public class TestFindGcdofTwoNumbers {
	@Test
	public void testGetGcdpass()
	{
		FindGcdofTwoNumbers gcd = new FindGcdofTwoNumbers();
	assertEquals(10,gcd.getGcd(10, 20));
	}
	
	
}
