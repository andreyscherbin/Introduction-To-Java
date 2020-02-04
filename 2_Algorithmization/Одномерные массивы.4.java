package com.company;

import java.util.Scanner;

public class Main {

    /*
     * Даны действительные числа a1,a2,...,an. Поменять местами наибольший и наименьший элементы.
     */
    public static void main(String[] args) {

        int N = 0, indexMax = 0, indexMin = 0;
        double max = 0, min = 0;
        double[] a;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N: ");
        N = in.nextInt();
        a = new double[N];
        for (int i = 0; i < N; i++) {
            System.out.printf("Enter a[%d]: ", i);
            a[i] = in.nextDouble();
        }
        for (int i = 0; i < N; i++) {
            if (a[i] > max) {
                max = a[i];
                indexMax = i;
            }
            if (a[i] < min) {
                min = a[i];
                indexMin = i;
            }
        }
        a[indexMax] = min;
        a[indexMin] = max;
        for (int i = 0; i < N; i++) {
            System.out.printf("a[%d] = %f\n", i, a[i]);
        }

    }
}
