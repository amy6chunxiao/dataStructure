package com.cqupt.leetcode.palindrome;

/**
 * 
 * Title: ValidPalindrome.java
 * 
 * @description:判断一个字符串是否为回文，也就是说从左往右读与从右往左读是一样的
 * @author liucx
 * @created 2015-6-9 下午8:08:52
 */
public class ValidPalindrome {
	/**
	 * 
	 * @description 思路：先将所有非字母字符、非数字字符用空内容的字符串替代
	 * @author liucx
	 * @created 2015-6-9 下午8:09:32
	 * @param s
	 * @return
	 */
	public boolean isPalindrome(String s) {
		s = s.toLowerCase();
		// 匹配所有非字母字符为“”
		s = s.replaceAll("\\W", "");
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1))
				return false;
		}
		return true;
	}
}
