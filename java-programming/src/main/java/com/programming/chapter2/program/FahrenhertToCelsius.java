/***********************************************
 * File Name: FahrenhertToCelsius
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 25 06 2019 15:58
 ***********************************************/

package com.programming.chapter2.program;

import java.util.Scanner;

public class FahrenhertToCelsius {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit=scanner.nextDouble();

        double celsius=(5.0/9)*(fahrenheit-32);
        System.out.println("Fahrenheit "+fahrenheit+" is "+celsius+" in Celsius");
    }
}
