/***********************************************
 * File Name: ShowCurrentTime
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 11:26
 ***********************************************/

package com.programming.chapter2.program;

public class ShowCurrentTime {
    public static void main(String[] args) {
        long totalMilliseconds=System.currentTimeMillis();
        long totalSeconds=totalMilliseconds/1000;
        long secondCurrent=totalSeconds%60;
        long totalMinutes=totalSeconds/60;
        long minuteCurrent=totalMinutes%60;
        long totalHour=totalMinutes/60;
        long hourCurrent=totalHour%24;
        System.out.println(hourCurrent+":"+minuteCurrent+":"+secondCurrent);

        int a=1;
        a+=a+1;
        System.out.println(a);
    }
}
