package com.wq.thread20180204;

/**
 * Created by wuqingvika on 2018/2/23.
 */
public class ConnectThreadB extends Thread {
    private Object object;

    public ConnectThreadB(String name, Object object){
        super(name);
        this.object=object;
    }
    public void run() {
        synchronized (object) {
            for (int i = 0; i < 10; i++) {
                System.out.println(getName() + "  " + i);
                try {
                    if (i == 3) {
                        //object.notify();//随机选取一个
                        object.notifyAll();//唤醒等待的所有线程
                    }
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
