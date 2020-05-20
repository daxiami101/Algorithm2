package com.daxiami101.basic.proxy.staticProxy;

import java.util.Date;

public class UserServiceProxy implements UserService {
    private UserService target; // ������Ķ���

    public UserServiceProxy(UserService target) {
        this.target = target;
    }
    public void select() {
        before();
        target.select();    // �����ʵ�ʵ�����ʵ�����ɫ�ķ���
        after();
    }
    public void update() {
        before();
        target.update();    // �����ʵ�ʵ�����ʵ�����ɫ�ķ���
        after();
    }

    private void before() {     // ��ִ�з���֮ǰִ��
        System.out.println(String.format("log start time [%s] ", new Date()));
    }
    private void after() {      // ��ִ�з���֮��ִ��
        System.out.println(String.format("log end time [%s] ", new Date()));
    }
}

