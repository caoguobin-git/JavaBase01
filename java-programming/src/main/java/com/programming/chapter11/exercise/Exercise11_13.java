/***********************************************
 * File Name: Exercise11_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 21 06 2019 17:23
 ***********************************************/

package com.programming.chapter11.exercise;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise11_13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int value;
        while ((value=scanner.nextInt())!=0){
            list.add(value);
        }
        removeDuplicate(list);
        System.out.println(list);
    }
    public static void removeDuplicate(ArrayList<Integer> list){
        ArrayList<Integer> newList=new ArrayList<>();
        for (int i=0;i<list.size();i++){
            if (!newList.contains(list.get(i))){
                newList.add(list.get(i));
            }
        }
        System.out.println(newList);
    }

}
