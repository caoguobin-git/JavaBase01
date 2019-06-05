/***********************************************
 * File Name: Point3D
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 15:17
 ***********************************************/

package com.javabase.day06.day0606;

public class Point3D extends Point {
    int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public double distance() {
        return Math.sqrt(super.distance() * super.distance() + z * z);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"z\":")
                .append(z);
        sb.append(",\"x\":")
                .append(x);
        sb.append(",\"y\":")
                .append(y);
        sb.append('}');
        return sb.toString();
    }
}
