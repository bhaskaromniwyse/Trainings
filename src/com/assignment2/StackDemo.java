package com.assignment2;

public class StackDemo {
	
		 private static final int capacity = 3;
		 int arr[] = new int[capacity];
		 int top = -1;
		 private int count=0;

		 public void push(int pushedElement) {
		  if (top < capacity - 1) {
		   top++;
		   arr[top] = pushedElement;
		   System.out.println("Element " + pushedElement+ " is pushed to Stack !");
		   printElements();
		   icrementCount();
		  } else {
		   System.out.println("Stack Overflow !");
		  }
		 }

		 public void pop() {
		  if (top >= 0) {
		   top--;
		   System.out.println("Pop operation done !");
		   decrementCount();
		  } else {
		   System.out.println("Stack Underflow !");
		  }
		 }

		 public void printElements() {
		  if (top >= 0) {
		   System.out.println("Elements in stack :");
		   for (int i = 0; i <= top; i++) {
		    System.out.println(arr[i]);
		   }
		  }
		 }
		 
		 private void icrementCount(){
			 count++;
		 }
		 private void decrementCount(){
			 count--;
		 }
		 
		 public int getStackSize(){
			 return count;
		 }
		 
		 public boolean isStackEmpty(){
			 if(count > 0)
				 return false;
			 return true;
		 }

		 public static void main(String[] args) {
		  StackDemo stackDemo = new StackDemo();

		  stackDemo.pop();
		  stackDemo.push(23);
		  stackDemo.push(2);
		  stackDemo.push(73);
		  System.out.println("is stack empty  = "+stackDemo.isStackEmpty());
		  System.out.println("stack size == = "+stackDemo.getStackSize());
		  stackDemo.push(21);
		  stackDemo.pop();
		  stackDemo.pop();
		  stackDemo.pop();
		  System.out.println("is stack empty  = "+stackDemo.isStackEmpty());
		  System.out.println("stack size == = "+stackDemo.getStackSize());
		  stackDemo.pop();
		 }

	}



