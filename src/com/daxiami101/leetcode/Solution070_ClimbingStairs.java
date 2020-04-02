package com.daxiami101.leetcode;

public class Solution070_ClimbingStairs {
	public static int climbStairs(int n) {
		if (n < 2) {
			return n;
		} else {
			return climbStairs(n - 1) + climbStairs(n - 2);
		}
	}

	public static void main(String[] args) {
		System.out.println(climbStairs(2));
	}
}
