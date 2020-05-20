package com.daxiami101.leetcode.tree.MaximumDepthofBinaryTree;

public class TreeOperation {
	public void levelOrder(TreeNode Node) {
		if (Node == null) {
			return;
		}

		int depth = depth(Node);

		for (int i = 1; i <= depth; i++) {
			levelOrder(Node, i);
		}
	}

	private void levelOrder(TreeNode Node, int level) {
		if (Node == null || level < 1) {
			return;
		}

		if (level == 1) {
			System.out.print(Node.val + "  ");
			return;
		}

		// ×ó×ÓÊ÷
		levelOrder(Node.left, level - 1);

		// ÓÒ×ÓÊ÷
		levelOrder(Node.right, level - 1);
	}

	public int depth(TreeNode Node) {
		if (Node == null) {
			return 0;
		}

		int l = depth(Node.left);
		int r = depth(Node.right);
		if (l > r) {
			return l + 1;
		} else {
			return r + 1;
		}
	}

	public static void main(String[] args) {
		int[] input = { 4, 2, 6, 1, 3, 5, 7, 8, 10 };
		// TreeNode<Integer> tree = new Tree<>();
		// for(int i = 0; i < input.length; i++)
		// {
		// tree.insert(input[i]);
		// }
		// System.out.print( "Ç°Ðò±éÀú £º" );
		// tree.preOrder(tree.root);
		// System.out.print( "\nÖÐÐò±éÀú £º" );
		// tree.midOrder(tree.root);
		// System.out.print( "\nºóÐò±éÀú £º" );
		// tree.posOrder(tree.root);
		// System.out.print("\nµÝ¹é²ãÐò±éÀú£º");
		// tree.levelOrder(tree.root);
	}

}
