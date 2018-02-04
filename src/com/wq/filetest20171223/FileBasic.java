package com.wq.filetest20171223;

import java.io.File;
import java.io.IOException;

/**
 * 1-1 对文件基础的判断
 * 是否存在、是否是文件、是否是文件夹
 * 创建文件、创建文件夹
 * Created by wuqingvika on 2017/12/23.
 */
public class FileBasic {
    public static void main(String[] args) throws IOException{
        //1-1 判断文件是否存在
        //File file=new File("D:\\wuqing\\wq.txt");//路径写法1
        //File file=new File("D:/wuqing/wq4.txt");//路径写法2
       /* System.out.print(file.exists());
        //1-2 判断文件是否为一个文件
        System.out.print(file.isFile());
        //1-3.是否为一个文件夹
        System.out.print(file.isDirectory());
        //1-4.判断是否隐藏
        System.out.print(file.isHidden());*/
       //1-5.createNewFile/createTempFile
       /*if(!file.exists()){
           //如果不存在就创建
          file.createNewFile();
           //file.createTempFile("wuqingvika",".txt");//创建临时文件 在C盘
       }*/
       //1-6.mkdir / mkdirs
        File file=new File("D:\\wuqing\\wq1\\wq2.txt");
        if(!file.exists()){
            //仅创建文件夹
            file.mkdirs();//wq2.txt是文件夹
        }
    }
}
