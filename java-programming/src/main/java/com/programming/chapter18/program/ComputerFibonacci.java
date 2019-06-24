/***********************************************
 * File Name: ComputerFibonacci
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 24 06 2019 16:43
 ***********************************************/

package com.programming.chapter18.program;



public class ComputerFibonacci implements Comparable{
    public static void main(String[] args) {
        for (int i=0;i<20;i++){
            System.out.printf("%-5d", fibonacci(i));
        }
    }

    private static long fibonacci(int index) {
        if (index==0||index==1){
            return 1;
        }
        return fibonacci(index-1)+fibonacci(index-2);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
