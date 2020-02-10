package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких действий
     * надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
     */
    public static void actionCounter(int number) {

        int actionCounter = 0;
        while (number != 0) {
            double summOfDigits = 0;
            int copyNumber = number;
            double value = number;
            double digit = 0;
            double max = 0;
            while (value > 0) {
                value /= 10;
                copyNumber /= 10;
                digit = (value - copyNumber) * 10;
                value = copyNumber;
                summOfDigits += digit;
            }
            number -= Math.round(summOfDigits);
            actionCounter++;
        }
        System.out.printf("actionCounter = %d", actionCounter);
    }

    public static void main(String[] args) {

        int number = 0;
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter n = ");
        number = in.nextInt();
        actionCounter(number);
    }
}
