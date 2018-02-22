package com.wq.thread20180204;

/**
 * Created by wuqingvika on 2018/2/22.
 */
public class Demo07Synchronize {
    public static void main(String[] args) {
        SynchronizeRunnable runnable=new SynchronizeRunnable();
        Thread wq1=new Thread(runnable);
        wq1.setName("吴庆");
        Thread wq2=new Thread(runnable);
        wq2.setName("吴庆的男朋友");
        wq1.start();
        wq2.start();

    }
}
