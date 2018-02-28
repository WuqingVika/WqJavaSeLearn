package com.wq.socket20180227.Chat;

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
        Scanner input=new Scanner(System.in);
        try {
            //创建ServerSocket对象 9999为绑定的端口号
            ServerSocket server=new ServerSocket(9999);
            //server.accept();如果未接收到客户端请求会处于堵塞状态，即不会向下执行
            while (true){
                Socket client = server.accept();
                System.out.println("来自"+client.getInetAddress().getHostAddress()+"的客户端已经连接成功");
                if(client!=null){
                   //开始对话
                    OutputStream os = client.getOutputStream();
                    PrintWriter pw=new PrintWriter(new BufferedOutputStream(os));
                    System.out.println("我说:\t");
                    String serverMsg=input.nextLine();//接收一行
                    pw.println(serverMsg);
                    pw.flush();//刷新内存，将内存中的数据立刻写出。

                    InputStream is = client.getInputStream();
                    BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(is));
                    String msg=bufferedReader.readLine();
                    System.out.println("客户端说:" + msg);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
