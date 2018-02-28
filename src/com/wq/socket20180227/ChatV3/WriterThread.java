package com.wq.socket20180227.ChatV3;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by wuqingvika on 2018/2/28.
 */
public class WriterThread extends Thread {
    private Socket socket;
    public WriterThread(String name,Socket socket){
        super(name);
        this.socket=socket;
        start();
    }

    @Override
    public void run() {
        Scanner input=new Scanner(System.in);
        OutputStream os = null;
        try {
            os = socket.getOutputStream();
            PrintWriter pw=new PrintWriter(new BufferedOutputStream(os));
            boolean flag=true;
            do{
                System.out.println("我说:\t");
                String msg=input.nextLine();//接收一行
                pw.println(msg);
                pw.flush();//刷新内存，将内存中的数据立刻写出。
                flag="byebye".equals(msg)?false:true;
            }while (flag);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.shutdownOutput();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
