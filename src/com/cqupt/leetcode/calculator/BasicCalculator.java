package com.cqupt.leetcode.calculator;

public class BasicCalculator {
	public int calculate(String s) {
		char[] characters = s.toCharArray();
		double previous = 0;
		boolean hasBrace = false;
		for (char c : characters) {
			double present = 0;
			if (c >= '0' && c <= '9') {
				present = c - '0';
			}
			// }else if(c==)

		}
		return 0;
	}
}
