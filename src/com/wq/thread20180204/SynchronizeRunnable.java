package com.wq.thread20180204;

/**
 * Created by wuqingvika on 2018/2/22.
 */
public class SynchronizeRunnable implements Runnable{
    private int account=500;
    @Override
   /* public synchronized void run() {*///1.同步方法
    public  void run() {
        synchronized (this){//2.同步代码块
            String name = Thread.currentThread().getName();
            System.out.println(name + "准备付款...");
            if(account>300){
                Thread.yield();//让步
                System.out.println(name + "付款中...");
                account-=300;
                System.out.println(name+"账户余额:" + account);
            }else{
                System.out.println(name + "的账户，余额不足");
            }
        }
    }
}
