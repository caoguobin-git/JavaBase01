/***********************************************
 * File Name: Test
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 15:19
 ***********************************************/

package com.javabase.day06.day0606;

public class Test {
    public static void main(String[] args) {
        Point point=new Point3D(3,4,5);
        System.out.println(point.distance());
        System.out.println(point);
        Point3D point3D1= (Point3D) point;
        point3D1.z=3;
        System.out.println(point3D1);
        System.out.println(point3D1.distance());
        Point3D point3D=new Point3D(3, 3, 3);
        System.out.println(point3D.distance());
        System.out.println(point3D);
    }
}
