package com.daxiami101.basic.method;

public class RecursiveSum {
	public static void main(String[] args) {

		int N=13000;
		int[] num=new int[N];
		int sum=0;
		for(int i=0;i<N;i++){
			num[i]=i;
			sum+=num[i];
		}
		long start = System.currentTimeMillis();
		for(int i=0;i<N;i++){
			sum+=num[i];
		}
		long end = System.currentTimeMillis();
		System.out.println("方法1耗时:"+(end-start));
		
		long start1 = System.currentTimeMillis();
		sum(num,N);
		long end1 = System.currentTimeMillis();
		System.out.println("方法2耗时:"+(end1-start1));
	}

	public static int sum(int[] num, int N) {
		if(N!=0){
			return sum(num,N-1)+num[N-1];
		}
		return 0;

	}
}