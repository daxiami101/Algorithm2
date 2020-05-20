package com.daxiami101.leetcode.SameTree;

import java.util.ArrayList;
import java.util.List;

public class TreeDemo {
	List<TreeNode> mRes = new ArrayList<>();

    public List<TreeNode> traversal(TreeNode root) {
        dfs(root);
        return mRes;
    }

    private void dfs(TreeNode root) {
        if (root != null) {
            //preOrder
            mRes.add(root);
            dfs(root.left);
            dfs(root.right);
        }
    }
}
