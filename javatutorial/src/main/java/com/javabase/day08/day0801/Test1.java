/***********************************************
 * File Name: Test1
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 17:50
 ***********************************************/

package com.javabase.day08.day0801;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Transform transform = new Transform();

        Weapon weapon = null;
        while (true) {
            new Scanner(System.in).nextLine();
            int a = new Random().nextInt(4);
            switch (a) {
                case 0:
                    weapon=new Sword();
                    break;

                case 1:
                    weapon=new Gun();
                    break;

                case 2:
                    weapon=new Nuclear();
                    break;

                case 3:
                    transform.setWeapon(null);
                    break;
            }
            transform.setWeapon(weapon);
            transform.attack();

        }
    }
}
