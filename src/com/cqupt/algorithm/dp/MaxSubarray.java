package com.cqupt.algorithm.dp;

/**
 * 
 * Title: MaxSubarray.java
 * 
 * @description:Find the contiguous subarray within an array (containing at
 *                   least one number) which has the largest sum.
 * 
 *                   For example, given the array [−2,1,−3,4,−1,2,1,−5,4], the
 *                   contiguous subarray [4,−1,2,1] has the largest sum = 6.
 * @author liucx
 * @created 2015年7月1日 下午7:07:19
 */
public class MaxSubarray {

	/**
	 * 
	 * @description 当以第(i-1)个数字为结尾的子数组中所有数字的和f(i-1)小于0时，如果把这个负数和第i个数相加，
	 *              得到的结果反而不第i个数本身还要小，所以这种情况下最大子数组和是第i个数本身。
	 *              如果以第(i-1)个数字为结尾的子数组中所有数字的和f
	 *              (i-1)大于0，与第i个数累加就得到了以第i个数结尾的子数组中所有数字的和。
	 * @author liucx
	 * @created 2015年7月1日 下午7:07:50
	 * @param nums
	 * @return
	 */
	public int maxSubArray(int[] nums) {
		int length = nums.length;
		int[] sums = new int[length];
		int maxPoint = 0;

		for (int i = 0; i < length; i++) {
			sums[i] = nums[i];
		}
		for (int i = 1; i < length; i++) {
			if (sums[i - 1] >= 0)
				sums[i] = sums[i - 1] + nums[i];
			else
				sums[i] = nums[i];

			if (sums[i] > sums[maxPoint])
				maxPoint = i;
		}

		return sums[maxPoint];
	}
}
