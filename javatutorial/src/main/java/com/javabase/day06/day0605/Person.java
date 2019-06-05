/***********************************************
 * File Name: Person
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 15:11
 ***********************************************/

package com.javabase.day06.day0605;

public class Person {
    String name;
    String gender;
    int age;
    public Person(){

    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"gender\":\"")
                .append(gender).append('\"');
        sb.append(",\"age\":")
                .append(age);
        sb.append('}');
        return sb.toString();
    }
}
