package com.daxiami101.leetcode.tree.ConvertSortedArraytoBinarySearchTree;

import com.daxiami101.basic.dataStructure.TreeNode;

public class RemoveDuplicatesfromSortedList {
	public static void main(String[] args) {
		RemoveDuplicatesfromSortedList a = new RemoveDuplicatesfromSortedList();
		// TreeNode root = initData();
		int[] nums = { -10, -3, 0, 5, 9 };
		 TreeNode node0 = new TreeNode(-10);
		 a.insert(node0, -3);
		 a.insert(node0, 0);
		 a.insert(node0, 5);
		 a.insert(node0, 9);
		 a.inOrder(node0);
		
//		TreeNode root = a.sortedArrayToBST(nums);
//		a.inOrder(root);
	}

	public void inOrder(TreeNode node) {
		if (node != null) {
			inOrder(node.left);
			System.out.println(node.val);
			inOrder(node.right);
		}
	}

	public TreeNode sortedArrayToBST(int[] nums) {
		int len = nums.length;
		if (len == 0) {
			return null;
		}
		TreeNode root = new TreeNode(nums[0]);
		if (len == 1) {
			return root;
		}
		for (int i = 1; i < len; i++) {
			insert(root, nums[i]);
		}
		return root;
	}

	public static TreeNode initData() {
		TreeNode root = new TreeNode(0);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(5);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(3);

		root.left = node1;
		root.right = node2;

		node1.left = node3;
		node1.right = node4;

		node2.left = node5;

		return root;
	}

	public TreeNode insert(TreeNode node, int num) {
		if (node == null) {
			node = new TreeNode(num);
			node.left = null;
			node.right = null;
		} else {
			if (num < node.val) {
				node.left = insert(node.left, num);
			} else if (num > node.val) {
				node.right = insert(node.right, num);
			}
		}
		return node;
	}
}
