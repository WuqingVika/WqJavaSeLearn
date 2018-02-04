package com.wq.serializable20180204;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Created by wuqingvika on 2018/2/4.
 */
public class User implements Externalizable{
    private int age;
    private String name;
    private String address;

    public User() {
    }

    public User(int age, String name, String address) {
        super();
        this.age = age;
        this.name = name;
        this.address = address;
    }

    /*   public User(int age, String name, String address) {
            super();
            this.age = age;
            this.name = name;
            this.address = address;
        }
    */
    @Override
    public String toString() {
        return "User{" +
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

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.getName());
        out.writeInt(this.getAge());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.setName((String)in.readObject());//这里位置不能颠倒
        this.setAge( in.readInt());

    }
}
