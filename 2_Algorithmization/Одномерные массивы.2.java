package com.company;

import java.util.Scanner;

public class Main {

    /*
     * Дана последовательность действительных чисел a1,a2,...,an. Заменить все ее члены, большие данного Z
     * этим числом. Подсчитать количество замен.
     */
    public static void main(String[] args) {

        int n = 0, replacement = 0;
        double Z = 0;
        double[] a;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n,Z: ");
        n = in.nextInt();
        Z = in.nextDouble();
        a = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter a[%d]: ", i);
            a[i] = in.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] > Z) {
                a[i] = Z;
                replacement++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = %f\n", i, a[i]);
        }
        System.out.printf("replacement = %d", replacement);

    }
}
