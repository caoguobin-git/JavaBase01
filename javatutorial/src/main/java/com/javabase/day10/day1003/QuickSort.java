/***********************************************
 * File Name: QuickSort
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 04 06 2019 9:15
 ***********************************************/

package com.javabase.day10.day1003;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = getRandomIntArray();
        System.out.println(Arrays.toString(a));
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

    }

    private static void quickSort(int[] a, int left, int right) {
        int temp=a[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (a[j]>temp){
                j--;
            }
            while (a[i]<temp){
                i++;
            }
            if (i<j){
                a[i]=a[i]+a[j];
                a[j]=a[i]-a[j];
                a[i]=a[i]-a[j];
            }
        }


    }


    private static int[] getRandomIntArray() {
        int[] a = new int[10];
        for (int i = 0; i < 9; i++) {
            a[i] = new Random().nextInt(100);
        }
        return a;
    }
}
