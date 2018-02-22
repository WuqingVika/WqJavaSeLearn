package com.wq.thread20180204;

/**
 * Created by wuqingvika on 2018/2/10.
 */
public class Mythread02 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 9; i++) {
            System.out.println(Thread.currentThread().getName()+"----------" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
