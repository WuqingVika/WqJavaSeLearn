package com.wq.thread20180204.productConsume;

/**
 * 生产者
 * Created by wuqingvika on 2018/2/26.
 */
public class Producer extends Thread{
    private Container container;
    public Producer(String name,Container container){
        super(name);
        this.container=container;
        start();//直接在new时 start省得在test写了哈哈
    }

    @Override
    public void run() {
        while (true){
            try {
                container.push();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
