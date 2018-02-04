package com.wq.filetest20171223;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 输出流
 * Created by wuqingvika on 2017/12/27.
 */
public class FileInputStreamDemo02 {
    public static void main(String[] args){
        OutputStream os= null;//true代表下次运行输出会拼接原内容
        try {
            os = new FileOutputStream("d:/wq2.txt",true);
        String wq="hello  wuqingvika\r\nsee you";
            os.write(wq.getBytes());
            os.close();
         } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
