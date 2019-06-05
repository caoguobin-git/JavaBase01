/***********************************************
 * File Name: StudentProxy
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 05 06 2019 16:39
 ***********************************************/

package com.duochuang.beans;

public class StudentProxy implements Person {
    private Student student;

    public StudentProxy(Person person) {
        if (person.getClass()==Student.class){
            this.student= (Student) person;
        }
    }

    @Override
    public void giveMoney() {

        student.giveMoney();
    }
}
