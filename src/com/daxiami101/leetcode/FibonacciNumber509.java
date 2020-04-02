package com.daxiami101.leetcode;

public class FibonacciNumber509 {
	public static int fib(int N) {
		double sqrt5 = Math.sqrt(5);
		double fibn = Math.pow((1 + sqrt5) / 2, N ) - Math.pow((1 - sqrt5) / 2, N );
		return (int) (fibn / sqrt5);
	}
	public static void main(String[] args) {
		System.out.println(fib(3));
	}

}
