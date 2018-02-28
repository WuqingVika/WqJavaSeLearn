package com.wq.socket20180227;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 * Created by wuqingvika on 2018/2/27.
 */
public class Server {
    public static void main(String[] args) {
        try {
            //创建ServerSocket对象 9999为绑定的端口号
            ServerSocket server=new ServerSocket(9999);
            //server.accept();如果未接收到客户端请求会处于堵塞状态，即不会向下执行
            while (true){
                Socket client = server.accept();
                System.out.println("test");
                if(client!=null){
                    System.out.println("客户端连接上来了");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
