package codility;

import java.util.HashSet;

public class OddOccurrencesInArray {
	//A is no-empty
	//B is odd
	//It contains pairs, need to return value of unpaired element

	public static void main(String[] args) {
		System.out.println(Solution(new int[] {9,3,9,3,9,7,9}));
	}

	//Time: O(N)
	//Space: O(1)
	public static int Solution(int[] A) {
		//write your code in Java SE 8
		int elem = 0;
		for (int i = 0; i < A.length; i++) {
			elem ^= A[i];
		}
		return elem;
	}
}