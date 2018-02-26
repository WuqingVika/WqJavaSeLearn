package com.wq.thread20180204.productConsume;

/**
 * Created by wuqingvika on 2018/2/26.
 */
public class Test {
    public static void main(String[] args) {
        Container container=new Container();
        Producer producer=new Producer("武大郎",container);
        Producer producer2=new Producer("武大郎2",container);
    }
}
