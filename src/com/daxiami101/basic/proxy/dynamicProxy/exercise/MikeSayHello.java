package com.daxiami101.basic.proxy.dynamicProxy.exercise;

public class MikeSayHello implements SayHello{

	@Override
	public void say() {
		System.out.println("Mike hello");
	}
}
