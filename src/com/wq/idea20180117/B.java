package com.wq.idea20180117;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 测试模板
 * Created by wuqingvika on 2018/1/17.
 */
public class B {
    public static final int WQ=2;
    public static final String wq2="2";
    public static final String WUQINGVIKA = "wuqingvika";
    public void fb(){
        System.out.println("wq--B");
    }

    public void sayhell0(){
        System.out.println("hello wuqingvika");
    }

    public static void main(String[] args) {
        int x=50;
        for (int i = 0; i < x; i++) {//敲下100.fori自动生成
            System.out.println(new Date());//按下new Date().sout
        }
        System.out.println(args[0]);

    }
    private final String name;
    public B(String name){
        this.name = getFullName(null, 0, null, name);//这行原本不存在的，输入name.field后自动补充不存在的字段
    }
    public String testReturn(){
        return WUQINGVIKA;//只需要敲下"wuqingvika".return即可。
    }
    public void testNn(String name){
        if (name != null) {//只需要敲下name.nn即可。
            f1();//这里f1()方法一开始未创建，只需要按下alt+anter它会帮你创建。
        }
    }

    public void testListReplace(){
        List<String> a=new ArrayList();
        f2(a);
    }

    private void f2(List<String> list) {
        //为了演示效果我把旧的fori形式写下来
        /*for (int i = 0; i < list.size(); i++) {
            String item=list.get(i);
        }*/
        //光标移动到for处，按下alt+enter进行重构代码换成foreach如下：
        for (String item : list) {//list replace
        }
    }

    private void f1() {
        String name= WUQINGVIKA;
        int age =24;//哈哈暴露年龄真是蠢。
        System.out.println("name:" + name + "age:" + age);//旧格式
        System.out.printf("name:%sage:%d%n", name, age);//在字符串处按下alt+anter，选择replace with String.format()后
        String x="name:" + name + "age:" + age;//如果在变量中定义的
        String y= String.format("name:%sage:%d", name, age);//上一句中按下alt+anter后效果是酱紫的。
        String z= new StringBuilder().append("name:")
                .append(name).append("age:")
                .append(age).toString();//将x这种写法换成StringBuilder形式是酱紫的。
        String single = "single";
        getFullName(WUQINGVIKA,23, single, this.name);
    }

    public String getFullName(String name2, int age, String single, String name){
        return name;
    }
}
