package com.wq.filetest20171223;

import java.io.File;

/**
 * 1-2文件列表展示
 * Created by wuqingvika on 2017/12/23.
 */
public class FileList {
    private static int initTab=0;
    public static void main(String args[]){
        File file=new File("D:\\shabi\\XMgong01\\bin");
        initTab=getTabCount(file);//初始化得到第一个文件的tab数量
        showFile(file);
    }

    private static void showFile(File file){
        printTab(getTabCount(file));
        System.out.println(file.getName());
        if(file.isDirectory()){
            //如果你是一个文件夹的话 遍历下面的子文件夹
            File[] childFiles = file.listFiles();
            for(int i=0;i<childFiles.length;i++){
                showFile(childFiles[i]);
            }
        }
    }

    private static void printTab(int tabCount){
        //我们这里有一个斜杠打一个占位符
        for(int i=0;i<tabCount-initTab;i++){//减掉一开始多的tab使其靠左对齐
            System.out.print("\t");
        }
    }

    private static int getTabCount(File file){
        return file.getAbsolutePath().split("\\\\").length;//四个反斜杠代表一个
    }
}
