/***********************************************
 * File Name: DisplayTime
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 11:19
 ***********************************************/

package com.programming.chapter2.program;

import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.print("Enter an integer for seconds: ");
        int seconds=scanner.nextInt();

        int minutes=seconds/60;
        int remainingSeconds=seconds%60;

        System.out.println(seconds+" seconds is "+minutes+" minutes and "+remainingSeconds+" seconds");
    }
}
