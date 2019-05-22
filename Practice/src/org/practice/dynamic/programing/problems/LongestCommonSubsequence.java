/**
 * 
 */
package org.practice.dynamic.programing.problems;

/**
 * The longest common subsequence (LCS) problem is the problem of finding the
 * longest subsequence that is present in given two sequences in the same order.
 * i.e. find a longest sequence which can be obtained from the first original
 * sequence by deleting some items, and from the second original sequence by
 * deleting other items.
 * 
 * @author Anish Singh
 *
 */
public class LongestCommonSubsequence {

	public static void main(String args[]) {
		System.out.println(longestCommonSubsequence("ABCBDAB", "BDCABA", "ABCBDAB".length(), "BDCABA".length()));
	}

	public static int longestCommonSubsequence(String firstSequence, String secondSequence, int lengthOfFirstString,
			int lengthOfSecondString) {
		/**
		 * If the length is 0 return 0.
		 */
		if (lengthOfFirstString == 0 || lengthOfSecondString == 0) {
			return 0;
		}
		/**
		 * If the sequence have same length.
		 */
		if (firstSequence.charAt(lengthOfFirstString - 1) == secondSequence.charAt(lengthOfSecondString - 1)) {
			return longestCommonSubsequence(firstSequence, secondSequence, lengthOfFirstString - 1,
					lengthOfSecondString - 1) + 1;
		}
		/**
		 * If the sequence have different length.
		 */
		return Integer.max(
				longestCommonSubsequence(firstSequence, secondSequence, lengthOfFirstString, lengthOfSecondString - 1),
				longestCommonSubsequence(firstSequence, secondSequence, lengthOfFirstString - 1, lengthOfSecondString));
	}

}
