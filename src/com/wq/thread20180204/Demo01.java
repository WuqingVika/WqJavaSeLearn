package com.wq.thread20180204;

/**
 * Created by wuqingvika on 2018/2/10.
 */
public class Demo01 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            System.out.println(Thread.currentThread().getName()+"----------" + i);
        }
        Mythread mythread=new Mythread();//创建一个线程对象 新建状态
        mythread.start();//就绪状态 调用start它不是立即启动了 是根据CPU时间什么时候分配才。。
    }
}
