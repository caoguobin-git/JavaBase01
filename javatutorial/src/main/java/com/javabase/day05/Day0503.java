/***********************************************
 * File Name: Day0503
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 14:04
 ***********************************************/

package com.javabase.day05;

public class Day0503 {
    public static void main(String[] args) {

        char[][] a = {
                {'渭','城','朝','雨','浥','轻','尘'},
                {'客','舍','青','青','柳','色','新'},
                {'劝','君','更','尽','一','杯','酒'},
                {'西','出','阳','关','无','故','人'}
        };
        for (int i=0;i<a[0].length;i++){
            for (int j=a.length-1;j>=0;j--){
                System.out.print(a[j][i]);
            }
            System.out.println();
        }
    }
}
