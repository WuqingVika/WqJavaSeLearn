package com.wq.thread20180204;

/**
 * Created by wuqingvika on 2018/2/10.
 *  要想线程让步：（必须满足下面两个条件）
 * 1.存在另外的线程优先级大于等于我
 * 2.另外的线程处于就绪状态
 */
public class Demo05Yield {
    public static void main(String[] args) {
        YieldThread wqA=new YieldThread("wqA");//创建一个线程对象 新建状态
        YieldThread wqB=new YieldThread("wqB");
        wqB.setPriority(Thread.MIN_PRIORITY);//测试另外线程优先级 小于让步的
        wqA.start();
        wqB.start();
    }
}
