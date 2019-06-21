/***********************************************
 * File Name: PrimeNumber
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 13 06 2019 11:10
 ***********************************************/

package com.programming.chapter5.program;

public class PrimeNumber {
    public static void main(String[] args) {
        int count=0;
        int lineCount=0;
        int a=2;
        while (count<50){
            if (judgePrime(a)){
                System.out.printf("%6d", a);
                count++;
                lineCount++;
                if (lineCount%10==0){
                    System.out.println();
                }
            }
            a++;
        }
    }

    private static boolean judgePrime(int a) {
        int max= (int) Math.sqrt(a);
        for (int i=2;i<max+1;i++){
            if (a%i==0){
                return false;
            }
        }
        return true;
    }
}
