package com.cqupt.algorithm.basic;

/**
 * 
 * Title: RotatedSortedArray.java
 * 
 * @description:Suppose a sorted array is rotated at some pivot unknown to you
 *                      beforehand.
 * 
 *                      (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * @author liucx
 * @created 2015年7月3日 下午8:05:44
 */
public class RotatedSortedArray {

	/**
	 * 
	 * @description A[mid] > A[start]，那么最小值一定在右半区间，譬如[4,5,6,7,0,1,2]，中间元素为7，7 >
	 *              4，最小元素一定在[7,0,1,2]这边，于是我们继续在这个区间查找。 A[mid] <
	 *              A[start]，那么最小值一定在左半区间，譬如[7,0,1,2,4,5,6]，这件元素为2，2 <
	 *              7，我们继续在[7,0,1,2]这个区间查找。
	 * @author liucx
	 * @created 2015年7月3日 下午8:05:58
	 * @param nums
	 * @return
	 */
	public int findMin(int[] nums) {
		int start = 0;
		int end = nums.length - 1;

		while (start < end - 1) {
			if (nums[start] < nums[end])
				return nums[start];

			int mid = (start + end) / 2;
			if (nums[start] < nums[mid])
				start = mid;
			else if (nums[start] > nums[mid])
				end = mid;
		}
		return Math.min(nums[start], nums[end]);
	}

	/**
	 * 
	 * @description A[mid] > A[start]，右半区间查找。 A[mid] < A[start]，左半区间查找。 A[mid] =
	 *              A[start]，出现这种情况，我们跳过start，重新查找，譬如[2,2,2,1]，A[mid] =
	 *              A[start]都为2，这时候我们跳过start，使用[2,2,1]继续查找。
	 * @author liucx
	 * @created 2015年7月3日 下午8:11:14
	 * @param nums
	 * @return
	 */
	public int findMinWithRepeatValue(int[] nums) {
		int start = 0;
		int end = nums.length - 1;

		while (start < end - 1) {
			if (nums[start] < nums[end])
				return nums[start];

			int mid = (start + end) / 2;
			if (nums[start] < nums[mid])
				start = mid;
			else if (nums[start] > nums[mid])
				end = mid;
			else {
				start++;
			}
		}
		return Math.min(nums[start], nums[end]);
	}
}
