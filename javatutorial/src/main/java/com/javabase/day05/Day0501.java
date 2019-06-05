/***********************************************
 * File Name: Day0501
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 13:32
 ***********************************************/

package com.javabase.day05;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class Day0501 {
    private static int size=10;
    public static void main(String[] args) {
        int[] a = getRandom();
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));
        int targetNum=new Scanner(System.in).nextInt();

        int index = chazhao(a,targetNum);
        System.out.println(index);
    }

    private static int chazhao(int[] a, int targetNum) {
       int low=0;
       int high=a.length-1;
       int mid;
       while (low<=high){
           mid=(low+high)/2;
           if (a[mid]==targetNum){
               return mid;
           }else if (a[mid]>targetNum){
               high=mid-1;
           }else if (a[mid]<targetNum){
               low=mid+1;
           }

       }
       return -1;
    }


    private static void sort(int[] a) {
        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length- i-1;j++){
                if (a[j]>a[j+1]){
                    a[j]=a[j]+a[j+1];
                    a[j+1]=a[j]-a[j+1];
                    a[j]=a[j]-a[j+1];
                }
                System.out.println(Arrays.toString(a));

            }
        }
    }

    private static int[] getRandom() {
        int[] a=new int[size];
        for (int i=0;i<size;i++){
            a[i]=new SecureRandom().nextInt(100);
        }
        return a;
    }
}
