package com.daxiami101.leetcode.MergeSortedArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<m;i++){
        	list.add(nums1[i]);
        }
        for(int i=0;i<n;i++){
        	list.add(nums2[i]);
        }
        Collections.sort(list);
       
        for(int i=0;i<m+n;i++){
        	nums1[i]=
        			list.get(i);
        }
       
    }
    
    public static void main(String[] args) {
    	int []nums1 = {1,2,3,0,0,0};
    	int m = 3;
    	int []nums2 = {2,5,6};
    	int n = 3;
    	merge(nums1, m, nums2, n);
	}
    public static void show(int[] num){
    	int length = num.length;
    	for(int i=0;i<length;i++){
    		System.out.println(num[i]);
    	}
    }
}