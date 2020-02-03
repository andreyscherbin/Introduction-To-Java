package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    /*
     * Вычислить значения функции на отрезке [a,b] с шагом h:
     * y = x, x > 2
     * y = -x, x <= 2
     */
    public static void main(String[] args) {

        int a = 0, b = 0, h = 0, y = 0, x = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the values of the variables a,b,h: ");
        a = in.nextInt();
        b = in.nextInt();
        h = in.nextInt();
        for (x = a; x <= b; x = x + h) {
            if (x > 2) {
                y = x;
                System.out.printf("The value of the function is %d\n", y);
            } else {
                y = -x;
                System.out.printf("The value of the function is %d\n", y);
            }
        }
    }
}
