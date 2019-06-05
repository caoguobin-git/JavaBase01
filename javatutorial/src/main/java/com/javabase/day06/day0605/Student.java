/***********************************************
 * File Name: Student
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 15:12
 ***********************************************/

package com.javabase.day06.day0605;

public class Student extends Person {
    String school;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"school\":\"")
                .append(school).append('\"');
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
