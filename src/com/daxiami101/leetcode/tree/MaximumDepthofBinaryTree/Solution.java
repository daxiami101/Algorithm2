package com.daxiami101.leetcode.tree.MaximumDepthofBinaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Solution {
	public int maxDepth(TreeNode root) {
		if(root==null){
			return 0;
		}
		if(root.left==null&& root.right==null){
			return 1;
		}
		List<Integer>list=new ArrayList<>();
		List<Integer> result = postOrderTraversal(root, 0,list);
		Collections.sort(result);
		System.out.println(result);
		int size = result.size();
		return result.get(size-1);
	}
	public  List<Integer> postOrderTraversal(TreeNode node,int count,List<Integer>result){
		if(node!=null){
			result.add(++count);
			System.out.println("val:"+node.val+" count:"+count);
			postOrderTraversal(node.left,count,result);
			postOrderTraversal(node.right,count,result);
		}
		return result;
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
		TreeNode node1=new TreeNode(1);
		TreeNode node2=new TreeNode(2);
		TreeNode node3=new TreeNode(3);
		TreeNode node4=new TreeNode(4);
		TreeNode node5=new TreeNode(null);
		
		root.left=node1;
		root.right=node2;
		
		node1.left=node3;
		node1.right=node4;
		
		node2.left=node5;
		Solution solution=new Solution();
		System.out.println(solution.maxDepth(root));;
	}
}