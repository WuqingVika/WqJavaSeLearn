package com.wq.socket20180227.ChatV2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * 读对方的消息
 * Created by wuqingvika on 2018/2/28.
 */
public class ReaderThread extends Thread {
    private Socket socket;
    public ReaderThread(String name,Socket socket){
        super(name);
        this.socket=socket;
        start();//把自己启动了
    }

    @Override
    public void run() {
        InputStream is = null;
        try {
            is = socket.getInputStream();
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(is));
           boolean flag=true;
           do{//一直监听对方说了啥玩意儿
               String msg=bufferedReader.readLine();
               System.out.println("对方说:" + msg);
               flag="byebye".equals(msg)?false:true;
           }while (flag);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.shutdownInput();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
