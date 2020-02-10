package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Два простых числа называются близнецами, если они отличаются друг от друга на 2(например 41 и 43). Найти
     * и напечатать все пары близнецов из отрезка [n,2n], где n - заданное натуральное число больше 2. Для решения
     * задачи использовать декомпозицию.
     */
    public static void primeNumbers(int n) {

        for (int i = n; i <= 2 * n; i++) {
            boolean flagPrimeNumber = true;
            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    flagPrimeNumber = false;
                }
            }
            if (flagPrimeNumber && i + 2 <= 2 * n) {
                for (int j = i + 2 - 1; j > 1; j--) {
                    if ((i + 2) % j == 0) {
                        flagPrimeNumber = false;
                    }
                }
                if (flagPrimeNumber) {
                    System.out.printf("(%d,%d)\n", i, i + 2);
                }
            }
        }
    }

    public static void main(String[] args) {

        int n = 0;
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter n = ");
        while (n <= 2) {
            n = in.nextInt();
        }
        primeNumbers(n);
    }
}
