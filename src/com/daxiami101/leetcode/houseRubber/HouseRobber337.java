package com.daxiami101.leetcode.houseRubber;

import java.util.HashMap;

public class HouseRobber337 {
	public int rob(TreeNode root) {
		if (root == null)
			return 0;
		HashMap<TreeNode, Integer> map = new HashMap<>();
		return helper(root, map);
	}

	private int helper(TreeNode root, HashMap<TreeNode, Integer> map) {
		if (root == null)
			return 0;
		if (map.containsKey(root))
			return map.get(root);

		int val = root.val;

		if (root.left != null)
			val += helper(root.left.left, map) + helper(root.left.right, map);

		if (root.right != null)
			val += helper(root.right.left, map) + helper(root.right.right, map);

		val = Math.max(val, helper(root.left, map) + helper(root.right, map));

		map.put(root, val);

		return val;
	}

}