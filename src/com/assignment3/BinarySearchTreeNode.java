package com.assignment3;

public class BinarySearchTreeNode {
	public int data;
	public BinarySearchTreeNode left,right;
	
	public BinarySearchTreeNode(){
		data = 0;
		left = right = null;		
	}
	public BinarySearchTreeNode(int data){
		this.data = data;
		left = right = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BinarySearchTreeNode getLeft() {
		return left;
	}
	public void setLeft(BinarySearchTreeNode left) {
		this.left = left;
	}
	public BinarySearchTreeNode getRight() {
		return right;
	}
	public void setRight(BinarySearchTreeNode right) {
		this.right = right;
	}
}