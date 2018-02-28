package com.wq.socket20180227.ChatV3;

import java.io.IOException;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by wuqingvika on 2018/2/28.
 */
public class ServerScanThread extends Thread {
    public static List<Socket> socketList=new LinkedList<Socket>();//ArrayList适用于查询，LinkedList适用于修改比较频繁的情况
    public ServerScanThread(){
        //设置为后台线程
        setDaemon(true);
        start();
    }

    @Override
    public void run() {
        while (true){
            //1.扫描整个集合，如果当前集合是空的，那么睡觉去了
            while (socketList==null||socketList.size()<=0){
                System.out.println("没有socket我睡觉10s");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //2.走到这步说明有元素了，开始检测
            for (int i = 0; i < socketList.size(); i++) {
                Socket socket = socketList.get(i);
                //System.out.println("输入流是否关闭:"+socket.isInputShutdown());
                //System.out.println("输出流是否关闭:"+socket.isOutputShutdown());
                if(socket.isInputShutdown()&&socket.isOutputShutdown()){
                    //如果这个socket输入流输出流都关闭了则先移除
                    try {
                        System.out.println("某个socket被关闭了...");
                        socketList.remove(i);
                        socket.close();
                        i--;//这是为了防止跳过检测，但去掉这句话也无妨。因为它会一直扫描
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            try {
                Thread.sleep(5000);//检测完休息5秒;每隔5秒扫描一次
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
