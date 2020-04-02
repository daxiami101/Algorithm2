package com.daxiami101.leetcode.SameTree;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if (p==null && q==null) return true;
        if ((p!=null && q==null) || (p==null && q!=null) || (p.val != q.val)) 
        	return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
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
		
		
		
		TreeNode root1 = new TreeNode(0);
		TreeNode node11=new TreeNode(1);
		TreeNode node21=new TreeNode(2);
		TreeNode node31=new TreeNode(3);
		TreeNode node41=new TreeNode(4);
		TreeNode node51=new TreeNode(5);
		
		root1.left=node11;
		root1.right=node21;
		
		node11.left=node31;
		node11.right=node41;
		
		node21.left=node51;
		
//		System.out.println("=========pre========");
		List<Integer> list=new ArrayList<>();
		System.out.println(inOrderTraversal(root,list));
//		System.out.println("=========post=======");
//		postOrderTraversal(root);
		System.out.println(isSameTree(root, root1));;
	}
	public static List<Integer>  preOrderTraversal(TreeNode node,List<Integer> list){
		if(node!=null){
			System.out.println(node.val);
			list.add(node.val);
			preOrderTraversal(node.left,list);
			preOrderTraversal(node.right,list);
		}else{
			list.add(null);
		}
		return list;
	}
	
	public static void postOrderTraversal(TreeNode node){
		if(node!=null){
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			System.out.println(node.val);
		}
	}
	public static List<Integer> inOrderTraversal(TreeNode node,List<Integer> list){
		if(node!=null){
			inOrderTraversal(node.left,list);
//			System.out.println(node.val);
			list.add(node.val);
			inOrderTraversal(node.right,list);
		}else{
			list.add(null);
		}
		return list;
	}
}