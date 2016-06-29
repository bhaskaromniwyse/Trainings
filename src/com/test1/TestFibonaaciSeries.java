package com.test1;

import org.junit.Test;

import com.assignment1.FibonaaciSeries;


public class TestFibonaaciSeries {
	
	@Test
	public void testgetFibSer(){
		FibonaaciSeries.printFibSer(7);
		 
	}
	
	@Test
	public void testnotgetFibSer(){
		FibonaaciSeries.printFibSer(0);
		 
	}

}
