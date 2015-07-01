package com.cqupt.algorithm.dp;

/**
 * 
 * Title: MinimumPathSum.java
 * 
 * @description:Given a m x n grid filled with non-negative numbers, find a path
 *                    from top left to bottom right which minimizes the sum of
 *                    all numbers along its path.
 * 
 *                    Note: You can only move either down or right at any point
 *                    in time.
 * @author liucx
 * @created 2015年6月28日 上午11:28:33
 */
public class MinimumPathSum {
	private double[][] minPath;

	public double minPathSum(double[][] grid) {
		int colummn = grid[0].length;
		int row = grid.length;

		if (colummn == 0 || row == 0)
			return 0;

		minPath = new double[row][colummn];
		minPath[0][0] = grid[0][0];
		for (int i = 1; i < colummn; i++)
			minPath[0][i] = minPath[0][i - 1] + grid[0][i];
		for (int i = 1; i < row; i++)
			minPath[i][0] = minPath[i - 1][0] + grid[i][0];
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < colummn; j++)
				minPath[i][j] = Math.min(minPath[i - 1][j], minPath[i][j - 1])
						+ grid[i][j];
		}
		return minPath[row - 1][colummn - 1];
	}
}
