package com.wq.thread20180204;

/**
 * Created by wuqingvika on 2018/2/10.
 */
public class Mythread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 9; i++) {
            System.out.println(Thread.currentThread().getName()+"----------" + i);
        }
    }
}
