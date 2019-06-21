/***********************************************
 * File Name: TestCourse
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 21 06 2019 10:46
 ***********************************************/

package com.programming.chapter10.program;

import java.util.Arrays;

public class TestCourse {
    public static void main(String[] args) {
        Course course1=new Course("Data Structures");
        Course course2=new Course("Database Systems");
        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println(Arrays.toString(course1.getStudents()));
        System.out.println(Arrays.toString(course2.getStudents()));

        System.out.println(course1.getNumberOfStudents());
        System.out.println(course2.getNumberOfStudents());
    }
}
