package com.daxiami101.syn;
import java.util.concurrent.CyclicBarrier;   

public class CyclicBarrierTest {   
        public static void main(String[] args) {   
                //����CyclicBarrier����  
                //������ִ����һ��5���̵߳Ĳ����������ִ��MainTask����  
                CyclicBarrier cb = new CyclicBarrier(5, new MainTask());   
                new SubTask("A", cb).start();   
                new SubTask("B", cb).start();   
                new SubTask("C", cb).start();   
                new SubTask("D", cb).start();   
                new SubTask("E", cb).start();  
        }   
}   


