package com.daxiami101.leetcode.RemoveDuplicatesfromSortedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesfromSortedList {
	public static ListNode deleteDuplicates(ListNode head) {
		if(head==null || head.next==null){
			return head;
		}
		Set<Integer>set=new HashSet<>();
		ListNode pre=head;
		ListNode preTmp=null;
		System.out.println("初始pre:"+pre.toString());
		do{ 
			int val=head.val;//
			if(set.contains(val)){
				System.out.println("当前val:"+val+" set包含:"+set.contains(val));
				System.out.println("当前preTmp:"+preTmp.val);
				preTmp.next=head;
				head=head.next;
			}else{
				System.out.println("当前val:"+val+" set包含:"+set.contains(val));
				set.add(val);
				System.out.println("将"+val+"存入set");
				preTmp=pre;
				System.out.println("当前preTmp:"+preTmp.val);
				pre=head;
//				System.out.println("当前pre:"+pre.val);
				head=head.next;//正常循环
				System.out.println(pre.equals(head));
				
			}
			System.out.println("===============");
		}while(head.next!=null);
		return null;
	}

	public static boolean hasExist(Set<Integer> set,int num){
		return set.contains(num);
	}
	public static void main(String[] args) {
		ListNode node = initData();
		showData(node);
		deleteDuplicates(node);
		showData(node);
	}
	

	private static void showData(ListNode node) {
		while(node.next!=null){
			System.out.println(node.val);
			node=node.next;
		}
		System.out.println(node.val);
		System.out.println("==========当前data===========");
	}

	public  static ListNode initData(){
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(3);
		ListNode node5=new ListNode(5);
		
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=null;
		
//		node2.next=node3.next;
		return node1;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
