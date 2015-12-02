package com.cqupt.algorithm.dp;

import java.util.Stack;

/**
 * 
 * Title: LargestRectangle.java
 * 
 * @description:Given n non-negative integers representing the histogram's bar
 *                    height where the width of each bar is 1, find the area of
 *                    largest rectangle in the histogram.
 * @author liucx
 * @created 2015年7月9日 下午10:01:32
 */
public class LargestRectangle {
	/**
	 * 
	 * @description 使用一个栈保存递增的高度，1：当栈空或者当前高度大于栈顶下标所指示的高度时，当前下标入栈。否则，2：当前栈顶出栈，
	 *              并且用这个下标所指示的高度计算面积。
	 * @author liucx
	 * @created 2015年7月9日 下午10:02:17
	 * @param height
	 * @return
	 */
	public int largestRectangleArea(int[] height) {
		int area = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < height.length; i++) {
			if (stack.empty() || height[stack.peek()] < height[i])
				stack.push(i);
			else {
				int start = stack.pop();
				int width = stack.empty() ? i : i - stack.peek() - 1;
				area = Math.max(area, height[start] * width);
				i--;
			}
		}

		while (!stack.empty()) {
			int start = stack.pop();
			int width = stack.empty() ? height.length : height.length
					- stack.peek() - 1;
			area = Math.max(area, height[start] * width);
		}
		return area;
	}
}
