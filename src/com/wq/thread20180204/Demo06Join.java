package com.wq.thread20180204;

/**
 * Created by wuqingvika on 2018/2/22.
 */
public class Demo06Join {
    public static void main(String[] args) {
        JoinThread jt=new JoinThread("wq1");
        jt.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " -----   " + i);
            if(i==1){
                try {
                    jt.join();//把jt线程加入进来，当前Main线程处于堵塞状态!!!直到参与进来的进程结束才执行当前进程
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
