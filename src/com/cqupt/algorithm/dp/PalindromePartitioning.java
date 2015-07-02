package com.cqupt.algorithm.dp;

/**
 * 
 * Title: PalindromePartitioning.java
 * 
 * @description:Given a string s, partition s such that every substring of the
 *                    partition is a palindrome.
 * 
 *                    Return the minimum cuts needed for a palindrome
 *                    partitioning of s.
 * 
 *                    For example, given s = "aab", Return 1 since the
 *                    palindrome partitioning ["aa","b"] could be produced using
 *                    1 cut.
 * @author liucx
 * @created 2015年7月1日 下午9:25:07
 */
public class PalindromePartitioning {

	/**
	 * 
	 * @description 
	 * @author liucx
	 * @created 2015年7月1日 下午9:25:38
	 * @param s
	 * @return
	 */
	public int minCut(String s) {
		char[] chars = s.toCharArray();
		int[][] palindromeLabel = new int[chars.length][chars.length];
		int[] minCut = new int[chars.length + 1];

		for (int i = chars.length - 1; i >= 0; i--) {
			minCut[i] = Integer.MAX_VALUE;
			for (int j = i; j < chars.length; j++) {
				if (chars[i] == chars[j]
						&& ((j - i) < 2 || palindromeLabel[i + 1][j - 1] == 1)) {
					palindromeLabel[i][j] = 1;
					minCut[i] = Math.min(1 + minCut[j + 1], minCut[i]);
				}
			}
		}
		return minCut[0] - 1;
	}

	public static void main(String[] args) {
		PalindromePartitioning pp = new PalindromePartitioning();
		System.out.println(pp.minCut("abc"));
	}
}
