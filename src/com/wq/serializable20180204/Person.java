package com.wq.serializable20180204;

import java.io.Serializable;

/**
 * Created by wuqingvika on 2018/2/4.
 */
public class Person implements Serializable{
    private transient int age;
    private String name;
    private transient String address;//transient让字段不序列化 如果是数字 为0 其他为Null
// 加了transient 后 Person{age=0, name='wuqingvika', address='null'} 输出结果
    public Person(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
