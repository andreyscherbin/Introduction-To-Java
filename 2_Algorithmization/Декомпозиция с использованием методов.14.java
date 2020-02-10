package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная
     * в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать
     * декомпозицию
     */
    public static void armstrongNumber(int k) {

        for (int i = 1; i <= k; i++) {
            int j = i;
            double summOfDigits = 0;
            int numberOfDigits = 0;
            double value = j;
            double digit = 0;
            while (value > 0) {
                value /= 10;
                j /= 10;
                digit = (value - j) * 10;
                value = j;
                summOfDigits += digit;
                numberOfDigits++;
            }
            if (i == (int) Math.round(pow(summOfDigits, numberOfDigits))) {
                System.out.printf("%d ", i);
            }
        }
    }

    public static void main(String[] args) {

        int k = 0;
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter k = ");
        k = in.nextInt();
        armstrongNumber(k);
    }
}
