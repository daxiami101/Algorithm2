package com.daxiami101.leetcode.triangle;

import java.util.ArrayList;
import java.util.List;

public class Triangle2 {
    public static int minimumTotal(List<List<Integer>> triangle) {
   	int length=triangle.size();
        if(length==0)return 0;
        if(length==1)return triangle.get(0).get(0);
        
        List<Integer> sum=triangle.get(length-1);
        for(int i=length-2;i>=0;i--)
        {
            for(int j=0;j<triangle.get(i).size();j++)
            {
                int sum1=triangle.get(i).get(j)+sum.get(j);
                int sum2=triangle.get(i).get(j)+sum.get(j+1);
                sum.set(j,Math.min(sum1,sum2));
                System.out.println(sum);
            }
        }
        
        
        return sum.get(0);

    }
    public static void main(String[] args) {
    	List<List<Integer>> initData = initData();
    	minimumTotal(initData);
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