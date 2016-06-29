package com.assignment1;

/**
 * @This class check whether the given string is polindrom or not
 */
public class StringPolindromCheck {
	public static void main(String[] args) {
		String name = "mam";
		if (isPal(name))
			System.out.println("Given String is polindrom = " + name);
		else
			System.out.println("Given String is not polindrom = " + name);
	}

	/**
	 * @This method check whether the given string is polindrom or not
	 * 
	 * @ variable str
	 */
	public static boolean isPal(String str) {
		if(str != null){
		if (str.length() == 0 || str.length() == 1)
			return true;
		if (str.charAt(0) == str.charAt(str.length() - 1))
			return isPal(str.substring(1, str.length() - 1));
		}
		return false;

	}

}

/**
 * @@@@@@@@@@....Time complexity for this program is T(n) = T(n-1)....@@@@@@@@@
 */