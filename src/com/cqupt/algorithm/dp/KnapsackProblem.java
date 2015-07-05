package com.cqupt.algorithm.dp;

/**
 * 
 * Title: KnapsackProblem.java
 * 
 * @description:著名的背包问题，和硬币问题采用相似的解决方案
 * @author liucx
 * @created 2015年7月3日 上午10:18:12
 */
public class KnapsackProblem {

	private int[] solution;

	public int solution(int[] weight, int[] values, int volume) {
		int[] maxValue = new int[volume + 1];
		solution = new int[volume + 1];
		maxValue[0] = 0;

		for (int i = 1; i < maxValue.length; i++) {
			maxValue[i] = 0;
			for (int j = 0; j < weight.length; j++) {
				if (i >= weight[j]) {
					if (maxValue[i] < maxValue[i - weight[j]] + values[j]) {
						maxValue[i] = maxValue[i - weight[j]] + values[j];
						solution[i - 1] = values[j];
					}
				}
			}
		}
		return maxValue[volume];
	}

	public int[] getSolution() {
		return this.solution;
	}

	public static void main(String[] args) {
		int[] weight = { 4, 5, 2, 1, 6 };
		int[] values = { 4500, 5700, 2250, 1100, 6700 };
		KnapsackProblem knapsackProblem = new KnapsackProblem();
		System.out.println(knapsackProblem.solution(weight, values, 8));

		for (int tmp : knapsackProblem.getSolution())
			System.out.println(tmp);
	}
}
