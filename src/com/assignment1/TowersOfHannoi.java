package com.assignment1;

/**
 * @This class sole towers of hannoi puzzle
 */
public class TowersOfHannoi {
	public static void main(String[] args) {
		int val = playTowersofHannoi(2, "pole1", "pole2", "pole2");
	}

	/**
	 * @This method sole towers of hannoi puzzle
	 * 
	 * @ variable discno
	 * 
	 * @ variable source
	 * 
	 * @ varaible dest
	 * 
	 * @ variable temp
	 */
	public static int playTowersofHannoi(int discno, String source,String dest, String temp) {
		try{
			if (discno == 1){
				
				move(discno, source, dest);
				
			}else {
				playTowersofHannoi(discno - 1, source, temp, dest);
				move(discno, source, dest);
				playTowersofHannoi(discno - 1, temp, dest, source);
				return 1;
			}}catch(Exception e){
				return 0;
			}
		
		
		return 0;

	}

	/**
	 * @This method print the steps puzzle solvation
	 * 
	 * @ varaible discno
	 * 
	 * @ variable source
	 * 
	 * @ variable dest
	 */
	public static void move(int discno, String source, String dest) {
		System.out.println(discno + " moved from " + source + " to " + dest);

	}
}

/**
 * @@@@@@@@@@....Time complexity for this program is T(n) =
 * 2T(n-1)+2....@@@@@@@@@
 */