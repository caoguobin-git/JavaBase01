/***********************************************
 * File Name: AnalyzeNumbers
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 20 06 2019 15:03
 ***********************************************/

package com.programming.chapter7.program;

import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();

        double[] array=new double[size];
        double sum=0;
        for (int i=0;i<size;i++){
            double ele=Math.random()*100;
            sum+=ele;
            array[i]=ele;
        }

        double avg=sum/size;
        for (double v : array) {
            if (v>avg){
                System.out.print(v+"  ");
            }
        }
    }
}
