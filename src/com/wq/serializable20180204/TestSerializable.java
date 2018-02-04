package com.wq.serializable20180204;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by wuqingvika on 2018/2/4.
 */
public class TestSerializable {
    public static void main(String[] args) throws Exception {
        Person person=new Person(23,"wuqingvika","shanghai");
        savePerson(person);
        Person person1=loadPerson();
        System.out.println(person1);

        User wq=new User(18,"wq","bj");
        saveUser(wq);
       User wq2=loadUser();
        System.out.println(wq2);
    }

    public static void savePerson(Person person) throws Exception{
        //将person保存到本地磁盘上。
        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("D:/test/wuqingvika0204.dat"));
        oos.writeObject(person);
        oos.close();
    }

    public static Person loadPerson() throws Exception{
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:/test/wuqingvika0204.dat"));
        Person person=(Person)ois.readObject();
        ois.close();
        return person;
    }
    public static void saveUser(User user) throws Exception{
        //将person保存到本地磁盘上。
        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("D:/test/wuqing0204.dat"));
        oos.writeObject(user);
        oos.close();
    }

    public static User loadUser() throws Exception{
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:/test/wuqing0204.dat"));
        User user=(User) ois.readObject();
        ois.close();
        return user;
    }

}
