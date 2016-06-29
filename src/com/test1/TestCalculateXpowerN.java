package com.test1;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import com.assignment1.CalculateXpowerN;

import java.*;

import org.junit.Test;


public class TestCalculateXpowerN {
	@Test
	public void executetc()
	{
	CalculateXpowerN calc = new CalculateXpowerN();
	assertEquals(8,calc.calculate(2, 3));
	}

	

}
