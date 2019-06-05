/***********************************************
 * File Name: Point
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 15:17
 ***********************************************/

package com.javabase.day06.day0606;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public double distance(){
        return Math.sqrt(x*x+y*y);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"x\":")
                .append(x);
        sb.append(",\"y\":")
                .append(y);
        sb.append('}');
        return sb.toString();
    }
}
