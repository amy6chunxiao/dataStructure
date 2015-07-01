package com.cqupt.algorithm.dp;

/**
 * 
 * Title: EditDistance.java
 * 
 * @description:Given two words word1 and word2, find the minimum number of
 *                    steps required to convert word1 to word2. (each operation
 *                    is counted as 1 step.)
 * 
 *                    You have the following 3 operations permitted on a word:
 * 
 *                    a) Insert a character b) Delete a character c) Replace a
 *                    character
 * @author liucx
 * @created 2015年7月1日 下午7:55:26
 */
public class EditDistance {
	private int[][] minPath;

	// 与LCS算法刚好相反，LCS是求最大子序列，这个是求最小编辑距离
	public int minDistance(String word1, String word2) {

		if (word1.equals(word2))
			return 0;

		char[] char1 = word1.toCharArray();
		char[] char2 = word2.toCharArray();
		int char1Length = char1.length;
		int char2Length = char2.length;

		minPath = new int[char1Length + 1][char2Length + 1];
		for (int i = 0; i <= char1Length; i++)
			minPath[i][0] = i;
		for (int i = 0; i <= char2Length; i++)
			minPath[0][i] = i;

		int[] comparedValues = new int[3];
		for (int i = 1; i <= char1Length; i++) {
			for (int j = 1; j <= char2Length; j++) {
				comparedValues[0] = minPath[i][j - 1] + 1;
				comparedValues[1] = minPath[i - 1][j] + 1;
				comparedValues[2] = (char1[i - 1] == char2[j - 1]) ? minPath[i - 1][j - 1]
						: minPath[i - 1][j - 1] + 1;
				minPath[i][j] = minValue(comparedValues);
			}
		}
		return minPath[char1Length][char2Length];
	}

	private int minValue(int[] nums) {
		int minValue = Integer.MAX_VALUE;
		for (int tmp : nums) {
			if (tmp < minValue)
				minValue = tmp;
		}
		return minValue;

	}

}
