/***********************************************
 * File Name: Test01
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 04 06 2019 11:48
 ***********************************************/

package com.javabase.day14.day1403;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
       Thread thread=new Thread(new Temp());
       thread.start();
       new Scanner(System.in).nextLine();
       thread.interrupt();

    }

    static class Temp implements Runnable {
        @Override
        public void run() {
            Thread thread=Thread.currentThread();
            String n=thread.getName();
            for (int i=0;i<100000;i++){
                System.out.println(n+" : "+i);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("hahahah");
                    break;
                }
            }
        }
    }
}
