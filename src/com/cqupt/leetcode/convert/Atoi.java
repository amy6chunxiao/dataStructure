package com.cqupt.leetcode.convert;

/**
 * 
 * Title: Atoi.java
 * 
 * @description:Implement atoi to convert a string to an integer.
 * @author liucx
 * @created 2015-6-2 下午7:47:59
 */
public class Atoi {
	/**
	 * 
	 * @description 思路，先检查是否为空，再判断符号，之后判断每一个数字，在更新数字前要判断是否越界
	 * @author liucx
	 * @created 2015-6-2 下午7:35:58
	 * @param str
	 * @return
	 */
	public int myAtoi(String str) {
		int sign = 1, index = 0, num = 0;
		if (str == null || str.length() == 0)
			return 0;
		
		char[] character = (str=str.trim()).toCharArray();
		if (str.startsWith("+")) {
			sign = 1;
			index++;
		} else if (str.startsWith("-")) {
			sign = -1;
			index++;
		}
		while (index < character.length) {
			int tmp = 0;
			if (character[index] >= '0' && character[index] <= '9')
				tmp = character[index] - '0';
			else
				break;
			if (Integer.MAX_VALUE / 10 < num || Integer.MAX_VALUE / 10 == num
					&& Integer.MAX_VALUE % 10 < tmp) {
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			num = 10 * num + tmp;
			index++;
		}
		return num *= sign;
	}

}
