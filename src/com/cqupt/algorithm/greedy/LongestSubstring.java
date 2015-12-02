package com.cqupt.algorithm.greedy;

import java.util.ArrayList;

public class LongestSubstring {
	public int lengthOfLongestSubstring(String s) {
		char[] chars = s.toCharArray();
		int maxLength = 0, startIndex = 0, count = 1;

		for (; startIndex < chars.length; startIndex++) {
			if (startIndex + count >= chars.length) {
				if (count > maxLength)
					maxLength = count;
				break;
			}
			for (int i = startIndex; i < startIndex + count; i++) {
				if (chars[i] == chars[startIndex + count]) {
					if (count > maxLength)
						maxLength = count;
					startIndex = i + 1;
					count = 0;
					break;
				}
			}
			count++;

		}
		return maxLength;
	}

	public int lengthOfLongestSubstring2(String s) {
		char[] chars = s.toCharArray();
		int startIndex = 0, maxLength = 1, endIndex = 1;

		while (endIndex < chars.length) {
			for (int i = startIndex; i < endIndex; i++) {
				if (chars[i] == chars[endIndex]) {
					if (endIndex - startIndex > maxLength)
						maxLength = endIndex - startIndex;
					startIndex = i + 1;
					endIndex = i + 1;
					break;
				}
			}
			endIndex++;
		}
		return maxLength;
	}

	public int lengthOfLastWord(String s) {
		if (s == null || s.equals(""))
			return 0;
		String[] splits = s.split(" ");
		if (splits == null || splits.length == 0)
			return 0;
		else
			return splits[splits.length - 1].length();
	}

	public ArrayList<ArrayList<Integer>> combine(int n, int k) {

		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if (n <= 0 || n < k)
			return res;
		helper(n, k, 1, new ArrayList<Integer>(), res);
		return res;
	}

	private void helper(int n, int k, int start, ArrayList<Integer> item,
			ArrayList<ArrayList<Integer>> res) {
		if (item.size() == k) {
			res.add(new ArrayList<Integer>(item));
			return;
		}
		for (int i = start; i <= n; i++) {
			item.add(i);
			helper(n, k, i + 1, item, res);
			item.remove(item.size() - 1);
		}
	}

	public static void main(String[] args) {
		LongestSubstring longestSubstring = new LongestSubstring();
		System.out.println(longestSubstring.lengthOfLastWord(" "));
	}
}
