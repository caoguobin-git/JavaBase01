/***********************************************
 * File Name: Test
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 15:14
 ***********************************************/

package com.javabase.day06.day0605;

public class Test {
    public static void main(String[] args) {
        Person p=new Person("张三","男",22);
        Student student=new Student();
        Employee employee=new Employee();
        student.name="李希";
        student.gender="女";
        student.age=21;
        student.school="hahahah";
        employee.salary=1111;
        System.out.println(student);
        System.out.println(employee);
    }
}
