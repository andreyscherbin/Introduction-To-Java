package com.company;

import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    /*
     * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых
     * больше или равен заданному e. Общий член ряда имеет вид: An = 1/2^n + 1/3^n
     */
    public static void main(String[] args) {

        double summ = 0, a = 0, e = 0;
        int n = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of the number e: ");
        e = in.nextDouble();
        do {
            a = 1 / pow(2, n) + 1 / pow(3, n);
            a = abs(a);
            if (a >= e) {
                summ += a;
            }
            n++;
        } while (a >= e);
        System.out.printf("The sum of the numbers is = %f", summ);
    }
}
