
package com.programming.chapter3.exercise;

import java.util.Scanner;

public class exercise3_9 {

    public static void main(String[] args) {
        String result ="";
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<9;i++){
            int inputNum=scanner.nextInt();
            result+=inputNum;
            sum+=inputNum*(i+1);
        }
        if (sum%11==10){
            result+="X";
        }else {
            result+=sum%11;
        }
        System.out.println(result);
    }
}
