/***********************************************
 * File Name: Exercise11_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 21 06 2019 17:23
 ***********************************************/

package com.programming.chapter11.exercise;

import java.util.ArrayList;
import java.util.Random;

public class Exercise11_14 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>();

        initList(list1);
        initList(list2);
        System.out.println(list1);
        System.out.println(list2);
        ArrayList<Integer>list=addAll(list1,list2);
        System.out.println(list);
    }

    private static ArrayList<Integer> addAll(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i=0;i<list1.size();i++){
            arrayList.add(list1.get(i));
        }
        for (int i=0;i<list2.size();i++){
            arrayList.add(list2.get(i));
        }
        return arrayList;
    }

    private static void initList(ArrayList<Integer> list) {
        Random random=new Random();
        int size = random.nextInt(5) + 5;
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }
    }
}
