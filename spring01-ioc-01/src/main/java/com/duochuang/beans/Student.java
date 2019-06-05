/***********************************************
 * File Name: Student
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 05 06 2019 16:39
 ***********************************************/

package com.duochuang.beans;

public class Student implements Person {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {
        System.out.println(name+"上交班费10元");
    }
}
