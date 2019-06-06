
package com.programming.chapter3.exercise;

public class exercise3_16 {

    public static void main(String[] args) {
        double x = (Math.random() > 0.5 ? 1 : -1) * Math.random() * 50;
        double y = (Math.random() > 0.5 ? 1 : -1) * Math.random() * 100;
        System.out.println("the random point is : "+x+"  "+y);
    }
}
