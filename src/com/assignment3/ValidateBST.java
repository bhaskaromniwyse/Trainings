package com.assignment3;

import java.util.Stack;

public class ValidateBST {
	
	
	public boolean isValidBST(int[] n) {
		Stack<Integer> stk = new Stack<Integer>();
		
		int root = Integer.MIN_VALUE;
		
		for(int i=0;i<n.length;i++){
			
			if(n[i]<root){
				return false;
			}
			
			while(!stk.empty() && stk.peek()<n[i]){
				root = stk.peek();
				stk.pop();
			}
			
			stk.push(n[i]);
			
		}
		return true;
	}
		
		
	
	
	
	
	
	public static void main(String ar[]){
		int[] aa = {40, 30, 35, 80,100};
		ValidateBST vbst = new ValidateBST();
	System.out.println(vbst.isValidBST(aa));
	}
}
