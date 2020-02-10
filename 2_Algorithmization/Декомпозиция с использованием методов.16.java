package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. Определить
     * также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
     */
    public static void summ(int n) {

        int summ = 0;
        int counterEvenDigits = 0;

        for (int i = (int) pow(10, n - 1); i <= pow(10, n) - 1; i++) {
            int j = i;
            boolean flagOddDigits = true;
            double value = j;
            double digit = 0;
            double max = 0;
            while (value > 0) {
                value /= 10;
                j /= 10;
                digit = (value - j) * 10;
                value = j;
                if ((int) Math.round(digit) % 2 == 0) {
                    flagOddDigits = false;
                }
            }
            if (flagOddDigits) {
                summ += i;
            }
        }
        double value = summ;
        int copySumm = summ;
        double digit = 0;
        while (value > 0) {
            value /= 10;
            copySumm /= 10;
            digit = (value - copySumm) * 10;
            value = copySumm;
            if ((int) Math.round(digit) % 2 == 0) {
                counterEvenDigits++;
            }
        }
        System.out.printf("summ = %d, counterEvenDigits = %d", summ, counterEvenDigits);
    }

    public static void main(String[] args) {

        int n = 0;
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter n = ");
        n = in.nextInt();
        summ(n);
    }
}
