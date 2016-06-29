package com.test5;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.assignment5.GrepImplforFile;

public class TestGrepImplforFile {

	@Test
	public void testFindString1() {
		GrepImplforFile grep = new GrepImplforFile();
		try {
			assertEquals(false,grep.findString("ramu", "E:\\myfile.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testFindString2() {
		GrepImplforFile grep = new GrepImplforFile();
		try {
			assertEquals(false,grep.findString("welcome", "E:\\myfile.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void testFindString3() {
		GrepImplforFile grep = new GrepImplforFile();
		try {
			assertEquals(true,grep.findString("1", "E:\\myfile.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
