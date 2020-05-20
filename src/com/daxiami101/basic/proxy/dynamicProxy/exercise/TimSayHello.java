package com.daxiami101.basic.proxy.dynamicProxy.exercise;

public class TimSayHello implements SayHello{

	@Override
	public void say() {
		System.out.println("tim hello");
	}
}
