package com.daxiami101.basic.proxy.dynamicProxy.exercise;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client2 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        // ���ñ������Ա��涯̬�����࣬Ĭ�������� $Proxy0 ��ʽ����
        // System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        // 1. ����������Ķ���UserService�ӿڵ�ʵ����
//       TimSayHello timSayHello = new TimSayHello();
       MikeSayHello timSayHello = new MikeSayHello();
        // 2. ��ȡ��Ӧ�� ClassLoader
        ClassLoader classLoader = timSayHello.getClass().getClassLoader();
        // 3. ��ȡ���нӿڵ�Class�������UserServiceImplֻʵ����һ���ӿ�UserService��
        Class[] interfaces = timSayHello.getClass().getInterfaces();
        // 4. ����һ��������������ĵ��������������������еĴ�������ϵķ�������
        //     ���ﴴ������һ���Զ������־���������봫��ʵ�ʵ�ִ�ж��� userServiceImpl
        InvocationHandler logHandler = new SayHandler(timSayHello);
        /*
		   5.���������ṩ����Ϣ������������� ����������У�
               a.JDK��ͨ�����ݴ���Ĳ�����Ϣ��̬�����ڴ��д�����.class �ļ���ͬ���ֽ���
               b.Ȼ�������Ӧ���ֽ���ת���ɶ�Ӧ��class��
               c.Ȼ�����newInstance()��������ʵ��
		 */
        SayHello proxy = (SayHello) Proxy.newProxyInstance(classLoader, interfaces, logHandler);
        // ���ô���ķ���
        proxy.say();
        
        // ����JDK��̬�������ɵĴ����࣬��������Ϊ UserServiceProxy
        // ProxyUtils.generateClassFile(userServiceImpl.getClass(), "UserServiceProxy");
    }
}
