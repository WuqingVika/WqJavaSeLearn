package com.wq.thread20180204.productConsume;

/**
 * Created by wuqingvika on 2018/2/26.
 * 放馒头的容器
 */
public class Container {
    private int count=0;//默认馒头数量为0

    //生产馒头
    public synchronized void push(){//同步方法所锁对的同步锁 就是当前的实例 Container
        this.notifyAll();//唤醒当前同步锁等待池中的所有线程对象（赶紧醒来吃东西或一起来造馒头咯）
        String name=Thread.currentThread().getName();//当前线程的名称
        while(count>=10){//注意：用while而不是if 万一被其他线程唤醒得先判断是否超出容量，超出继续wait()
            //假设容器默认容量为10
            try {
                System.out.println(name + " \t睡觉去咯");
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count++;
        System.out.println(name + "\t生产馒头" + count);

    }

}
