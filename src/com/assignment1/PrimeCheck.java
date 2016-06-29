package com.assignment1;

public class PrimeCheck {
	/**
	 * @This class check whether given number is prime or not
	 */
	public static void main(String[] args) {
		boolean flag = false;
		int n = 5;
		if (n > 0) {
			flag = getPrime(n);
			if (flag)
				System.out.println("given number = " + n + " is prime");
			else
				System.out.println("given number = " + n + " is notprime");
		} else
			System.out.println("enter proper value");

	}

	/**
	 * @This method check whether given number is prime or not
	 * 
	 * @ variable num
	 */
	public static boolean getPrime(int num) {
		for (int i = 2; i < num; i++)
			if (num % i == 0)
				return false;
		return true;
	}
}

/**
 * @@@@@@@@@@....Time complexity for this program is T(n) = T(n-1)....@@@@@@@@@
 */