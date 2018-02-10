package com.wq.thread20180204;

/**
 * Created by wuqingvika on 2018/2/10.
 */
public class MyRunnable implements Runnable {
    int i=1;
    @Override
    public void run() {
        for (; i < 9; i++) {
            System.out.println(Thread.currentThread().getName()+"----------" + i);
        }
    }
}
