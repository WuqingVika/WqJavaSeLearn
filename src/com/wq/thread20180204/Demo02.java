package com.wq.thread20180204;

/**
 * Created by wuqingvika on 2018/2/10.
 */
public class Demo02 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            System.out.println(Thread.currentThread().getName()+"----------" + i);
        }
        MyRunnable myRunnable=new MyRunnable();//创建一个MyRunnable对象 但它不是一个线程对象
        Thread thread=new Thread(myRunnable);//封装出一个线程对象
        thread.start();//启动thread线程
        /*Thread thread2=new Thread(myRunnable);
        thread2.start();*///int i放在 myrunnable外面 第二个线程是执行的，只不过是共享资源i导致进去 i已经超过循环值了。
    }
}
