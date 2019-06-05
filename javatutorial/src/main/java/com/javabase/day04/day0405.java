/***********************************************
 * File Name: day0405
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 13:18
 ***********************************************/

package com.javabase.day04;

import java.lang.reflect.Array;
import java.util.*;

public class day0405 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        for (int i=0;i<33;i++){
            linkedList.add(i+1);
        }
        Integer[] result = getSix(linkedList);
        System.out.println(Arrays.toString(result));

    }

    private static Integer[] getSix(LinkedList<Integer> linkedList) {
        Integer[] result = new Integer[6];
        for (int i=0;i<6;i++){
            result[i]=getNum(linkedList);
        }
        return result;
    }

    private static Integer getNum(LinkedList<Integer> linkedList) {
        System.out.println(linkedList);
        return linkedList.remove(new Random().nextInt(linkedList.size()));
    }
}
