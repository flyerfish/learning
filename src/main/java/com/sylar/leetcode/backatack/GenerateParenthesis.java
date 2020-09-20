package com.sylar.leetcode.backatack;

//https://leetcode-cn.com/submissions/detail/41110972/

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
	List<String> parenthesis = new ArrayList<>();

	public List<String> generateParenthesis(int n) {
		char[] exp = new char[2 * n];
		generate(0, n, n, exp);
		return parenthesis;
	}

	public void generate(int index, int open, int close, char[] exp) {
		if (open == 0 && close == 0) {
			parenthesis.add(new String(exp));
			return;
		}

		if (open - 1 >= 0) {
			exp[index] = '(';
			generate(index + 1, open - 1, close, exp);
		}

		if (close - 1 >= open) {
			exp[index] = ')';
			generate(index + 1, open, close - 1, exp);
		}
	}

	public List<String> generateParenthesis2(int n) {
		if (n == 0) {
			return new ArrayList<>();
		}
		StringBuilder track = new StringBuilder();
		List<String> res = new ArrayList<>();
		backTrack(n, n, track, res);
		return res;
	}

	void backTrack(int left, int right, StringBuilder track, List<String> res) {
		if (right < left) {
			return;
		}
		if (left < 0 || right < 0) {
			return;
		}
		if (left == 0 && right == 0) {
			res.add(track.toString());
		}

		track.append('(');
		backTrack(left - 1, right, track, res);
		track.deleteCharAt(track.length() - 1);

		track.append(')');
		backTrack(left, right - 1, track, res);
		track.deleteCharAt(track.length() - 1);
	}
}
