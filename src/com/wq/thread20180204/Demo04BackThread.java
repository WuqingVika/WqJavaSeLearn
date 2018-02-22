package com.wq.thread20180204;

/**
 * Created by wuqingvika on 2018/2/22.
 */
public class Demo04BackThread {
    public static void main(String[] args) {
        BackThread wq1=new BackThread();
        wq1.setDaemon(true);//设置为后台线程
        wq1.setName("b");
        wq1.start();

        for (int i = 1; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"----------" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //主线程结束 后台线程 也会结束它的生命周期
    }
}
