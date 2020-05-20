package com.daxiami101.basic.dataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
	public void preOrder(TreeNode head) {
		if (head == null) {
			return;
		}
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(head);
		while (!s.isEmpty()) {
			TreeNode cur = s.pop();
			System.out.println(cur.val);
			if (cur.right != null) {
				s.push(cur.right);
			}
			if (cur.left != null) {
				s.push(cur.left);
			}
		}
	}

	public static void inorderTranversal(TreeNode node) {
		TreeNode tree;
		Stack<TreeNode> s = new Stack<>();
		tree = node;

		while (tree != null || !s.isEmpty()) {
			while (tree != null) {
				s.push(tree);
				tree = tree.left;
			}
			tree = s.pop();
			System.out.println(tree.val);
			tree = tree.right;
		}

	}

	public static int getHeight(TreeNode node) {
		int HL, HR, maxH;
		if (node != null) {
			HL = getHeight(node.left);
			HR = getHeight(node.right);
			maxH = HL > HR ? HL : HR;
			return maxH + 1;
		} else {
			return 0;
		}
	}

	public static void levelOrderTraversal(TreeNode root) {
		Queue<TreeNode> q = null;
		TreeNode node = null;

		if (root == null) {
			return;
		}
		q = new LinkedList<TreeNode>();
		q.add(root);
		while (!q.isEmpty()) {
			node = q.poll();
			System.out.println(node.val);
			if (node.left != null) {
				q.add(node.left);
			}
			if (node.right != null) {
				q.add(node.right);
			}
		}

	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
//		TreeNode node5 = new TreeNode(null);

		root.left = node1;
		root.right = node2;

		node1.left = node3;
		node1.right = node4;


//		inorderTranversal(root);
//		System.out.println("height:" + getHeight(root));
		levelOrderTraversal(root);
		;
	}
}
