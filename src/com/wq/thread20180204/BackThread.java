package com.wq.thread20180204;

/**
 * 后台线程
 * Created by wuqingvika on 2018/2/10.
 */
public class BackThread extends Thread {
    @Override
    public void run() {
        if("b".equals(Thread.currentThread().getName())){
            //如果是后台线程 那么进入死循环
            for(;;){
                System.out.println(Thread.currentThread().getName()+"----------后台线程" );
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }else{
            for (int i = 1; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+"----------" + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
