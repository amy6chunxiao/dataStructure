package com.cqupt.algorithm.dp;

/**
 * 
 * Title: CoinProblem.java
 * 
 * @description:给你一些面额的硬币，然后给你一个值N，要你求出构成N所需要的最少硬币的数量和方案
 * 
 *                                                       例如，给,2,3,5,然后N=11
 * @author liucx
 * @created 2015年7月2日 上午11:17:48
 */
public class CoinProblem {

	/**
	 * 
	 * @description 使用一个额外的数组记录硬币总和为0-value时所需最少硬币数，依次遍历给出的硬币面值coin[j]，
	 * 
	 *              找到所需最小硬币数，array[i]=min{array[i-coin[j]]}+1
	 * @author liucx
	 * @created 2015年7月2日 上午11:18:41
	 * @param coins
	 * @param value
	 * @return
	 */
	public int solution(int[] coins, int value) {
		// 记录硬币总和为0-value时所需最少硬币数
		int[] mins = new int[value + 1];
		mins[0] = 0;

		for (int i = 1; i <= value; i++) {
			// 注意这里不能用Integer.MAX_VALUE,否则会造成溢出问题，数据变为负数，比0小
			mins[i] = value + 1;
			for (int j = 0; j < coins.length; j++) {
				if (i >= coins[j]) {
					mins[i] = Math.min(mins[i], mins[i - coins[j]] + 1);
				}
			}
		}
		return mins[value];
	}
}
