package com.aijiao.test;

public class JNIDemo {
    
    public native void testHello();
    
    public static void main(String[] args){
        System.loadLibrary("TestJNI");
        JNIDemo jniDemo = new JNIDemo();
        jniDemo.testHello();
    }
}