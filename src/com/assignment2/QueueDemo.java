package com.assignment2;

public class QueueDemo {
	 private int capacity = 3;
	 int arr[] = new int[capacity];
	 int count = 0;
	 int front = -1;
	 int rear = 0;

	 public void push(QueueDemo q,int pushedElement) {
	  if (front < capacity - 1) {
		  front++;
		  incrementCount();
	   arr[front] = pushedElement;
	   System.out.println("Element " + pushedElement + " is pushed to Queue !");
	   display();
	  } else {
	   System.out.println("Overflow !");
	  }

	 }
	 
	 public void pop() {
	  if (front >= rear) {
	   rear++;
	   decrementCount();
	   System.out.println("Pop operation done !");
	   display();
	  } else {
	   System.out.println("Underflow !");
	  }
	 }

	 public void display() {
	  if (front >= rear) {
	   System.out.println("Elements in Queue : ");
	   for (int i = rear; i <= front; i++) {
	    System.out.println(arr[i]);
	   }
	  }
	 }
	 
	 public static int queueSize(QueueDemo q){
		 return q.count;
	 }
	 
	 public void incrementCount(){
		 count++;
	}
	 
	 public void decrementCount(){
		 count--;
	}
	 public static boolean queueIsEmpty(QueueDemo q){
		 if(queueSize(q) == 0)
			 return true;
		 return false;
	 }

	 public static void main(String[] args) {
	  QueueDemo queueDemo = new QueueDemo();
	  queueDemo.pop();
	  queueDemo.push(queueDemo,23);
	  queueDemo.push(queueDemo,2);
	  queueDemo.push(queueDemo,73);
	  System.out.println("sizeeeeeeeeeeeeeeeeee = "+queueSize(queueDemo));
	  System.out.println("is empty ============= "+queueIsEmpty(queueDemo));
	  queueDemo.push(queueDemo,21);
	  queueDemo.pop();
	  queueDemo.pop();
	  queueDemo.pop();
	  System.out.println("is empty ============= "+queueIsEmpty(queueDemo));
	  queueDemo.pop();
	 }

}
