/***********************************************
 * File Name: exercise1_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 10:32
 ***********************************************/

package com.programming.chapter1.exercise;

public class exercise1_11 {
    public static void main(String[] args) {
       double timeOfYear=365*24*60*60;
       long peopleCurrent=312032486;
       int bornOfYear= (int) (timeOfYear/7);
       int deathOfYear= (int) (timeOfYear/13);
       int comeOfYear= (int) (timeOfYear/45);
       for (int i=1;i<6;i++){
           System.out.println(peopleCurrent+(bornOfYear+comeOfYear-deathOfYear)*i);
       }

    }
}
