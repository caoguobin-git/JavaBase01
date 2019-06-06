/***********************************************
 * File Name: ComputeAndInterpretBMI
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 06 06 2019 16:02
 ***********************************************/

package com.programming.chapter3.program;

import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble() * 0.45359237;
        System.out.println("Enter height in inches: ");
        double height = input.nextDouble() * 0.0254;
        double bmi=weight/Math.pow(height, 2);
        String result;
        System.out.println(bmi);
        if (bmi<18.5){
            result="偏瘦";
        }else if (bmi<25.0){
            result="正常";
        }else if (bmi<30.0){
            result="超重";
        }else {
            result="过胖";
        }
        System.out.println(result);

    }
}
