package com.wq.thread20180204;

/**
 * 抢占式线程学习、设置优先级
 * Created by wuqingvika on 2018/2/22.
 */
public class Demo03 {
    public static void main(String[] args) {
        Mythread02 wq1=new Mythread02();
        Mythread02 wq2=new Mythread02();
        Mythread02 wq3=new Mythread02();
        Mythread02 wq4=new Mythread02();
        //1.抢占式学习
        /*wq1.start();
        wq2.start();
        wq3.start();
        wq4.start();*/

        //2.设置优先级 不能放在start之后
        wq4.setPriority(Thread.MAX_PRIORITY);//设置最高优先级
        wq1.setPriority(Thread.MIN_PRIORITY);//最低

        wq1.start();
        wq2.start();
        wq3.start();
        wq4.start();
    }
}
