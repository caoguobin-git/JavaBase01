
package com.programming.chapter3.exercise;

public class exercise3_4 {

    public static void main(String[] args) {
        String[] months={
                "January","February","March","April",
                "May","June","July","August","September",
                "October","November","December"};
        int a = (int) (Math.random() * 12);
        System.out.println(months[a]);
    }
}
