package com.wq.thread20180204;

/**
 * Created by wuqingvika on 2018/2/23.
 */
public class ConnectThreadA extends Thread {
    private Object object;

    public ConnectThreadA(String name,Object object){
        super(name);
        this.object=object;
    }
    public void run() {
        synchronized (object){
            for (int i = 0; i < 10; i++) {
                System.out.println(getName()+"  "+i);
                try {
                    if(i==5){
                        object.wait();//让持有obj的同步锁的对象处于阻塞状态 obj 一定是同步锁才行
                        //不然会报java.lang.IllegalMonitorStateException错误
                    }
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
