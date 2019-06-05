/***********************************************
 * File Name: GuessGame
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 15:49
 ***********************************************/

package com.javabase.day07.day0703;

import java.util.Scanner;

public abstract class GuessGame {
    public void start(){
        String r =suiJi();
        tiShi();
        while (true){
            System.out.println("猜：");
            String c=new Scanner(System.in).nextLine();
            String j =biJiao(c, r);
            System.out.println(j);
            if (caiDui(j)){
                break;
            }

        }
    }
    public abstract String suiJi();

    public abstract void tiShi();

    public abstract String biJiao(String c, String r);

    public abstract boolean caiDui(String j);
}
