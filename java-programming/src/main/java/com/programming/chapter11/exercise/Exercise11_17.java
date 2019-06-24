/***********************************************
 * File Name: Exercise11_1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 21 06 2019 17:23
 ***********************************************/

package com.programming.chapter11.exercise;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise11_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = scanner.nextInt();
        int result = display(n);
        System.out.println(result);

        File file=new File("e:/hello.txt");
    }

    private static int display(int n) {
        ArrayList<Integer> list = getParam(n);
        System.out.println(list);
        int sum=1;
        HashMap<Integer,Integer> resultMap=new HashMap<>();
        for (int i=0;i<list.size();i++){
            if (resultMap.get(list.get(i))==null){
                resultMap.put(list.get(i), 1);
            }else {
                resultMap.put(list.get(i), resultMap.get(list.get(i))+1);
            }
        }

        for (Map.Entry<Integer, Integer> entry:resultMap.entrySet()){
            if (entry.getValue()%2==1){
                sum*=entry.getKey();
            }
        }
        return sum;
    }

    private static ArrayList<Integer> getParam(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <=n; ) {
            if (n % i == 0) {
                list.add(i);
                n /= i;
                i = 2;
                continue;
            }
            i++;
        }
        return list;
    }
}
