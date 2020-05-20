package com.daxiami101.basic.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DemoMain {
    public static void main(String[] args) {
		InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method);
                if (method.getName().equals("morning")) {
                    System.out.println("Good morning, " + args[0]);
                }
                return null;
            }
        };
        Hello hello = (Hello) Proxy.newProxyInstance(
        		Hello.class.getClassLoader(), // ����ClassLoader
            new Class[] { Hello.class }, // ����Ҫʵ�ֵĽӿ�
            handler); // ���봦����÷�����InvocationHandler
        hello.morning("Bob");
    }
}

interface Hello {
    void morning(String name);
}

class HelloImpl implements Hello{

	@Override
	public void morning(String name) {
		// TODO Auto-generated method stub
		System.out.println("=================good night");
	}
	
}
