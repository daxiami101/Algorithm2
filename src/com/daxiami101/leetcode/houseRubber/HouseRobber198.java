package com.daxiami101.leetcode.houseRubber;

public class HouseRobber198 {
	public static int rob(int[] nums) {
		int length=nums.length;
		
		if(length==0){
			return 0;
		}else if(length==1){
			return nums[0];
		}
		int result[] =new int[length];
		result[0]=nums[0];
		result[1]=nums[1]>nums[0]?nums[1]:nums[0];
		for(int i=2;i<length;i++){
			result[i]=Math.max(result[i-2]+nums[i], result[i-1]);
		}
		return result[length-1];
	}

	public static void main(String[] args) {
		int[] nums={ 2,7,9,3,1};
		System.out.println(rob(nums));
	}
}
