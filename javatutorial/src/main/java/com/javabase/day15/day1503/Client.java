/***********************************************
 * File Name: Client
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 04 06 2019 12:32
 ***********************************************/

package com.javabase.day15.day1503;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Test test=new Test();
        Class<? extends Test> aClass = test.getClass();
        Constructor<? extends Test> constructor = aClass.getConstructor(String.class);
        Test test1 = constructor.newInstance("hello");
        System.out.println(test1.getName());
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        Object o = name.get(test1);
        System.out.println(o);

    }
    static class Test{
        private String name;
        public Test() {
        }

        public Test(String name) {
            this.name = name;
        }

        public String getName(){
            return name;
        }
    }
}
