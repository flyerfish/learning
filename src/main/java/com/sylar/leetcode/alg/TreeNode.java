package com.sylar.leetcode.alg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * TreeNode
 *
 * @param <T>
 * @Author
 */
public class TreeNode<T> {
	T val;
	public TreeNode left;
	public TreeNode right;

	TreeNode(T t) {
		val = t;
	}

	public static <T> TreeNode<T> valueOf(T[] vars) {
		if (vars.length == 0) {
			return null;
		}
		TreeNode<T> root = new TreeNode<>(vars[0]);
		valueOf(root, vars, 1);
		return root;
	}

	private static <T> void valueOf(TreeNode<T> root, T[] vars, int pos) {
		if (pos >= vars.length || root == null) {
			return;
		}

		TreeNode<T> left = null;
		TreeNode<T> right = null;
		if (vars[pos] != null) {
			left = new TreeNode<>(vars[pos]);
		}
		if (vars[pos + 1] != null) {
			right = new TreeNode<>(vars[pos + 1]);
		}

		root.left = left;
		root.right = right;
		valueOf(left, vars, pos + 2);
		valueOf(right, vars, pos + 4);
	}

	public static <T> TreeNode<T> valueOf(List<T> vars) {
		if (vars.size() == 0) {
			return null;
		}

		Queue<TreeNode<T>> queue = new LinkedList<>();
		TreeNode<T> root = new TreeNode<>(vars.get(0));
		queue.add(root);
		int i = 1;
		while (false == queue.isEmpty() && i < vars.size()) {
			TreeNode<T> node = queue.poll();
			if (vars.get(i) != null) {
				node.left = new TreeNode<>(vars.get(i));
				queue.add(node.left);
			}
			++i;
			if (vars.get(i) != null) {
				node.right = new TreeNode<>(vars.get(i));
				queue.add(node.right);
			}
			++i;
		}
		return root;
	}

	public static <T> List<T> toValue(TreeNode<T> root) {
		if (root == null) {
			return null;
		}

		Queue<TreeNode<T>> queue = new LinkedList<>();
		queue.add(root);
		List<T> value = new ArrayList<>();
		while (false == queue.isEmpty()) {
			TreeNode<T> node = queue.poll();
			if (node == null) {
				value.add(null);
				continue;
			}
			value.add(node.val);
			queue.add(node.left);
			queue.add(node.right);
		}
		return value;
	}
}
