/***********************************************
 * File Name: Student
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 14:59
 ***********************************************/

package com.javabase.day06.day0604;

public class Student {
    int id;
    String name;
    String gender;
    int age;

    public Student(int id, String name) {
        this(id,name,null);
    }

    public Student(int id, String name, String gender) {
        this(id,name,gender,0);
    }

    public Student(int id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"gender\":\"")
                .append(gender).append('\"');
        sb.append(",\"age\":")
                .append(age);
        sb.append('}');
        return sb.toString();
    }
}
