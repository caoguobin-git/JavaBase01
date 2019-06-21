/***********************************************
 * File Name: Triangle
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 21 06 2019 17:23
 ***********************************************/

package com.programming.chapter11.exercise;

import com.programming.chapter10.program.SimpleGeometricObject;

public class Triangle extends SimpleGeometricObject {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    public Triangle(){

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea(){
        return 1.0;
    }

    public double getPerimeter(){
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"side1\":")
                .append(side1);
        sb.append(",\"side2\":")
                .append(side2);
        sb.append(",\"side3\":")
                .append(side3);
        sb.append('}');
        return sb.toString();
    }
}
