package com.daxiami101.basic.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.daxiami101.basic.proxy.staticProxy.UserService;
import com.daxiami101.basic.proxy.staticProxy.UserServiceImpl;

public class Client2 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        // ���ñ������Ա��涯̬�����࣬Ĭ�������� $Proxy0 ��ʽ����
        // System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        // 1. ����������Ķ���UserService�ӿڵ�ʵ����
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        // 2. ��ȡ��Ӧ�� ClassLoader
        ClassLoader classLoader = userServiceImpl.getClass().getClassLoader();
        // 3. ��ȡ���нӿڵ�Class�������UserServiceImplֻʵ����һ���ӿ�UserService��
        Class[] interfaces = userServiceImpl.getClass().getInterfaces();
        // 4. ����һ��������������ĵ��������������������еĴ�������ϵķ�������
        //     ���ﴴ������һ���Զ������־���������봫��ʵ�ʵ�ִ�ж��� userServiceImpl
        InvocationHandler logHandler = new LogHandler(userServiceImpl);
        /*
		   5.���������ṩ����Ϣ������������� ����������У�
               a.JDK��ͨ�����ݴ���Ĳ�����Ϣ��̬�����ڴ��д�����.class �ļ���ͬ���ֽ���
               b.Ȼ�������Ӧ���ֽ���ת���ɶ�Ӧ��class��
               c.Ȼ�����newInstance()��������ʵ��
		 */
        UserService proxy = (UserService) Proxy.newProxyInstance(classLoader, interfaces, logHandler);
        // ���ô���ķ���
        proxy.select();
        proxy.update();
        
        // ����JDK��̬�������ɵĴ����࣬��������Ϊ UserServiceProxy
        // ProxyUtils.generateClassFile(userServiceImpl.getClass(), "UserServiceProxy");
    }
}
