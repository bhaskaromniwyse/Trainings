package com.assignment1;

/**
 * This class solve all the functions.
 */
public class Recurrence1a {
	/**
	 * This function Implements the below function T(n) = 2T(n-1) - 1, if n > 0
	 * = 1, otherwise
	 * 
	 * @param n
	 * @return
	 */

	public int func1(int n) {
		if (n > 0)
			return 2 * func1(n - 1) - 1;
		else
			return 1;
	}

	/**
	 * This function Implements the below function T(n) = 2T(n/2) + nlog(n)
	 * 
	 * @param n
	 * @return
	 */

	public double func2(double n)

	{
		while (n > 0)
			return (2 * func2(n / 2)) + (n * Math.log(n));

		return 1;
	}

	/**
	 * This function Implements the below function T(n) = T(n/2) + T(n/4) +
	 * T(n/8) + n
	 * 
	 * @param n
	 * @return
	 */

	public int func3(int n) {
		while (n > 0)
			return (func3(n / 2) + func3(n / 4) + func3(n / 8) + n);

		return 1;
	}

	/**
	 * This function Implements the below function T(n) = 2T(sqrt(n)) + log(n)
	 * 
	 * @param d
	 * @return
	 */

	public double func4(double d) {
		/* getting stack over flow if d<2 */
		while (d > 2)
			return (2 * func4(Math.sqrt(d)) + Math.log(d));

		return 1;
	}

	/**
	 * This function Implements the below function T(n) = 1 if n < 2 = 8T(n/2) +
	 * n^3 + 1 otherwise
	 * 
	 * @param n
	 * @return
	 */

	public double func5(double n) {
		if (n < 2)
			return 1;
		else
			return (8 * func5(n / 2)) + (n * n * n) + 1;

	}

}
