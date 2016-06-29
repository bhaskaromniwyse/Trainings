package com.test5;

import static org.junit.Assert.*;

import org.junit.Test;

import com.assignment5.MatrixDeterminant;

public class TestMatrixDeterminant {

	
	@Test
	public void testdeterminant() {
		MatrixDeterminant md = new MatrixDeterminant();
		int a[][] = new int[][]{{1,1},{2,3}};
		assertEquals(1,md.determinant(a, 2));
	}

}
