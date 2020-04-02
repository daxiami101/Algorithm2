package com.daxiami101.leetcode.triangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Triangle {
    public static int minimumTotal(List<List<Integer>> triangle) {
        return getMinSum(0, 0,triangle);
    }
    public static int getMinSum(int i,int j,List<List<Integer>> triangle){
    	int num = triangle.get(i).get(j);
    	System.out.print(num);
    	int row = triangle.size();//ĞĞÊı
    	if(i==row-1 || i<j){
    		return num;
    	}
    	int min = Math.min(getMinSum(i+1, j, triangle), getMinSum(i+1, j+1,triangle));
    	return num+min;
    }
    public static void main(String[] args) {

    	System.out.println(initData());
    	List<List<Integer>> triangle = initData();
    	System.out.println("result:"+minimumTotal(triangle));;
	}
    public static List<List<Integer>> initData(){
    	List<List<Integer>>triangle=new ArrayList<>();
    	List<Integer>list1=new ArrayList<>();
    	list1.add(2);
    	triangle.add(list1);
    	
    	List<Integer>list2=new ArrayList<>();
    	list2.add(3);
    	list2.add(4);
    	triangle.add(list2);
    	
    	List<Integer>list3=new ArrayList<>();
    	list3.add(6);
    	list3.add(5);
    	list3.add(7);
    	triangle.add(list3);
    	
    	List<Integer>list4=new ArrayList<>();
    	list4.add(4);
    	list4.add(1);
    	list4.add(8);
    	list4.add(3);
    	triangle.add(list4);
    	return triangle;
    }
}
