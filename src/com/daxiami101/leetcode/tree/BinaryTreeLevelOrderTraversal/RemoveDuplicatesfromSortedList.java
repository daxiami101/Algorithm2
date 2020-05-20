package com.daxiami101.leetcode.tree.BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.daxiami101.basic.dataStructure.TreeNode;

public class RemoveDuplicatesfromSortedList {
	public static void main(String[] args) {
		RemoveDuplicatesfromSortedList a=new RemoveDuplicatesfromSortedList();
		TreeNode root = initData();
		a.levelOrderBottom(root);
	}
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>>result=new ArrayList<>();
		int height =depth(root);//getHeight(root);
		for(int i=0;i<height;i++){
			result.add(new ArrayList<>());
		}
		preOrder(root, 0, result);
		Collections.reverse(result);
		return result;
	}
//	public int getHeight(TreeNode root){
//		int HL,HR,MaxH;
//		if(root!=null){
//			HL=getHeight(root.left);
//			HL=getHeight(root.right);
//			MaxH=HL>HR?HL:HR;
//			return MaxH+1;
//		}else{
//			return 0;
//		}
//	}
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
	
	public void preOrder(TreeNode root,int level,List<List<Integer>>result){
		if(root==null){
			return ;
		}
		//System.out.println(root.val+" level:"+level);
		
		result.get(level)
		.add(root.val);
		preOrder(root.left,level+1,result);
		preOrder(root.right,level+1,result);
	}

	public static TreeNode initData() {
		TreeNode root = new TreeNode(0);
		TreeNode node1=new TreeNode(1);
		TreeNode node2=new TreeNode(2);
		TreeNode node3=new TreeNode(5);
		TreeNode node4=new TreeNode(4);
		TreeNode node5=new TreeNode(3);
		
		root.left=node1;
		root.right=node2;
		
		node1.left=node3;
		node1.right=node4;
		
		node2.left=node5;

		return root;
	}
	
}

