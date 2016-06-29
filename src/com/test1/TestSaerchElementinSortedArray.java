package com.test1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.assignment1.SearchElementinSortedArray;


public class TestSaerchElementinSortedArray {
	
	@Test
	public void testgetElement(){
		int ar[] = {1,2,3,4};
		assertEquals(2,SearchElementinSortedArray.getElement(ar,2));
		
	}

}
