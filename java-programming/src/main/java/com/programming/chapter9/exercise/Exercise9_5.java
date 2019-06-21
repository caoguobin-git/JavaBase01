/***********************************************
 * File Name: Exercise9_3
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 21 06 2019 9:35
 ***********************************************/

package com.programming.chapter9.exercise;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exercise9_5 {
    public static void main(String[] args) {
        GregorianCalendar calendar=new GregorianCalendar();
        System.out.println(calendar.get(Calendar.YEAR)+" "+(calendar.get(Calendar.MONTH)+1)+" "+calendar.get(Calendar.DAY_OF_MONTH));
        calendar.setTimeInMillis(1234567898765L);
        System.out.println(calendar.get(Calendar.YEAR)+" "+(calendar.get(Calendar.MONTH)+1)+" "+calendar.get(Calendar.DAY_OF_MONTH));
    }
}
