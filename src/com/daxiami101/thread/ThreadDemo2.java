package com.daxiami101.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class ThreadDemo2 {
	public static void main(String[] args) {
       
        // 二：通过 JMX 可以通过线程 ID 获得线程信息
        ThreadMXBean tmx = ManagementFactory.getThreadMXBean();
        ThreadInfo info = tmx.getThreadInfo(10);
//        System.out.println(info.getThreadState());
        for(Long l: tmx.getAllThreadIds()){
        	System.out.println(l);
        }
        
//        s.interrupt();
    }

}
