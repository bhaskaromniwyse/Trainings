package com.test5;

import static org.junit.Assert.*;

import org.junit.Test;

import com.assignment5.MyStringLib;


public class TestMyStringLib {

	@Test
	public void testfindStrChar1(){
		MyStringLib msl = new MyStringLib();
		assertEquals(5,msl.findStrChar("asdf;lkj", ';'));
	}
	
	@Test
	public void teststrCmpr(){
		MyStringLib msl = new MyStringLib();
		assertEquals(5,msl.strCmpr("asdf;lkj", "abn"));
	}
	
	@Test
	public void teststrCopy(){
		MyStringLib msl = new MyStringLib();
		assertEquals("asdf;lkjabn",msl.strCopy("asdf;lkj", "abn"));
	}
	

	@Test
	public void testisStringContainSubStrng1(){
		MyStringLib msl = new MyStringLib();
		assertEquals(false,msl.isStringContainSubStrng("asdf;lkj", "abn"));
	}
	@Test
	public void testisStringContainSubStrng2(){
		MyStringLib msl = new MyStringLib();
		assertEquals(true,msl.isStringContainSubStrng("asdf;lkj", ";"));
	}
	@Test
	public void testisStringContainSubStrng3(){
		MyStringLib msl = new MyStringLib();
		assertEquals(true,msl.isStringContainSubStrng("asdf;lkj", "sdf"));
	}
	@Test
	public void testisStringContainSubStrng4(){
		MyStringLib msl = new MyStringLib();
		assertEquals(false,msl.isStringContainSubStrng("asdf;lkj", "asf"));
	}
	
	@Test
	public void testfindLength(){
		MyStringLib msl = new MyStringLib();
		assertEquals(8,msl.findLength("asdf;lkj"));
	}
}
