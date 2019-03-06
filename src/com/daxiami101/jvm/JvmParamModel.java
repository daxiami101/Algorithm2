package com.daxiami101.jvm;
/**
 * jvm内存参数打印
 * @author admin02
 * 2018年9月4日 下午2:41:43
 * TODO
 */
public class JvmParamModel {
	public static void printJMem(){
		System.out.println("最大可用内存maxMemory:"+Runtime.getRuntime().maxMemory()/1024/1024+"M");
		System.out.println("当前JVM空闲内存freeMemory:"+Runtime.getRuntime().freeMemory()/1024/1024+"M");
		System.out.println("当前JVM已使用的内存totalMemory:"+Runtime.getRuntime().totalMemory()/1024/1024+"M");
		System.out.println("JVM实际可用内存(maxMemory-totalMemory+freeMemory):"+(Runtime.getRuntime().maxMemory()
				-Runtime.getRuntime().totalMemory()
				+Runtime.getRuntime().freeMemory())/1024/1024+"M");
	}
}
