package com.daxiami101.basic.proxy.dynamicProxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

public class LogHandler implements InvocationHandler {
    Object target;  // ������Ķ���ʵ�ʵķ���ִ����

    public LogHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);  // ���� target �� method ����
        after();
        return result;  // ���ط�����ִ�н��
    }
    // ����invoke����֮ǰִ��
    private void before() {
        System.out.println(String.format("log start time [%s] ", new Date()));
    }
    // ����invoke����֮��ִ��
    private void after() {
        System.out.println(String.format("log end time [%s] ", new Date()));
    }
}

