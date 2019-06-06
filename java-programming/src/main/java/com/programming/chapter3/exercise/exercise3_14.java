
package com.programming.chapter3.exercise;

import java.util.Scanner;

public class exercise3_14 {

    public static void main(String[] args) {
        int random = Math.random() > 0.5 ? 1 : 0;
        Scanner scanner=new Scanner(System.in);
        if (scanner.nextInt()==random){
            System.out.println("right");
        }else {
            System.out.println("wrong");
        }
    }
}
