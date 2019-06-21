/***********************************************
 * File Name: Course
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 21 06 2019 10:47
 ***********************************************/

package com.programming.chapter10.program;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private String[] students=new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {

        return courseName;
    }

    public void addStudent(String student){
        students[numberOfStudents]=student;
        numberOfStudents++;
    }

    public void dropStudent(String student){
        //Left as an exercise in Programming Exercise 10.9
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
