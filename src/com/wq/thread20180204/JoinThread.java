package com.wq.thread20180204;

/**
 * Created by wuqingvika on 2018/2/10.
 */
public class JoinThread extends Thread {
    public JoinThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"----------" + i);
            try {
                Thread.sleep(200);//毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
