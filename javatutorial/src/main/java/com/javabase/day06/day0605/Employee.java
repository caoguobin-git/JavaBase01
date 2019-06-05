/***********************************************
 * File Name: Employee
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 15:13
 ***********************************************/

package com.javabase.day06.day0605;

public class Employee extends Person {
    double salary;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"salary\":")
                .append(salary);
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
