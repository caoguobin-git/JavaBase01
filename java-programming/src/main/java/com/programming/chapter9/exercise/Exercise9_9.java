/***********************************************
 * File Name: Exercise9_3
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 21 06 2019 9:35
 ***********************************************/

package com.programming.chapter9.exercise;

public class Exercise9_9 {
    public static void main(String[] args) {
       RegularPolygon regularPolygon1=new RegularPolygon();
        System.out.println(regularPolygon1.getPerimeter());
        System.out.println(regularPolygon1.getArea());
        RegularPolygon polygon=new RegularPolygon(6,4);
        System.out.println(polygon.getPerimeter());
        System.out.println(polygon.getArea());
        RegularPolygon regularPolygon=new RegularPolygon(10,4,5.6,7.8);
        System.out.println(regularPolygon.getPerimeter());
        System.out.println(regularPolygon.getArea());
    }
}
