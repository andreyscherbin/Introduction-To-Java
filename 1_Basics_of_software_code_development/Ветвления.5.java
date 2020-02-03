package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    /*
     * Вычислить значение функции
     */
    public static void main(String[] args) {

        double x = 0, y = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of the variable x: ");
        x = in.nextInt();
        if (x <= 3) {
            y = pow(x, 2) - 3 * x + 9;
        } else {
            y = 1 / (pow(x, 3) + 6);
        }
        System.out.printf("The value of the function F(x) is %f", y);
    }
}
