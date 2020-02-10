package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Задан массив D. Определить следующие суммы: D[1]+D[2]+D[3];D[3]+D[4]+D[5];D[4]+D[5]+D[6].
     * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
     * массива с номерами от k до m.
     */
    public static int summ(int[] D, int k, int size) {

        int summ = 0;
        if (k - 1 + 3 > size) {
            return summ;
        } else {
            for (int i = 0; i < 3; i++) {
                summ += D[k - 1];
                k++;
            }
            return summ;
        }
    }

    public static void main(String[] args) {

        int n = 0, k = 0;
        int[] D;
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter n = ");
        n = in.nextInt();
        System.out.printf("Enter k = ");
        k = in.nextInt();
        D = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("D[%d] = ", i);
            D[i] = in.nextInt();
        }
        System.out.printf("summ = %d", summ(D, k, n));
    }
}
