/***********************************************
 * File Name: Exercise7_23
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 20 06 2019 16:38
 ***********************************************/

package com.programming.chapter7.exercise;


import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_32 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        for (int i=0;i<n;i++){
            array[i]=scanner.nextInt();
        }
        partition(array);
        System.out.println(Arrays.toString(array));
    }

    private static void partition(int[] array) {
        int temp=array[0];
        int index=0;
        for (int i=1,j=array.length-1;i<=j;i++,j--){
            while (array[i]<temp){
                i++;
            }
            while (array[j]>temp){
                j--;
            }
            int temp1=array[i];
            array[i]=array[j];
            array[j]=temp1;
            index=i;
        }
        array[0]=array[index];
        array[index]=temp;

    }
}
