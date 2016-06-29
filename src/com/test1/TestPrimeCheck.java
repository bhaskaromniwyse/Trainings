package com.test1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.assignment1.PrimeCheck;


public class TestPrimeCheck {
	@Test
	public void testPrime(){
		assertEquals(true,PrimeCheck.getPrime(3));
	}
	@Test
	public void testnotPrime(){
		assertEquals(false,PrimeCheck.getPrime(4));
	}

}
