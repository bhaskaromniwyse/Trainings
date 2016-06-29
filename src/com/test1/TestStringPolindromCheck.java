package com.test1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.assignment1.StringPolindromCheck;


public class TestStringPolindromCheck {
	
	@Test
	public void testisPal(){
		assertEquals(true,StringPolindromCheck.isPal("mam"));
	}
	
	@Test
	public void testisnotPal(){
		assertEquals(false,StringPolindromCheck.isPal("mama"));
	}
	@Test
	public void testisemptyPal(){
		equals(StringPolindromCheck.isPal(""));
		}
	@Test
	public void testisnullPal(){
		equals(StringPolindromCheck.isPal(null));
	}
}
