package com.wq.filetest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 字节流
 * Created by wuqingvika on 2017/12/27.
 */
public class FileInputStreamDemo01 {
    public static void main(String args[]){
        InputStream is=null;
        try {
            is=new FileInputStream("d:/wq.txt");
            byte[] bytes=new byte[1024];
            int len=0;
            try {
                while ((len=is.read(bytes))!=-1){
                    System.out.print(new String(bytes,0,len));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if(is!=null){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
