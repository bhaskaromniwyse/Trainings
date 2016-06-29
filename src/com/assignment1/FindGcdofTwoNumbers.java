package com.assignment1;

/**
 * @This class find GCD(Greatest Common Divisor) of two numbers
 */
public class FindGcdofTwoNumbers {

	public static void main(String[] args) {
		int num1 = 12, num2 = 525;
		System.out.println("GCD = " + getGcd(num1, num2));
	}

	/**
	 * @This Method find gcd of two numbers
	 * 
	 * @ variable num1
	 * 
	 * @ variable num2
	 */
	public static int getGcd(int num1, int num2) {
		if (num2 == 0) {
			return num1;
		}
		return getGcd(num2, num1 % num2);

	}
}

/**
 * @@@@@@@@@@....Time complexity for this program is T(n) = T(n%k)....@@@@@@@@@
 */