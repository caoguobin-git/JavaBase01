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
        Scanner input=new Scanner(System.in);
        int seconds=input.nextInt();
        int minutes=seconds/60;
        int remainingSeconds=seconds%60;
        System.out.println(minutes+":"+remainingSeconds);
    }
}
