package com.cqupt.algorithm.greedy;

public class JumpGame {
	public boolean canJump(int[] nums) {
		int step = 1;
		int max = 0;
		
		
		for (int i = 0; i < nums.length; i++) {
			step--;
			if (i + nums[i] > max) {
				max = nums[i] + i;
				step = nums[i];
			}
			if (step == 0 && i < nums.length - 1)
				return false;

		}
		return true;
	}
}
