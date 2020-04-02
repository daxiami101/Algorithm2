package com.daxiami101.leetcode.MergeTwoSortedLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1==null && l2!=null){
			return l2;
		}
		if(l2==null && l1!=null){
			return l1;
		}
		if(l1==null && l2==null){
			return null;
		}
		List<Integer> list = new ArrayList<>();
		while (l1 != null && l1.next != null) {
			list.add(l1.val);
			l1 = l1.next;
		}
		list.add(l1.val);
		while (l2 != null && l2.next != null) {
			list.add(l2.val);
			l2 = l2.next;
		}
		list.add(l2.val);
		Collections.sort(list);
		int size = list.size();
		System.out.println("size:"+size);
		System.out.println("========start=========");
		list.forEach(System.out::println);
		System.out.println("========end=========");
		
		ListNode head = new ListNode(list.get(0));
		ListNode preNode = null;
		for (int i = 0; i < size - 1; i++) {
			Integer val = list.get(i + 1);
			if (i == 0) {
				System.out.println("head:"+(i+1)+" val:"+val);
				head.next = new ListNode(val);
				preNode=head.next;
			} else {
				System.out.println("not head:"+(i+1)+" val:"+val);
				ListNode newNode = new ListNode(val);
				preNode.next = newNode;
				preNode=newNode;
			}
			System.out.println("=========================");
		}
		return head;
	}

	public static void show(ListNode node) {
		while (node != null && node.next != null) {
			System.out.println(node.val);
			node = node.next;
		}
		System.out.println(node.val);
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(6);
		ListNode node2 = new ListNode(7);
		ListNode node3 = new ListNode(8);
		ListNode node4 = new ListNode(9);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = null;

		ListNode node11 = new ListNode(2);
		ListNode node21 = new ListNode(3);
		ListNode node31 = new ListNode(4);
		ListNode node41 = new ListNode(5);

		node11.next = node21;
		node21.next = node31;
		node31.next = node41;
		node41.next = null;
		System.out.println("=======node1========");
		show(node1);
		System.out.println("=======node11========");
		show(node11);

		ListNode head = mergeTwoLists(node1, node11);
		System.out.println("=======head========");
		show(head);
	}
}
