package com.sylar.leetcode.str;

public class CommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		if (strs.length <= 0) {
			return "";
		}
		String s = strs[0];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); ++i) {
			for (int j = 1; j < strs.length; ++j) {
				if (i >= strs[j].length()) {
					return sb.toString();
				}

				if (s.charAt(i) != strs[j].charAt(i)) {
					return sb.toString();
				}
			}
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
}
