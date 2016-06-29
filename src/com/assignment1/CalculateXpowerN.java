package com.assignment1;

/**
 * @This class calculates X power N
 */
public class CalculateXpowerN {
	public static void main(String[] args) {
		System.out.println(" value = " +calculate(2, 4));
		//calculate(1, 4);
	}

	/**
	 * @return
	 * @This Method calculates X power N
	 * 
	 *       @ variable x
	 * 
	 *       @ variable n
	 */
	public static int calculate(int x, int n) {

		int va = 1;
		for (int y = 0; y < n; y++) {
			va = va * x;
		}
		return va;
	}

}
/**
 * @@@@@@@@@@....Time complexity for this program is T(n) = T(n)....@@@@@@@@@
 */

/**
 * @@@@@@@@@@....According to best of my knowledge above program calculate the X
 *                         power N at less recursions as i mentioned time
 *                         complexity ....@@@@@@@@@
 */
