/***********************************************
 * File Name: Exercise11_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 21 06 2019 17:23
 ***********************************************/

package com.programming.chapter11.exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise11_9 {
    public static void main(String[] args) {
        int[][] index = new int[5][5];
        initIndex(index);
        System.out.println(Arrays.toString(index[0]));
        System.out.println(Arrays.toString(index[1]));
        System.out.println(Arrays.toString(index[2]));
        System.out.println(Arrays.toString(index[3]));
        System.out.println(Arrays.toString(index[4]));
        System.out.println();
        ArrayList[] count = countRow(index);
        System.out.println(count[0]);
        System.out.println(count[1]);
    }


    private static ArrayList[] countRow(int[][] index) {
        ArrayList<Integer> listRow = new ArrayList<>();
        ArrayList<Integer> listCol = new ArrayList<>();
        ArrayList[] list=new ArrayList[2];
        for (int i = 0; i < index.length; i++) {
            int sumRow=0;
            int sumCol=0;
            for (int j=0;j<index[i].length;j++){
                if (index[i][j]==1){
                    sumRow++;
                }
                if (index[j][i]==1){
                    sumCol++;
                }
            }
            listRow.add(sumRow);
            listCol.add(sumCol);
        }
        list[0]=listRow;
        list[1]=listCol;
        return list;
    }

    private static void initIndex(int[][] index) {
        for (int i = 0; i < index.length; i++) {
            for (int j = 0; j < index[0].length; j++) {
                index[i][j] = (Math.random() < 0.5 ? 0 : 1);
            }
        }
    }
}
