package com.wq.socket20180227.UdpSocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * 客户端
 * Created by wuqingvika on 2018/3/1.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket client =new DatagramSocket();
        String str="Hello ,I'm client called wuqingvika!";
        byte[] bytes=str.getBytes();
        DatagramPacket packet=new DatagramPacket(bytes,0,bytes.length,InetAddress.getByName("127.0.0.1"),6666);
        client.send(packet);
    }

}
