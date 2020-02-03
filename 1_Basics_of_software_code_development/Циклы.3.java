package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    /*
     * Найти сумму квадратов первых ста чисел.
     */
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = i*i + sum;
        }
        System.out.printf("Sum of squares 1 to 100 = %d",sum);
    }
}
