package com.test3;

import static org.junit.Assert.*;

import org.junit.Test;

import com.assignment3.BinarySearchTree;

public class TestBinarySearchTree {

	@Test
	public void testInsert() {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertData(5);
	}
	
	@Test
	public void testDelete() {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertData(5);
		bst.insertData(15);
		bst.insertData(51);
		bst.insertData(50);
		bst.insertData(25);
		bst.insertData(35);
		bst.insertData(45);
		assertEquals(true,bst.deleteData(35));
	}
	@Test
	public void testDelete2() {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertData(5);
		bst.insertData(15);
		bst.insertData(51);
		bst.insertData(50);
		bst.insertData(25);
		bst.insertData(35);
		bst.insertData(45);
		assertEquals(false,bst.deleteData(352));
	}
	
	@Test
	public void testSearch() {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertData(5);
		bst.insertData(15);
		bst.insertData(51);
		bst.insertData(50);
		bst.insertData(25);
		bst.insertData(35);
		bst.insertData(45);
		assertEquals(false,bst.searchData(32));
	}
	@Test
	public void testSearch2() {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertData(5);
		bst.insertData(15);
		bst.insertData(51);
		bst.insertData(50);
		bst.insertData(25);
		bst.insertData(35);
		bst.insertData(45);
		assertEquals(true,bst.searchData(45));
	}
	
	@Test
	public void testLeafcount() {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertData(5);
		bst.insertData(15);
		bst.insertData(51);
		bst.insertData(50);
		bst.insertData(25);
		bst.insertData(35);
		bst.insertData(45);
		assertEquals(1,bst.getLeafCount());
	}
	
	@Test
	public void testHeight() {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertData(5);
		bst.insertData(15);
		bst.insertData(51);
		bst.insertData(50);
		bst.insertData(25);
		bst.insertData(35);
		bst.insertData(45);
		assertEquals(7,bst.treeHeight());
	}
	@Test
	public void testInOrder() {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertData(5);
		bst.insertData(15);
		bst.insertData(51);
		bst.insertData(50);
		bst.insertData(25);
		bst.insertData(35);
		bst.insertData(45);
		bst.inOrder();
	}
	
	@Test
	public void testPreOrder() {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertData(2);
		bst.insertData(4);
		bst.insertData(1);
		
		bst.preOrder();
	}
	
	@Test
	public void testPostOrder() {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertData(5);
		bst.insertData(15);
		bst.insertData(51);
		bst.insertData(50);
		bst.insertData(25);
		bst.insertData(35);
		bst.insertData(45);
		bst.postOrder();
	}
}
