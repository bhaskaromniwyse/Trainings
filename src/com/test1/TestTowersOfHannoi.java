package com.test1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.assignment1.TowersOfHannoi;


public class TestTowersOfHannoi {
	
	@Test
	public void testplayTowersofHannoi(){
		assertEquals(1,TowersOfHannoi.playTowersofHannoi(3, "pole1", "pole3", "pole2"));
	}

}
