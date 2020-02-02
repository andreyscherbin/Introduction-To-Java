package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    /*
     * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
     * (b+√(b^2 + 4ac)) / 2a - a^3*c + b^-2
     */
    public static void main(String[] args) {

        double a = 0, b = 0, c = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of the variable a: ");
        a = in.nextDouble();
        System.out.print("Enter the value of the variable b: ");
        b = in.nextDouble();
        System.out.print("Enter the value of the variable c: ");
        c = in.nextDouble();
        double z = (b + sqrt(pow(b, 2) + 4 * a * c)) / 2 * a - pow(a, 3) * c + pow(b, -2);
        System.out.printf("The value of the function is: %f \n", z);
    }
}
