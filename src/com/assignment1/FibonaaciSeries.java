package com.assignment1;

/**
 * @This class print N number of fibnacci series
 */
public class FibonaaciSeries {
	public static void main(String[] args) {
		//int fibnum = 7;
		

		/*
		 * @This loop prints N number of fibanacci series
		 * 
		 * @ variable fibnum
		 */
		

		
		int num=10;
		printFibSer(num);
	}

	/**
	 * @This loop prints N number of fibanacci series
	 * 
	 *       @ variable fibnum
	 * 
	 *       @ variable index
	 * 
	 *       @ variable next
	 * 
	 *       @ variable incr
	 */
	public static void printFibSer(int num) {
		int index = 0, next = 1, incr;
		System.out.print(":: "+next + ",");		
		for (int i = 0; i <num; i++) {
			incr = index + next;
			System.out.print("," + incr);
			index = next;
			next = incr;
		}
		
		/*int incr = index + next;
		index = next;
		next = incr;
		fibnum--;
		if (fibnum > 0)
			getFibSer(fibnum, index, next);*/

	}
}
/**
 * @@@@@@@@@@....Time complexity for this program is if use loop or recursion
 *                    its O(n)....@@@@@@@@@
 */
