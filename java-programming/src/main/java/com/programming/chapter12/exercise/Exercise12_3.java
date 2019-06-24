/***********************************************
 * File Name: Exercise12_3
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 24 06 2019 13:05
 ***********************************************/

package com.programming.chapter12.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise12_3 {
    public static void main(String[] args) {
        int[] array=new int[100];
        for (int i=0;i<100;i++){
            array[i]=new Random().nextInt(1000);
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the index: ");
        int index=scanner.nextInt();
        try {
            int result=array[index];
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
