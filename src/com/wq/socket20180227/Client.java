package com.wq.socket20180227;

import java.io.IOException;
import java.net.Socket;

/**
 * 客户端
 * Created by wuqingvika on 2018/2/27.
 */
public class Client {
    public static void main(String[] args) {
        try {
            //创建客户端对象 并且连接到指定的服务器上 如果IP地址不对 没连接成功未抛出超时异常timeout
            Socket socket=new Socket("127.0.0.1",9999);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
