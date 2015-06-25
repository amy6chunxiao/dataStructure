package com.cqupt.algorithm.dynamicProgramming;

import java.util.List;

/**
 * 
 * Title: TowerBlaster.java
 * 
 * @description:数塔问题：find the minimum path sum from top to bottom. Each step you
 *                        may move to adjacent numbers on the row below
 * @author liucx
 * @created 2015年6月25日 下午2:56:57
 */
public class TowerBlaster {
	/**
	 * 
	 * @description 从最后一层开始逐层往上递推，使用一个额外的数组，记录从底层到每层每个节点的最小距离
	 * @author liucx
	 * @created 2015年6月25日 下午2:56:53
	 * @param triangle
	 * @return
	 */
	public int minimumTotal(List<List<Integer>> triangle) {
		if (triangle == null || triangle.size() == 0) {
			return 0;
		}

		int n = triangle.size();
		int[][] sum = new int[n][n];

		for (int i = 0; i < n; i++) {
			sum[n - 1][i] = triangle.get(n - 1).get(i);
		}

		for (int i = n - 2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				sum[i][j] = Math.min(sum[i + 1][j], sum[i + 1][j + 1])
						+ triangle.get(i).get(j);
			}
		}
		return sum[0][0];
	}

	/**
	 * 
	 * @description 递归式的计算
	 * @author liucx
	 * @created 2015年6月25日 下午3:45:34
	 * @param triangle
	 * @return
	 */
	public int recurMinimumTotal(List<List<Integer>> triangle) {
		if (triangle == null || triangle.size() == 0) {
			return 0;
		}

		int n = triangle.size();
		int[][] minSum = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				minSum[i][j] = Integer.MAX_VALUE;
			}
		}
		return serch(0, 0, triangle, minSum);
	}

	private int serch(int x, int y, List<List<Integer>> triangle, int[][] minSum) {
		if (x >= triangle.size())
			return 0;
		if (minSum[x][y] != Integer.MAX_VALUE)
			return minSum[x][y];
		minSum[x][y] = Math.min(serch(x + 1, y, triangle, minSum),
				serch(x + 1, y + 1, triangle, minSum))
				+ triangle.get(x).get(y);
		return minSum[x][y];
	}
}
