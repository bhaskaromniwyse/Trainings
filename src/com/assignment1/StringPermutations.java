package com.assignment1;

import java.util.ArrayList;

import java.util.List;



/**
 * @This class print all permutations of a given string
 */
public class StringPermutations {
	
	public static void main(String[] args) {
		String ms = "BHASKAR";
		List list =  new ArrayList();
		list = permutations(ms);
		//permutations(ms);
		System.out.println(list);
	}

	/**
	 * @This method call permutation method
	 * 
	 * @ variable str
	 */
	public static List permutations(String str) {
		List list = new ArrayList();
		permutation("", str,list);
		return list;
	}

	/**
	 * @This method print all the permutations of given string
	 * 
	 * @ variable pre variable str
	 */
	public static List permutation(String pre, String str,List list) {
		int strlen = str.length();
		if (strlen == 0)
			list.add(pre);
			//System.out.println(pre);
		else {
			for (int i = 0; i < strlen; i++)
				permutation(pre + str.charAt(i),str.substring(0, i) + str.substring(i + 1, strlen),list);
		}
		return list;
	}
}

/**
 * @@@@@@@@@@....Time complexity for this program is T(n) = nT(n)....@@@@@@@@@
 */