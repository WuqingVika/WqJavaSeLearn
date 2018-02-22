package com.wq.thread20180204;

/**
 * 线程让步 yield是多线程的静态方法
 * Created by wuqingvika on 2018/2/22.
 */
public class YieldThread extends Thread{
    public YieldThread(String name){
        super(name);
    }
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"----------" + i);
            if(i==5&&"wqA".equals(Thread.currentThread().getName())){
                Thread.yield();//等于Thread.yield();
            }
        }
    }
}
