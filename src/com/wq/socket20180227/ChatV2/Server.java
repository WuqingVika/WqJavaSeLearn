package com.wq.socket20180227.ChatV2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 服务端-交互
 * Created by wuqingvika on 2018/2/28.
 */
public class Server {
    public static void main(String[] args) {
        try {
            //创建ServerSocket对象 9999为绑定的端口号
            ServerSocket server=new ServerSocket(9999);
            //server.accept();如果未接收到客户端请求会处于堵塞状态，即不会向下执行
            while (true){
                Socket client = server.accept();
                System.out.println("来自"+client.getInetAddress().getHostAddress()+"的客户端已经连接成功");
                if(client!=null){
                   new WriterThread("服务端",client);
                   new ReaderThread("服务端",client);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
