/***********************************************
 * File Name: Exercise6_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 20 06 2019 11:34
 ***********************************************/

package com.programming.chapter6.exercise;

public class Exercise6_38 {
    public static void main(String[] args) {
        printLetters();
    }

    private static void printLetters() {
//        printCharacter();
//        printDigital();
    }

    private static char randomCharacter(char c1, char c2) {
        return (char) (c2+Math.random()*(c1-c2));
    }

}
