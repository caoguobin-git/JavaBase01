/***********************************************
 * File Name: Exercise9_3
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 21 06 2019 9:35
 ***********************************************/

package com.programming.chapter9.exercise;

import java.util.Arrays;
import java.util.Random;

public class Exercise9_6 {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] array = new int[100000];
        Random random = new Random(41561);
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000000);
        }
        stopWatch.start();
        sort(array);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
        System.out.println(Arrays.toString(array));
        boolean result = judge(array);
        System.out.println(result);
    }

    private static boolean judge(int[] array) {
        boolean result =true;
        for (int i=0;i<array.length-1;i++){
            if (array[i]>array[i+1]){
                result=false;
            }
        }
        return  result;
    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = -1;
            int min = 100000000;

            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}
