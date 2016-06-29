package com.assignment3;

public class MinHeapTree {
	private int[] heap;
	private int size;
	private int maxsize;
	
	private static final int FRONT = 1;
	
	public MinHeapTree(int maxsize){
		this.maxsize = maxsize;
		size = 0;
		heap = new int[maxsize+1];
		heap[0] = Integer.MIN_VALUE;
	}
	
	private int parent(int pos){
		return pos/2;
	}
	
	public void insert(int element){
		heap[++size] = element;
		int current = size;
		
		while(heap[current]<heap[parent(current)]){
			swap(current,parent(current));
			current = parent(current);			
		}
	}
	
	public void swap(int fpos,int spos){
		int temp;
		temp = heap[fpos];
		heap[fpos] = heap[spos];
		heap[spos] = temp;
	}
	
	public void print(){
		for(int i=1;i<=size/2;i++){
			System.out.print("parent = "+heap[i]+" left child = "+heap[2*i]+" right child = "+heap[2*i+1]);
			System.out.println();
		}
	}
	
	public int minVal(){
		return heap[FRONT];
	}
	
	public boolean searchElement(int val){
		boolean flag = false;
		if(size != 0){
			for(int i=1;i<=size;i++)
				if(heap[i] == val)
					flag = true;
		}
		return flag;
		
	}
	
	public boolean deleteElement(int val){
		boolean flag = false;
		if(size != 0){
			for(int i=1;i<=size;i++)
				if(heap[i] == val){
					for(int j=i;j<=size;j++)
						heap[i]=heap[++i];
					--size;
					flag = true;
				}
		}
		return flag;
	}
	
	public static void main(String ar[]){
		MinHeapTree mnht = new MinHeapTree(10);
		mnht.insert(25);
		mnht.insert(2);
		mnht.insert(22);
		mnht.insert(1);
		mnht.insert(20);
		mnht.print();
		System.out.println("min val = "+mnht.minVal());
		System.out.println(mnht.searchElement(20));
		System.out.println("deleting  == "+mnht.deleteElement(22));
		mnht.print();
		mnht.deleteElement(25);
		mnht.print();
	}
	

}
