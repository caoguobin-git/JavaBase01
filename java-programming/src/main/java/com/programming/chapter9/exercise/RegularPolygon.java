/***********************************************
 * File Name: RegularPolygon
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 21 06 2019 10:10
 ***********************************************/

package com.programming.chapter9.exercise;

public class RegularPolygon {
    private int n;
    private double side=1;
    private double x=0;
    private double y=0;

    public RegularPolygon() {
        this.n=4;
    }

    public RegularPolygon(int n,double side) {
        this(n,side,0,0);
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter(){
        return n*side;
    }

    public double getArea(){
        return (n*Math.pow(side, 2))/(4*Math.tan(Math.PI/n));
    }
}
