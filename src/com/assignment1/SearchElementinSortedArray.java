package com.assignment1;


/**
 * @This class find required element from sorted array
 */
public class SearchElementinSortedArray {
	public static void main(String ar[]) {
		int[] sortedarray = new int[100000001];
		int findelement = 40;
		for (int i = 1; i <= 100000000; i++) {
			sortedarray[i] = i;
		}

		int retrievedelement = getElement(sortedarray, findelement);
		if (retrievedelement == findelement)
			System.out.println("element find in the array = " + findelement);
		else
			System.out
					.println("element not find in the array = " + findelement);
	}

	/**
	 * @This method find required element from sorted array
	 * 
	 *       @ array sortedarray
	 * 
	 *       @ variable findelement
	 */
	public static int getElement(int[] sortedarray, int findelement) {
		int start = 0, middle, last;
		last = sortedarray.length - 1;
		middle = (start + last) / 2;
		while (start <= last) {
			if (findelement == (sortedarray[middle])) {
				return sortedarray[middle];
			} else if (findelement > sortedarray[middle]) {
				System.out.println("test" + sortedarray[middle]);
				start = middle + 1;
			} else if (findelement < sortedarray[middle]) {
				System.out.println("test" + sortedarray[middle]);
				last = middle - 1;
			} else
				return 0;

			middle = (start + last) / 2;
		}
		return 0;
	}

}
/**
 * @@@@@@@@@@....Time complexity for this program is T(n) = T(n/2)-k....@@@@@@@@@
 */
