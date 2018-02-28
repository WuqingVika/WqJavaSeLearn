package com.wq.socket20180227.Chat;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端
 * Created by wuqingvika on 2018/2/27.
 */
public class Client {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            //创建客户端对象 并且连接到指定的服务器上 如果IP地址不对 没连接成功未抛出超时异常timeout
            Socket client=new Socket("127.0.0.1",9999);
            InputStream is = client.getInputStream();
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(is));
            String msg=bufferedReader.readLine();
            System.out.println("服务器端说:" + msg);

            //向服务端发送消息
            System.out.println("我说:\t");
            String clientMsg=input.nextLine();//接收一行
            OutputStream os = client.getOutputStream();
            PrintWriter pw=new PrintWriter(new BufferedOutputStream(os));
            pw.println(clientMsg);
            pw.flush();//刷新内存，将内存中的数据立刻写出。
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
