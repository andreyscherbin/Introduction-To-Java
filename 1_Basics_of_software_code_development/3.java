package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    /*
     * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
     * (sinx + cosy)/(cosx-siny)*(tgxy)
     */
    public static void main(String[] args) {

        double x = 0, y = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of the variable x: ");
        x = in.nextDouble();
        System.out.print("Enter the value of the variable y: ");
        y = in.nextDouble();
        double z = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);
        System.out.printf("The value of the function is: %f \n", z);
    }
}
