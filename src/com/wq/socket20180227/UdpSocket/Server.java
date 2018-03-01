package com.wq.socket20180227.UdpSocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by wuqingvika on 2018/3/1.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket=new DatagramSocket(6666);//绑定指定本机ip,并指定端口为6666

        byte[] bytes=new byte[1024];//相当于小容器接收数据
        DatagramPacket packet=new DatagramPacket(bytes,1024);
        socket.receive(packet);//只有获取到数据才会往下执行，不然会堵塞
        byte[] data = packet.getData();
        String msg=new String(data,0,packet.getLength());
        System.out.println("服务端接收到的消息:" + msg);
    }

}
