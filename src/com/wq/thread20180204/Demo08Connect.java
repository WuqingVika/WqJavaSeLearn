package com.wq.thread20180204;

/**
 * 线程通信
 * Created by wuqingvika on 2018/2/23.
 */
public class Demo08Connect {
    public static void main(String[] args) {
        Object obj=new Object();
        ConnectThreadA wqA=new ConnectThreadA("wqA",obj);
        ConnectThreadA wqC=new ConnectThreadA("wqC",obj);//这里C wait()以后没人notify它了 所以只会打印到5
        ConnectThreadB wqB=new ConnectThreadB("wqB",obj);//一定要同一个obj对象
        wqA.start();
        wqC.start();
        wqB.start();
    }
}
