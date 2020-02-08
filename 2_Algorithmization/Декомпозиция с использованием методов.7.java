package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
     */
    public static int factorial(int number) {

        if (number > 0) {
            return number * factorial(number - 1);
        }
        return 1;
    }

    public static void main(String[] args) {

        int summ = 0;
        for (int i = 1; i <= 9; i++) {
            if (i % 2 != 0) {
                summ += factorial(i);
            }
        }
        System.out.printf("The sum of the factorials of all odd numbers from 1 to 9 = %d ", summ);
    }
}
