/***********************************************
 * File Name: Test01
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 16:50
 ***********************************************/

package com.javabase.day06.day0601;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("需要多少士兵");
        int num = new Scanner(System.in).nextInt();
        LinkedList<Soldier> linkedList = new LinkedList<>();
            for (int i = 0; i < num; i++) {
                Soldier soldier = new Soldier();
                soldier.id = i + 1;
                linkedList.add(soldier);
                System.out.println("当前数量：" + Soldier.count);
            }
            while (Soldier.count > 0) {
                for (int i=0;i<linkedList.size();i++){
                    Soldier soldier = linkedList.get(i);
                    soldier.attack();
                    if (soldier.blood<=0){
                        linkedList.remove(i);
                    }
                }
                System.out.println("剩余数量：" + Soldier.count);
            }

    }
}
